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

/**
 *
 * @author IVAN
 */
public class ActivoDAO {

    private Conexion conexion;
    private static EntityManager em;
    
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
    
    public List<Activo> verificarEstado() {
        this.em = conexion.getEM();
        List<Activo> activos = new ArrayList<>();
        try {
            em.getTransaction().begin();
            activos = em.createQuery("SELECT a FROM Activo a", Activo.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return activos;
    }
}
