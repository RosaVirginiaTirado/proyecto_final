
package ec.edu.tecazuay.HelpMechanic.controlador;

import ec.edu.tecazuay.HelpMechanic.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
    
    @Query("select u from Usuario u where u.nombreUsuario = :usuario and u.contrasena = :pass ")
    Usuario validarUsuario(@Param("usuario") String usuario, @Param("pass") String pass);  
    
    @Query("select u from Usuario u where u.nombreUsuario = :usuario")
    Usuario leerUsuario(@Param("usuario") String usuario);    
}
