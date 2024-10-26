/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesNegocio;

import Dominio.Persona;
import ClasesDatos.FachadaDatos;
import InterfacesDatos.IDatos;
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
