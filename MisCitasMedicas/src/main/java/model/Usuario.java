package model;

public abstract class Usuario {

    //Atributos de la clase Usuario
    private int id;
    private String nombre;
    private String email;
    private String direccion;
    private String numeroTelefonico;
    //se crea el metodo para Usurio

    public Usuario(String nombre, String email, String direccion, String numeroTelefonico) {
        this.nombre = nombre;
        this.email = email;
        this.direccion=direccion;
        this.numeroTelefonico=numeroTelefonico;


        //get y set para Usuario

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTeleono() {
        return numeroTelefonico;
    }

    //se da una logica pta numero de telefono
    public void setNumeroTeleono(String numeroTelefonico) {
        if (numeroTelefonico.length() > 8) {
            System.out.println("El numero telefonico debe ser de 8 digitos");
        } else if (numeroTelefonico.length() == 8) {
            this.numeroTelefonico = numeroTelefonico;
        }
    }
    @Override
    public String toString() {
        return "Usuario : " + nombre + "\nEmail: " + email+ "\nDireccion: "+ direccion + "\nTelefono: " + numeroTelefonico;

    }

    //definir un metodo abstracto, solo puede ser heredada
    public abstract void mostrarDatosUsuarios();


}
