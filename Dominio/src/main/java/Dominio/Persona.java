/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author IVAN
 */


@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    
    private String cargo;

    @OneToMany(mappedBy = "responsable", cascade = CascadeType.ALL)
    private List<Activo> activos;

 
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Activo> getActivos() { return activos; }
    public void setActivos(List<Activo> activos) { this.activos = activos; }

    public Persona(Long id, String nombre, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.cargo=cargo;
        this.activos = new ArrayList<>();
        
    }

    public Persona() {
    }
}