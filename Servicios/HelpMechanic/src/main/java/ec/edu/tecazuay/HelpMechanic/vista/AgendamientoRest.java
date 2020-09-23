package ec.edu.tecazuay.HelpMechanic.vista;

import ec.edu.tecazuay.HelpMechanic.controlador.RepositorioAgendamiento;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ec.edu.tecazuay.HelpMechanic.modelo.Agendamiento;


@RestController
@RequestMapping("/Agendamiento")
public class AgendamientoRest {

    @Autowired
    RepositorioAgendamiento repositorioAgenda;

    @CrossOrigin
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<Agendamiento> listar() {
        return repositorioAgenda.findAll();
    }

    @CrossOrigin
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public Agendamiento guardar(@RequestBody Agendamiento idAgendamiento) {
        return repositorioAgenda.save(idAgendamiento);
    }
    
    @CrossOrigin
    @RequestMapping(value = "/{idAgendamiento}", method = RequestMethod.GET)
    @ResponseBody
    public Agendamiento leer(@PathVariable Long idAgendamiento) {
        return repositorioAgenda.getOne(idAgendamiento);
    }
    @CrossOrigin
    @RequestMapping(value = "/{idAgendamiento}", method = RequestMethod.DELETE)
    @ResponseBody
    public void borrar(@PathVariable Long idAgendamiento) {
        repositorioAgenda.deleteById(idAgendamiento);
    }

    @CrossOrigin
    @RequestMapping(value = "/PorPlaca/{placa}", method = RequestMethod.GET)
    @ResponseBody
    public List<Agendamiento> obtenerPorPlaca(@PathVariable String placa) {
        return repositorioAgenda.leerPlaca(placa);
    }
    
    @CrossOrigin
    @RequestMapping(value = "/PorCliente/{nombre}/{apellido}", method = RequestMethod.GET)
    @ResponseBody
    public List<Agendamiento> obtenerPorCliente(@PathVariable String nombre, @PathVariable String apellido) {
        return repositorioAgenda.leerCliente(nombre, apellido);
    }
    
    @CrossOrigin
    @RequestMapping(value = "/PorEstado/{estado}", method = RequestMethod.GET)
    @ResponseBody
    public List<Agendamiento> obtenerPorEstado(@PathVariable String estado) {
        return repositorioAgenda.leerEstado(estado);
    }
}
