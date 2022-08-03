package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Doctor extends Usuario {


    //atributos del doctor
    private String especialidad;


    //get y set de los atributos del doctor
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //se crea un metodo con los atributos de la clase a la que extiende "usuario y agregamos el atributo especialidad
    public Doctor(String nombre,String email, String direccion, String numeroTelefonico, String especialidad){
       //super indica que viene de otra clase, en este caso "Usuario"
        super(nombre, email, direccion, numeroTelefonico);
        //se indica que esta especialidad es propia del metodo
        this.especialidad = especialidad;


        // primer sout
        //System.out.println("El nombre del doctor es: " + nombre );
    }

    ArrayList<CitasDisponibles> citasDisponibles = new ArrayList<>();
     public void todasCitasDisponibles (String fecha, String tiempo){

         citasDisponibles.add(new CitasDisponibles(fecha,tiempo));
             }

    public ArrayList<CitasDisponibles> getCitasDisponibles() {
        return citasDisponibles;
    }

    @Override
    //se sobreescribio el metodo para agregarle nuevos parametros, como especialidad y disponibilidad.
    public String toString() {
        return super.toString() + "\nEspecialidad: " + especialidad + "\nDisponibilidad: " + citasDisponibles.toString() ;
    }

    @Override
    public void mostrarDatosUsuarios() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Anestesia");

    }

    //se crea una segunda clase Citas disponibles dentro de la clase doctor
    public static class CitasDisponibles {
         private int id;
         private Date fecha;
         private String hora;
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");


         //metodo constructor de citas disponibles
        public CitasDisponibles(String fecha, String hora) {
            try{
            this.fecha = formato.parse(fecha);
        } catch (ParseException e) {
                e.printStackTrace();
            }
            this.hora=hora;
        }
        //set, get de citas disponibles
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getFecha(String FECHA) {
            return fecha;
        }

        public String getFecha() {
            return formato.format(fecha);
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        //se sobreescribe el metodo citas disponibles
        @Override
        public String toString() {
            System.out.println("\n");

            return "\n............Citas Disponibles............... \n Dia: " + fecha + " Hora: " + hora;
        }
    }

}
