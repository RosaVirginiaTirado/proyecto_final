package ec.edu.tecazuay.HelpMechanic.vista;

import ec.edu.tecazuay.HelpMechanic.controlador.RepositorioMantenimiento;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ec.edu.tecazuay.HelpMechanic.modelo.Mantenimiento;


@RestController
@RequestMapping("/mantenimiento")
public class MantenimientoRest {

    @Autowired
    RepositorioMantenimiento repositorioMantenimiento;
    
    @CrossOrigin
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<Mantenimiento> listar() {
        return repositorioMantenimiento.findAll();
    }

    @CrossOrigin
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public Mantenimiento guardar(@RequestBody Mantenimiento idMantenimiento) {
        return repositorioMantenimiento.save(idMantenimiento);
    }
    
    @CrossOrigin
    @RequestMapping(value = "/{idMantenimiento}", method = RequestMethod.GET)
    @ResponseBody
    public Mantenimiento leer(@PathVariable Long idMantenimiento) {
        return repositorioMantenimiento.getOne(idMantenimiento);
    }
    
    @CrossOrigin
    @RequestMapping(value = "/{idMantenimiento}", method = RequestMethod.DELETE)
    @ResponseBody
    public void borrar(@PathVariable Long idMantenimiento) {
        repositorioMantenimiento.deleteById(idMantenimiento);
    }
    
    @CrossOrigin
    @RequestMapping(value = "/PorNombre/{nombreMantenimiento}", method = RequestMethod.GET)
    @ResponseBody
    public Mantenimiento obtenerPorNombreMantenimiento(@PathVariable String nombreMantenimiento) {
        return repositorioMantenimiento.leerNombre(nombreMantenimiento);
    }
}
