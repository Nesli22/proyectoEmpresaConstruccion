/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Activo;
import dominio.Alerta;
import dominio.Mantenimiento;
import dominio.Persona;
import java.util.List;

/**
 *
 * @author IVAN
 */
public interface INegocio {

    public Boolean registrarActivo(Activo activo);

    public List<Activo> consultarEstado(String criterio);

    public List<Persona> recuperarPersonas();

    public Boolean editarActivo(Activo activo);

    public List<Activo> consultarActivos();

    public Boolean eliminarActivoPorId(Long id);

    public Activo buscarActivoId(Long id);

    public Boolean registrarMantenimiento(Mantenimiento mantenimiento);

    public List<Mantenimiento> consultarMantenimientos();

    public List<Activo> recuperarActivoAlertas();

    public List<Alerta> recuperarAlertasSinRevisar();

    public Boolean registrarAlerta(Alerta alerta);

    public Boolean actualizarEstadoARevisadoPorActivo(Activo activo);

    public Boolean eliminarAlertaPorActivo(Activo activo);

}
