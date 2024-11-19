/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import clases.dominio.Activo;
import clases.dominio.Persona;
import java.util.List;

/**
 *
 * @author IVAN
 */
public interface INegocio {

    public Boolean registrarActivo(Activo activo);
    
    public List<Activo> consultarEstado(String criterio);
  
    public List<Persona> recuperarPersonas();
    
    public Boolean editarActivo(Activo activo);

    public List<Activo> consultarActivos();
    
    public Boolean eliminarActivoPorId(Long id);

}
