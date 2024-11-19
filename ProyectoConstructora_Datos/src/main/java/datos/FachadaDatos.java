/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import interfaces.IDatos;
import clases.dominio.Activo;
import clases.dominio.Mantenimiento;
import clases.dominio.Persona;
import java.util.List;

/**
 *
 * @author IVAN
 */
public class FachadaDatos implements IDatos{

    private PersonaDAO persona = new PersonaDAO();
    private ActivoDAO activ = new ActivoDAO();
    private MantenimientoDAO mant = new MantenimientoDAO();
    
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
<<<<<<< Updated upstream
=======

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
>>>>>>> Stashed changes
    
}
