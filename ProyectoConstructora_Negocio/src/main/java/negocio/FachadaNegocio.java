/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import interfaces.INegocio;
import dominio.Activo;
import dominio.Alerta;
import dominio.Mantenimiento;
import dominio.Persona;
import java.util.List;

/**
 *
 * @author IVAN
 */
public class FachadaNegocio implements INegocio {

    private ControlActivo activ = new ControlActivo();
    private ControlPersona persona = new ControlPersona();
    private ControlMantenimiento mant = new ControlMantenimiento();
    private ControlAlertas alert= new ControlAlertas();
    
    @Override
    public Boolean registrarActivo(Activo activo) {
      return activ.registarActivo(activo);
    }

    @Override
    public List<Persona> recuperarPersonas() {
       return persona.recuperarPersonas();
    }

    @Override
    public List<Activo> consultarEstado(String criterio) {
       return this.activ.consultarEstado(criterio);
    }

    @Override
    public Boolean editarActivo(Activo activo) {
       return activ.editarActivo(activo);
    }

    @Override
    public List<Activo> consultarActivos() {
        return activ.consultarActivos();
    }

    @Override
    public Boolean eliminarActivoPorId(Long id) {
        return activ.eliminarActivoPorId(id);
    }

    @Override
    public Activo buscarActivoId(Long id) {
        return activ.buscarActivoId(id);
    }

    @Override
    public Boolean registrarMantenimiento(Mantenimiento mantenimiento) {
       return mant.registarMantenimiento(mantenimiento);
    }

    @Override
    public List<Mantenimiento> consultarMantenimientos() {
        return mant.consultarMantenimiento();
    }

    @Override
    public List<Activo> recuperarActivoAlertas() {
       return activ.consultarActivoAlertas();
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
          return alert.eliminarAlertaPorActivo(activo);
    }
    
}
