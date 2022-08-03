import model.Doctor;
import model.Paciente;
import model.Usuario;

import java.util.Date;

import static ui.IUMenu.verMenu;

public class Main {
    public static void main(String[] args) {

        //metodo para llamar al menu
        verMenu();
    }
}









        /*
        Doctor miDoctor = new Doctor("Doctor Juan", "Drjuan@gmail.com", "cll 25 - 25", "doc123", "Medico General");
        System.out.println(miDoctor);

        //el metodo miDoctor trae los metodos de la clase Doctor
        miDoctor.todasCitasDisponibles ("13/02/2022", "4:00pm");
        miDoctor.todasCitasDisponibles("14/02/2022", "10:00pm");
        miDoctor.todasCitasDisponibles("15/02/2022", "8:00am");

        //se crea para mostrar que es un metodo abstrato
        Usuario usuarioDoctor = new Doctor("Fabian Nuevo Doctor", "fabian@gmail.com", "cll 56-65", "Usu123", "Ser Usuario");

        //aqui se crea polimorfismo, se declara objeto Doctor y adquiere comportamiento que le dio el objeto Doctor
        usuarioDoctor.mostrarDatosUsuarios();
        Usuario usuarioPaciente = new Paciente("Diony ", "diony@gmail.com", "cll 98 diony", "pac123");
        usuarioPaciente.mostrarDatosUsuarios();

        /*  esta clase se copia en la linea 31
        //hacer clase anonima
        Usuario usuario1= new Usuario("Andres", "andres@gmail") {
            @Override
            public void mostrarDatosUsuarios() {
                System.out.println("Doctor \n");
                System.out.println("Hospital Cruz Azul");
                System.out.println("Departamente de Cruz azul");

            }

        };
        usuario1.mostrarDatosUsuarios();
        }





        for (Doctor.CitasDisponibles citasDisponibles : miDoctor.getCitasDisponibles()) {
            System.out.println(citasDisponibles.getFecha() + " " + citasDisponibles.getHora());


        }
        System.out.println();
        System.out.println();
        Paciente paciente = new Paciente("Alejandra", "Alejandra@gmail.com", "Cll 65 alejandra", "np12345" + "\n");
        System.out.println(paciente);


    }
}*/







