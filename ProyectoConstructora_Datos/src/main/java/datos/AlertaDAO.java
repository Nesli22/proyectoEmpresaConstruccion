/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Activo;
import dominio.Alerta;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

public class AlertaDAO {

    private Conexion conexion;

    public AlertaDAO() {
        conexion = new Conexion("com.equipo6_proyectoEmpresaConstruccion_jar_1.0-SNAPSHOTPU");
    }

    public List<Alerta> recuperarAlertasSinRevisar() {
        EntityManager entityManager = null;
        List<Alerta> listaAlertasPendientes = new ArrayList<>();

        try {
            // Obtiene el EntityManager de la conexión
            entityManager = conexion.getEM();

            // Consulta para obtener las alertas con estado "Pendiente"
            listaAlertasPendientes = entityManager.createQuery(
                    "SELECT al FROM Alerta al WHERE al.estado = :estado", Alerta.class)
                    .setParameter("estado", "Pendiente")
                    .getResultList();

        } catch (Exception e) {
            System.err.println("Error al recuperar alertas pendientes: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }

        return listaAlertasPendientes;
    }
    
  public Boolean registrarAlerta(Alerta alerta) {
    EntityManager entityManager = null;
    boolean isSuccessful = false;

    try {
        // Obtener el EntityManager
        entityManager = conexion.getEM();
        entityManager.getTransaction().begin();

        // Asegurarse de que la alerta tiene un activo asociado
        if (alerta.getActivo() != null) {
            alerta.setEstado("Pendiente"); // Establecer estado de la alerta a Pendiente si no está establecido
        }

        // Persistir la alerta en la base de datos
        entityManager.persist(alerta);

        // Confirmar la transacción
        entityManager.getTransaction().commit();
        isSuccessful = true;

    } catch (Exception e) {
        // Manejo de errores y rollback en caso de fallo
        System.err.println("Error al registrar la alerta: " + e.getMessage());
        e.printStackTrace();
        if (entityManager != null && entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
        }
    } finally {
        if (entityManager != null) {
            entityManager.close();
        }
    }

    return isSuccessful;
}


    public Boolean actualizarEstadoARevisadoPorActivo(Activo activo) {
    EntityManager entityManager = null;
    boolean isSuccessful = false;

    try {
        // Obtener el EntityManager
        entityManager = conexion.getEM();
        entityManager.getTransaction().begin();

        // Consultar la alerta pendiente asociada al activo
        Alerta alerta = entityManager.createQuery(
                "SELECT al FROM Alerta al WHERE al.activo.id = :idActivo AND al.estado = :estado", Alerta.class)
                .setParameter("idActivo", activo.getId())
                .setParameter("estado", "Pendiente")
                .getSingleResult();

        if (alerta != null) {
            // Actualizar el estado de la alerta a "Revisado"
            alerta.setEstado("Revisado");

            // Sincronizar los cambios con la base de datos
            entityManager.merge(alerta);
            entityManager.getTransaction().commit();
            isSuccessful = true;
        } else {
            System.err.println("No se encontró ninguna alerta pendiente para el activo con ID: " + activo.getId());
        }

    } catch (NoResultException e) {
        System.err.println("No se encontró ninguna alerta pendiente para el activo con ID: " + activo.getId());
    } catch (Exception e) {
        // Manejo de errores y rollback en caso de fallo
        System.err.println("Error al actualizar el estado de la alerta: " + e.getMessage());
        e.printStackTrace();
        if (entityManager != null && entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
        }
    } finally {
        if (entityManager != null) {
            entityManager.close();
        }
    }

    return isSuccessful;
}


   public Boolean eliminarAlertasPorActivo(Activo activo) {
    EntityManager entityManager = null;
    boolean isSuccessful = false;

    try {
        // Obtener el EntityManager
        entityManager = conexion.getEM();
        entityManager.getTransaction().begin();

        // Consultar todas las alertas asociadas al activo
        List<Alerta> alertas = entityManager.createQuery(
                "SELECT al FROM Alerta al WHERE al.activo.id = :idActivo", Alerta.class)
                .setParameter("idActivo", activo.getId())
                .getResultList();

        if (!alertas.isEmpty()) {
            // Eliminar todas las alertas asociadas al activo
            for (Alerta alerta : alertas) {
                entityManager.remove(alerta);
            }
            entityManager.getTransaction().commit();
            isSuccessful = true;
        } else {
            System.err.println("No se encontraron alertas asociadas al activo con ID: " + activo.getId());
        }

    } catch (Exception e) {
        // Manejo de errores y rollback en caso de fallo
        System.err.println("Error al eliminar las alertas: " + e.getMessage());
        e.printStackTrace();
        if (entityManager != null && entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
        }
    } finally {
        if (entityManager != null) {
            entityManager.close();
        }
    }

    return isSuccessful;
}

    
    
}
