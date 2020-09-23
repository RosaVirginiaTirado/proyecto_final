package ec.edu.tecazuay.HelpMechanic.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Agendamiento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long idAgendamiento;

    private Date fechaIngresoCoche;
    private String fechaTrabajo; //Inicio del mantenimiento
    
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    
    private String placa;
    private String marca;
    
    private String estado; //Trabj, realizado o Trbj. pendiente
    
    @OneToOne()
    private Usuario usuario;
    
    @OneToOne()
    private Mantenimiento mantenimiento;

    public Long getIdAgendamiento() {
        return idAgendamiento;
    }

    public void setIdAgendamiento(Long idAgendamiento) {
        this.idAgendamiento = idAgendamiento;
    }

    public Date getFechaIngresoCoche() {
        return fechaIngresoCoche;
    }

    public void setFechaIngresoCoche(Date fechaIngresoCoche) {
        this.fechaIngresoCoche = fechaIngresoCoche;
    }

    public String getFechaTrabajo() {
        return fechaTrabajo;
    }

    public void setFechaTrabajo(String fechaTrabajo) {
        this.fechaTrabajo = fechaTrabajo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Mantenimiento getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(Mantenimiento mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    
    
}
