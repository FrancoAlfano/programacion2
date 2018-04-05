package tp1_p1;


public class Persona {
    private long dni;
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(long dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }
    
    public long getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    public void input(long d1, String a1, String n1){

        setApellido(a1);
        setDni(d1);
        setNombre(n1);
                
    }
    
    public String show(){
        getApellido();
        getDni();
        getNombre();
        
        return String.format("%d %s %s", dni, nombre, apellido);
    }
            

}
