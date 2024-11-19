/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import clases.dominio.Activo;
import clases.dominio.Mantenimiento;
import clases.dominio.Persona;
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
<<<<<<< Updated upstream
=======
      public List<Activo> consultarActivos();
      public Boolean eliminarActivoPorId(Long id);
      public Activo buscarActivoId(Long id);
      public List<Mantenimiento> consultarMantenimientos();
      public Boolean registrarMantenimiento(Mantenimiento mantenimiento);
>>>>>>> Stashed changes
}
