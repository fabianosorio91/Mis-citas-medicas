package ui;

import model.Doctor;
import model.Paciente;

import java.util.ArrayList;
import java.util.Scanner;

public class IUMenu {

    public static final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorlogeado;
    public static Paciente pacientelogeado;

    public static void verMenu() {
        System.out.println("Bienvenido a mis citas");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    response = 0;
                    System.out.println("Doctor");
                    autenticarUsuario(1);
                    break;
                case 2:
                    response = 0;
                    autenticarUsuario(2);
                    //mostraMenuPaciente();

                    break;
                case 0:
                    System.out.println("Gracias por tu visita");
                    break;
                default:
                    System.out.println("Por favor seleccione una respuesta correcta");
            }
        } while (response != 0);
    }

    private static void autenticarUsuario(int tipoUsuario) {
        //Tipo de usuario es = 1 Doctor
        //tipo de usuario es = 2 Paciente

        //se crean 2 listas de arrays
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Juan Martinez", "juan@gmail", "cll 98", "32165", "Medico Juan"));
        doctors.add(new Doctor("David Martinez", "david@gmail", "cll 97", "32165", "Medico david"));
        doctors.add(new Doctor("Mateo Martinez", "mateo@gmail", "cll 96", "32165", "Medico mateo"));


        //se crean dos listas de arrays
        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add((new Paciente("Ana", "ana@gmail", "cr 99", "123")));
        pacientes.add((new Paciente("Luisa", "luisa@gmail", "cr 99", "123")));
        pacientes.add((new Paciente("Sara", "sara@gmail", "cr 99", "123")));

        //se define una variable boolean que se inicializa en falso hata que el correo sea verdadero
        boolean emailCorrecto = false;
        do {
            System.out.println("Inserte su email: [a...@gmail.com]");
            Scanner sc = new Scanner(System.in); //para leer lo que ponga el usuario
            String email = sc.nextLine(); //se registra lo del usuario
            if (tipoUsuario == 1) {
                //esta validaciones podrian estar en el query y nos las deberias de poner aqui
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) { //si fue
                        emailCorrecto = true;
                        //obtener el usuario logeado
                        doctorlogeado = d;
                        //Mostrar el menu del doctor
                        IUMenuDoctor.mostrarMenuDoctor();
                    }
                }
            }
            if (tipoUsuario == 2) {
                for (Paciente p : pacientes) {
                    if (p.getEmail().equals(email)) {
                        emailCorrecto = true;
                        //obtener el usuario logeado
                        pacientelogeado = p;
                        //Mostrar el menu del paciente
                    }
                }
            }
        }while (!emailCorrecto) ;
    }
        static void mostraMenuPaciente () {
            int response = 0;
            do {
                System.out.println("\n\n");
                System.out.println("Paciente");
                System.out.println("1. Reservar una cita");
                System.out.println("2. Mis Citas");
                System.out.println("0. Volver");

                Scanner sc = new Scanner(System.in);
                response = Integer.valueOf(sc.nextLine());

                switch (response) {
                    case 1:
                        System.out.println("::Reservar una cita");
                        for (int i = 0; i < 4; i++) {
                            System.out.println(i + ". " + MESES[i]);
                        }
                        break;
                    case 2:
                        System.out.println("::Mis Citas");
                        break;
                    case 0:
                        verMenu();
                        break;
                }
            } while (response != 0);
        }
    }




