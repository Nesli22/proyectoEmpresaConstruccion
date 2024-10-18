/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoconstructora_negocio;

import Dominio.Persona;
import com.mycompany.proyectoconstructora_datos.FachadaDatos;
import com.mycompany.proyectoconstructora_datos.IDatos;
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
