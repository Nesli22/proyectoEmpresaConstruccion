/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyectoconstructora_datos;

import Dominio.Activo;
import Dominio.Persona;
import java.util.List;

/**
 *
 * @author IVAN
 */
public interface IDatos {
      public Boolean registrarActivo(Activo activo);
      public List<Activo> consultarEstado(String criterio);
      public List<Persona> recuperarPersonas();
      public Boolean modificarActivo(Activo Activo);
}
