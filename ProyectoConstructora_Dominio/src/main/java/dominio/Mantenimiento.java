/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author IVAN
 */

import java.time.LocalDateTime;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.util.Date;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

@Entity
@Table(name = "Mantenimiento")
public class Mantenimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechayhora;
   
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "activo_id")
    private Activo activo;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Calendar getFecha() { return fechayhora; }
    public void setFecha(Calendar fecha) { this.fechayhora = fecha; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Activo getActivo() { return activo; }
    public void setActivo(Activo activo) { this.activo = activo; }
    

    public Mantenimiento(Long id, Calendar fechayhora, String tipo, Activo activo) {
        this.id = id;
        this.fechayhora = fechayhora;
        this.tipo = tipo;
        this.activo = activo;
    }
    
    

    public Mantenimiento() {
    }
  
}
