/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyectoconstructora_datos;

/**
 *
 * @author IVAN
 */
import Dominio.Persona;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion conexionBD = new Conexion("com.equipo6_proyectoEmpresaConstruccion_jar_1.0-SNAPSHOTPU");

        Persona tita = new Persona(1l, "joecalito", "cubano");

        conexionBD.getEM().getTransaction().begin();
        conexionBD.getEM().persist(tita);
        conexionBD.getEM().getTransaction().commit();
    }

}
