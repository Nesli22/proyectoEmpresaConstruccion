/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoconstructora_datos;

import Dominio.Activo;
import Dominio.Persona;
import java.util.List;

/**
 *
 * @author IVAN
 */
public class FachadaDatos implements IDatos{

    private PersonaDAO persona = new PersonaDAO();
    private ActivoDAO activ = new ActivoDAO();
    
    @Override
    public Boolean registrarActivo(Activo activo) {
       return activ.registrarActivo(activo);
    }

    @Override
    public List<Persona> recuperarPersonas() {
       return persona.obtenerPersonas();
    }
    
}
