package trabajosPracticos.tp10.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import trabajosPracticos.tp10.entidades.Persona;


public interface PersonaRepository extends JpaRepository<Persona, Long> {
    public List<Persona> findByNombreAndApellido(String nombre, String apellido);

}
