/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
import dominio.Activo;
import datos.FachadaDatos;
import interfaces.IDatos;
import java.util.List;


/**
 *
 * @author IVAN
 */
public class ControlActivo {

    public IDatos datos;

    public ControlActivo() {
        this.datos = new FachadaDatos();
    }

    public Boolean registarActivo(Activo activo) {
        return datos.registrarActivo(activo);
    }
    
    public List<Activo> consultarEstado(String criterio){
        return datos.consultarEstado(criterio);
    }
    
    public Boolean editarActivo(Activo activo){
        return datos.modificarActivo(activo);
    }

    
    public List<Activo> consultarActivos(){
        return datos.consultarActivos();
    }
    
    public Boolean eliminarActivoPorId(Long id){
        return datos.eliminarActivoPorId(id);
    }
    
    public Activo buscarActivoId(Long Id){
        return datos.buscarActivoId(Id);
    }

}
