/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import clases.dominio.Mantenimiento;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Juan
 */
public class MantenimientoDAO {

     private Conexion conexion;
    
    public MantenimientoDAO() {
         conexion = new Conexion("com.equipo6_proyectoEmpresaConstruccion_jar_1.0-SNAPSHOTPU");
    }
    
     public List<Mantenimiento> obtenerMantenimientos() {
        EntityManager em = conexion.getEM();
        try {
            List<Mantenimiento> mantenimientos = em.createQuery("SELECT p FROM Mantenimiento p", Mantenimiento.class)
                    .getResultList();
            return mantenimientos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
     
      public boolean registrarActivo(Mantenimiento mantenimiento) {
        EntityManager em = conexion.getEM();
        try {
            em.getTransaction().begin();

            em.persist(mantenimiento);
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
    
}
