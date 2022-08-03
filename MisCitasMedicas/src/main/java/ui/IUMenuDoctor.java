package ui;

import model.Doctor;

import java.util.Scanner;
import java.util.ArrayList;

public class IUMenuDoctor {
    public static ArrayList<Doctor> doctorCitasDisponibles = new ArrayList<>();

    //creamos metodo
    public static void mostrarMenuDoctor() {
        int respuesta = 0;

        //el DO-WHILE es muy util para menus
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Bienvenido: " + IUMenu.doctorlogeado.getNombre());
            System.out.println("1. Definir las citas disponibles");
            System.out.println("2. Mi agenda de citas");
            System.out.println("3. Salir del sistema");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());//para leer lo que ponga el usuario

            switch (respuesta) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    IUMenu.verMenu();
                    break;
            }

        } while (respuesta != 0);
    }

    private static void mostrarMenuCitasDisponibles() {
        int respuesta = 0;
        do {
            System.out.println("\n");
            System.out.println(":: Añadir Cita Disponible");
            System.out.println(":: Seleccionar un mes");
            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + IUMenu.MESES[i]);
            }
            System.out.println("0. Regresar");

            Scanner sc = new Scanner(System.in); //para leer lo que ponga el usuario
           respuesta = Integer.valueOf(sc.nextLine()); //se registra lo del usuario

            if (respuesta > 0 && respuesta < 4) {
                //1 2 3
                int mesSeleccionado = respuesta;
                System.out.println(mesSeleccionado + "." + IUMenu.MESES[mesSeleccionado -1]);
                System.out.println("Inserta la fecha disponible: [dd/mm/yyy]");
                String fecha = sc.nextLine();

                System.out.println("Tu fecha es: " + fecha + "\n1. Correcto \n2. Cambiar fecha");

                int respuestaDato = Integer.valueOf(sc.nextLine());
                if (respuestaDato == 2) continue;
                int respuestahora = 0;
                String hora = "";
                do {
                    System.out.println("inserte una hora disponible para esta fecha" + fecha + "[16:00]");
                    hora = sc.nextLine();
                    System.out.println("tu hora es" + hora + "\n1. Correcto \n2. Cambiar hora");
                    respuestahora = Integer.valueOf(sc.nextLine());

                } while (respuestahora == 2);

                IUMenu.doctorlogeado.todasCitasDisponibles(fecha, hora);
                chequearCitasDisponiblesDoctor(IUMenu.doctorlogeado);


            } else if (respuesta == 0) {
                mostrarMenuDoctor();

            }


        } while (respuesta != 0);
    }

    private static void chequearCitasDisponiblesDoctor(Doctor doctor)
    {
        if (doctor.getCitasDisponibles().size()>0 && !doctorCitasDisponibles.contains(doctor)){
    doctorCitasDisponibles.add(doctor);
    }
    }
    }

