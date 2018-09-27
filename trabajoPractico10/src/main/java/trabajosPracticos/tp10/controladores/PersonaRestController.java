package trabajosPracticos.tp10.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trabajosPracticos.tp10.entidades.Persona;
import trabajosPracticos.tp10.repositorios.PersonaRepository;


@RestController
@RequestMapping("/personarest")
public class PersonaRestController {

    @Autowired
    PersonaRepository persRep;

    @GetMapping("/all")
    public List<Persona> leerTodos() {
        List<Persona> personas = persRep.findAll();
        return personas;
    }

    @GetMapping("buscar/{id}")
    public Persona leerUno(@PathVariable(name="id") Long id) {
        Persona p = persRep.findById(id).orElse(null);
        return p;
    }

    @PostMapping("/add")
    public Persona grabar(@Valid @RequestBody Persona persona) {
        Persona nueva = persRep.save(persona);
        return nueva;
    }
    
    @DeleteMapping("/remove/{id}")
    public Persona borrar(@PathVariable(name = "id") Long id) {
        Persona p = persRep.findById(id).orElse(null);

        persRep.delete(p);

        return p;
    }

    @PutMapping("/update/{id}")
    public Persona update(@PathVariable(name = "id") Long id,@Valid @RequestBody Persona persDatos) {
        Persona p = persRep.findById(id).orElse(null);
        p.setApellido(persDatos.getApellido());
        p.setNombre(persDatos.getNombre());
        
        Persona persActualizada = persRep.save(p);
        
        return persActualizada;
    }

}
