/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.Entity;

@Entity
@Table(name = "Activo")
public class Activo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo;
    private String numSerie;
    private String costo;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona responsable;

    @OneToMany(mappedBy = "activo", cascade = CascadeType.ALL)
    private List<Mantenimiento> mantenimientos;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getNumSerie() { return numSerie; }
    public void setNumSerie(String numSerie) { this.numSerie = numSerie; }

    public String getCosto() { return costo; }
    public void setCosto(String costo) { this.costo = costo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Persona getResponsable() { return responsable; }
    public void setResponsable(Persona responsable) { this.responsable = responsable; }

    public List<Mantenimiento> getMantenimientos() { return mantenimientos; }
    public void setMantenimientos(List<Mantenimiento> mantenimientos) { this.mantenimientos = mantenimientos; }

    public Activo() {
    }

    public Activo(Long id, String nombre, String tipo, String numSerie, String costo, String estado, Persona responsable) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.numSerie = numSerie;
        this.costo = costo;
        this.estado = estado;
        this.responsable = responsable;
        this.mantenimientos = new ArrayList<>();
    }
    
    
    
    
}
