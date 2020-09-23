package ec.edu.tecazuay.HelpMechanic.vista;

import ec.edu.tecazuay.HelpMechanic.modelo.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ec.edu.tecazuay.HelpMechanic.controlador.RepositorioUsuario;

@RestController
@RequestMapping("/Usuario")
public class UsuarioRest {

    @Autowired
    RepositorioUsuario repositorioUsuario;

    @CrossOrigin
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<Usuario> listar() {
        return repositorioUsuario.findAll();
    }

    @CrossOrigin
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public Usuario guardar(@RequestBody Usuario idUsuario) {
        return repositorioUsuario.save(idUsuario);
    }

    @CrossOrigin
    @RequestMapping(value = "/{idUsuario}", method = RequestMethod.GET)
    @ResponseBody
    public Usuario leer(@PathVariable Long idUsuario) {
        return repositorioUsuario.getOne(idUsuario);
    }

    @CrossOrigin
    @RequestMapping(value = "/{idUsuario}", method = RequestMethod.DELETE)
    @ResponseBody
    public void borrar(@PathVariable Long idUsuario) {
        repositorioUsuario.deleteById(idUsuario);
    }

    //metodo para comparar usuario y contraseña
    @CrossOrigin
    @RequestMapping(value = "/{nombreUsuario}/{contrasena}", method = RequestMethod.GET)
    @ResponseBody
    public Usuario login(@PathVariable String nombreUsuario, @PathVariable String contrasena) {
        return repositorioUsuario.validarUsuario(nombreUsuario, contrasena);
    }
    
    @CrossOrigin
    @RequestMapping(value = "/nombreUsuario/{nombreUsuario}", method = RequestMethod.GET)
    @ResponseBody
    public Usuario leerPorNombreUsuario(@PathVariable String nombreUsuario) {
        return repositorioUsuario.leerUsuario(nombreUsuario);
    }
}
