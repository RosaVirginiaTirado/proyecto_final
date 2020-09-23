package ec.edu.tecazuay.HelpMechanic.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Mantenimiento implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(unique = true)
   private Long idMantenimiento;
   @Column(unique = true)
   private String nombreMantenimiento;
   private String descripcion;

   
   @OneToMany(cascade = CascadeType.ALL)
   private List <Trabajo> listaTrabajos;

   @OneToOne(cascade = CascadeType.ALL)
   private Usuario usuario;

    public Long getIdMantenimiento() {
        return idMantenimiento;
    }

    public void setIdMantenimiento(Long idMantenimiento) {
        this.idMantenimiento = idMantenimiento;
    }

    public String getNombreMantenimiento() {
        return nombreMantenimiento;
    }

    public void setNombreMantenimiento(String nombreMantenimiento) {
        this.nombreMantenimiento = nombreMantenimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public List<Trabajo> getListaTrabajos() {
        return listaTrabajos;
    }

    public void setListaTrabajos(List<Trabajo> listaTrabajos) {
        this.listaTrabajos = listaTrabajos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
