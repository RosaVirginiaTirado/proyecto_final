
package ec.edu.tecazuay.HelpMechanic.controlador;

import ec.edu.tecazuay.HelpMechanic.modelo.Agendamiento;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface RepositorioAgendamiento extends JpaRepository<Agendamiento, Long>{
    
    @Query("select a from Agendamiento a where a.placa = :placa")
    List<Agendamiento> leerPlaca(@Param("placa") String placa);
    
    @Query("select a from Agendamiento a where a.nombre = :nombre and a.apellido = :apellido")
    List<Agendamiento> leerCliente(@Param("nombre") String nombre, @Param("apellido") String apellido);
    
    @Query("select a from Agendamiento a where a.estado = :estado")
    List<Agendamiento> leerEstado(@Param("estado") String estado);
    
}
