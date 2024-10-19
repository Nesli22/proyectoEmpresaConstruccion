
package com.mycompany.proyectoconstructora_datos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author IVAN
 */
public class Conexion implements IConexion{
  
    private EntityManagerFactory emf;
    private String nombrePersistencia;

    public Conexion(String nombrePersistencia) {
        this.emf = Persistence.createEntityManagerFactory(nombrePersistencia);
    }
    
    @Override
    public EntityManager getEM() {
        return emf.createEntityManager();
    }
}
