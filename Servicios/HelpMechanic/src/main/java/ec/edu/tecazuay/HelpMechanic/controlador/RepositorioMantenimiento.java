/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.tecazuay.HelpMechanic.controlador;

import ec.edu.tecazuay.HelpMechanic.modelo.Mantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface RepositorioMantenimiento extends JpaRepository<Mantenimiento, Long>{
    @Query("select a from Mantenimiento a where a.nombreMantenimiento = :nombreMantenimiento")
    Mantenimiento leerNombre(@Param("nombreMantenimiento") String nombreMantenimiento);
}
