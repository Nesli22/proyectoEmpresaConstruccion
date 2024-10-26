/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import clases.dominio.Persona;
import datos.FachadaDatos;
import interfaces.IDatos;
import java.util.List;

/**
 *
 * @author IVAN
 */
public class ControlPersona {
    
    public IDatos datos;

    public ControlPersona() {
        this.datos = new FachadaDatos();
    }
    
      public List<Persona>  recuperarPersonas() {
       return datos.recuperarPersonas();
    }
}
