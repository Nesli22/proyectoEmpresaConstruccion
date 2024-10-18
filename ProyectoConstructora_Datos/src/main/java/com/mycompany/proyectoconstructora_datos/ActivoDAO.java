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
        EntityManager entiyManager = null;
        List<Activo> activos = new ArrayList<>();
        try {
            entiyManager = conexion.getEM();
            entiyManager.getTransaction().begin();
            activos = entiyManager.createQuery("SELECT a FROM Activo a", Activo.class).getResultList();
            entiyManager.getTransaction().commit(); 
            entiyManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            if (entiyManager != null && entiyManager.getTransaction().isActive()) {
                entiyManager.close();
            }
        }
        return activos;
    }
}
