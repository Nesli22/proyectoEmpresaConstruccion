/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoconstructora_datos;

import Dominio.Activo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

/**
 *
 * @author IVAN
 */
public class ActivoDAO {

    private Conexion conexion;
    
    public ActivoDAO() {
        conexion = new Conexion("com.equipo6_proyectoEmpresaConstruccion_jar_1.0-SNAPSHOTPU");
    }
    
    
    public boolean registrarActivo(Activo activo) {
        EntityManager em = conexion.getEM();
        try {
            em.getTransaction().begin();
          
            em.persist(activo);  
           em.getTransaction().commit(); 
            return true;
         } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); 
            }
            return false;
        }
    }

    public List<Activo> consultarEstado(String criterio) {
        EntityManager entityManager = null;
        List<Activo> listaActivos = new ArrayList<>();
        try {
            entityManager = conexion.getEM();
            entityManager.getTransaction().begin();

            listaActivos = entityManager.createQuery(
                    "SELECT a FROM Activo a WHERE a.numSerie LIKE :criterio OR a.nombre LIKE :criterio", Activo.class)
                    .setParameter("criterio", "%" + criterio + "%")
                    .getResultList();

            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (NoResultException e) {
            System.out.println("No se encontró ningún activo con el criterio especificado.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.close();
            }
        }
        return listaActivos;
    }
}
