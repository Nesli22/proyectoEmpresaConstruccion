/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoconstructora_datos;

import Dominio.Persona;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author IVAN
 */
public class PersonaDAO {

     private Conexion conexion;
    
    public PersonaDAO() {
         conexion = new Conexion("com.equipo6_proyectoEmpresaConstruccion_jar_1.0-SNAPSHOTPU");
    }
    
     public List<Persona> obtenerPersonas() {
        EntityManager em = conexion.getEM();
        try {
            List<Persona> personas = em.createQuery("SELECT p FROM Persona p", Persona.class)
                    .getResultList();
            return personas;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}
