/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoconstructora_negocio;

import Dominio.Activo;
import Dominio.Persona;
import java.util.List;

/**
 *
 * @author IVAN
 */
public class FachadaNegocio implements INegocio {

    private ControlActivo activ = new ControlActivo();
    private ControlPersona persona = new ControlPersona();
    
    @Override
    public Boolean registrarActivo(Activo activo) {
      return activ.registarActivo(activo);
    }

    @Override
    public List<Persona> recuperarPersonas() {
       return persona.recuperarPersonas();
    }

    @Override
    public List<Activo> verificarEstados() {
       return this.activ.verificarEstados();
    }

    
}
