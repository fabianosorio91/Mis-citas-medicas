package model;

import java.util.SortedMap;

public class Paciente extends Usuario{
    //Atributos o variables propias del paciente


    private String fechaCumpleaños;
    private String peso;
    private String altura;
    private String tipoSangre;

    //metodo para paciente que extiendes de la clase usuario
    public Paciente(String nombre, String email, String direccion, String numeroTelefonico){
        super(nombre,email, direccion,numeroTelefonico );
    }


    //get y set de paciente
    public String getFechaCumpleaños() {
        return fechaCumpleaños;
    }

    public void setFechaCumpleaños(String fechaCumpleaños) {

        this.fechaCumpleaños = fechaCumpleaños;
    }

    public String getPeso() {

        return peso + "Kg";
    }

    public void setPeso(String peso) {

        this.peso = peso;
    }

    public String getAltura() {

        return altura + "mts";
    }

    public void setAltura(String altura) {

        this.altura = altura;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {

        this.tipoSangre = tipoSangre;
    }

    //sobreescritura del metodo y se agregan los atributos propios de paciente
    @Override
    public String toString() {
        return super.toString() + "Fecha cumpleaños: " + fechaCumpleaños + "\nPeso: " + getPeso() + "\nAltura: "+ getAltura() + "\nTipo Sangre: "+ tipoSangre;
    }

    @Override
    public void mostrarDatosUsuarios() {
        System.out.println("\n");
        System.out.println("Paciente");
        System.out.println("Historial del paciente");

    }
}
