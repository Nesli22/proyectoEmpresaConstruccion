/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import datos.FachadaDatos;
import dominio.Activo;
import dominio.Alerta;
import interfaces.IDatos;
import java.util.List;

/**
 *
 * @author IVAN
 */
public class ControlAlertas {
    
    
    public IDatos datos;

    public ControlAlertas() {
        this.datos = new FachadaDatos();
    }

    
     public  List<Alerta>  recuperarAlertasSinRevisar(){
        return datos.recuperarAlertasSinRevisar();
    }
     
     
      public Boolean registrarAlerta(Alerta alerta){
        return datos.registrarAlerta(alerta);
    }
     
    
      public Boolean actualizarEstadoARevisadoPorActivo(Activo activo){
        return datos.actualizarEstadoARevisadoPorActivo(activo);
    }
      
       public Boolean eliminarAlertaPorActivo(Activo activo){
        return datos.eliminarAlertaPorActivo(activo);
    }
}
