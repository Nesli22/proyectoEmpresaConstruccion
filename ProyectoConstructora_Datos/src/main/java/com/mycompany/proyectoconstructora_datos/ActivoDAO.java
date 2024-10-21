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
import javax.persistence.NonUniqueResultException;

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

    public boolean modificarActivo(Activo activo) {
        if (activo == null || activo.getId() == null) {
            System.out.println("Activo o ID no pueden ser nulos.");
            return false;  // Manejo de errores si activo o ID son nulos
        }

        EntityManager entityManager = null;

        try {
            entityManager = conexion.getEM();
            entityManager.getTransaction().begin();

            // Buscar el activo existente por su ID
            System.out.println("ID BUSCADO: " + activo.getId());
            Activo activoExistente = buscarActivoPorId(activo.getId());

            if (activoExistente != null) {
                // Actualizar los valores del objeto existente con los nuevos valores
                activoExistente.setNombre(activo.getNombre());
                activoExistente.setTipo(activo.getTipo());
                activoExistente.setNumSerie(activo.getNumSerie());
                activoExistente.setEstado(activo.getEstado());
                activoExistente.setFechaAdquisicion(activo.getFechaAdquisicion());

                // Hacer el merge para que JPA reconozca los cambios
                entityManager.merge(activoExistente);
                entityManager.getTransaction().commit();
                return true;  // Indica que la modificación fue exitosa
            } else {
                System.out.println("Activo no encontrado.");
                return false;  // Activo no encontrado
            }
        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback(); // Revertir en caso de error
            }
            e.printStackTrace();
            return false;  // Error durante la modificación
        } finally {
            if (entityManager != null) {
                entityManager.close();  // Asegúrate de cerrar el EntityManager
            }
        }
    }

    public Activo buscarActivoPorId(Long id) {
        if (id == null) {
            System.out.println("El ID no puede ser nulo.");
            return null;  // Manejo de errores si ID es nulo
        }

        Activo activoEncontrado = null;
        EntityManager entityManager = null;

        try {
            entityManager = conexion.getEM();
            activoEncontrado = entityManager.createQuery(
                    "SELECT a FROM Activo a WHERE a.id = :id", Activo.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } catch (NoResultException e) {
            System.out.println("No se encontró ningún activo con el id proporcionado.");
        } catch (NonUniqueResultException e) {
            System.out.println("Se encontró más de un activo con el mismo id.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close();  // Asegúrate de cerrar el EntityManager
            }
        }
        return activoEncontrado;
    }

}
