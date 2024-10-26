/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesNegocio;

import InterfacesNegocio.INegocio;
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
    public List<Activo> consultarEstado(String criterio) {
       return this.activ.consultarEstado(criterio);
    }

    @Override
    public Boolean editarActivo(Activo activo) {
       return activ.editarActivo(activo);
    }

    
}
