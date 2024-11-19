/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import interfaces.INegocio;
import clases.dominio.Activo;
import clases.dominio.Mantenimiento;
import clases.dominio.Persona;
import java.util.List;

/**
 *
 * @author IVAN
 */
public class FachadaNegocio implements INegocio {

    private ControlActivo activ = new ControlActivo();
    private ControlPersona persona = new ControlPersona();
    private ControlMantenimiento mant = new ControlMantenimiento();
    
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

<<<<<<< Updated upstream
=======
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

   
    

>>>>>>> Stashed changes
    
}
