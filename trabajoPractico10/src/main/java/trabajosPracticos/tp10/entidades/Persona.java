package trabajosPracticos.tp10.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "persona")
public class Persona {
	//define la primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //la hacemos auto incremental
    protected Long id;
    @NotBlank
    protected String nombre;
    @NotBlank
    protected String apellido;

    public Persona() {}

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
