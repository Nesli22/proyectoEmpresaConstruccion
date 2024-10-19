/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoconstructora_negocio;
import Dominio.Activo;
import com.mycompany.proyectoconstructora_datos.FachadaDatos;
import com.mycompany.proyectoconstructora_datos.IDatos;
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
}
