package model;

public class Enfermera extends Usuario {

    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Enfermera(String nombre, String email, String direccion, String numeroTelefonico) {
       super (nombre, email, direccion, numeroTelefonico);


    }

    @Override
    public void mostrarDatosUsuarios() {
        System.out.println("Hospital: Cruz verde");
        System.out.println("departamente: Pediatria");

    }
}
