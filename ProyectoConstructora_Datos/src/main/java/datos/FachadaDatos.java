/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import interfaces.IDatos;
import dominio.Activo;
import dominio.Alerta;
import dominio.Mantenimiento;
import dominio.Persona;
import java.util.List;

/**
 *
 * @author IVAN
 */
public class FachadaDatos implements IDatos{

    private PersonaDAO persona = new PersonaDAO();
    private ActivoDAO activ = new ActivoDAO();
    private MantenimientoDAO mant = new MantenimientoDAO();
    private AlertaDAO alert = new AlertaDAO();
    
    @Override
    public Boolean registrarActivo(Activo activo) {
       return activ.registrarActivo(activo);
    }

    @Override
    public List<Persona> recuperarPersonas() {
       return persona.obtenerPersonas();
    }

    @Override
    public List<Activo> consultarEstado(String criterio) {
        return activ.consultarEstado(criterio);
    }

    @Override
    public Boolean modificarActivo(Activo Activo) {
        return activ.modificarActivo(Activo);
    }

    @Override
    public List<Activo> consultarActivos() {
        return activ.consultarActivos();
    }

    @Override
    public Boolean eliminarActivoPorId(Long id) {
        return activ.eliminarActivoPorID(id);
    }

    @Override
    public Activo buscarActivoId(Long id) {
        return activ.buscarActivoPorId(id);
    }

    @Override
    public List<Mantenimiento> consultarMantenimientos() {
       return mant.obtenerMantenimientos();

    }

    @Override
    public Boolean registrarMantenimiento(Mantenimiento mantenimiento) {
        return mant.registrarActivo(mantenimiento);
    }

    @Override
    public List<Activo> recuperarActivoAlertas() {
       return activ.consultarActivosNoOperativos();
    }

    @Override
    public List<Alerta> recuperarAlertasSinRevisar() {
      return alert.recuperarAlertasSinRevisar();
    }

    @Override
    public Boolean registrarAlerta(Alerta alerta) {
       return alert.registrarAlerta(alerta);
    }

    @Override
    public Boolean actualizarEstadoARevisadoPorActivo(Activo activo) {
       return alert.actualizarEstadoARevisadoPorActivo(activo);
    }

    @Override
    public Boolean eliminarAlertaPorActivo(Activo activo) {
       return alert.eliminarAlertasPorActivo(activo);
    }

  

}
