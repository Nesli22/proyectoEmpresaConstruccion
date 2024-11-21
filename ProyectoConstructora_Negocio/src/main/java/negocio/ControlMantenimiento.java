/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
import clases.dominio.Mantenimiento;
import datos.FachadaDatos;
import interfaces.IDatos;
import java.util.List;


/**
 *
 * @author IVAN
 */
public class ControlMantenimiento {

    public IDatos datos;

    public ControlMantenimiento() {
        this.datos = new FachadaDatos();
    }

    public Boolean registarMantenimiento(Mantenimiento mantenimiento) {
        return datos.registrarMantenimiento(mantenimiento);
    }
    
    public List<Mantenimiento> consultarMantenimiento(){
        return datos.consultarMantenimientos();
    }

}
