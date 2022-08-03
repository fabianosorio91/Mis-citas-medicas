package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class IUMenuPaciente {
    public static void  verMenuPaciente(){
        int respuesta = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("Bienvenido: " + IUMenu.pacientelogeado);
            System.out.println("1. Agenda de citas");
            System.out.println("2. Mis citas ");
            System.out.println("0. Regresar");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());//para leer lo que ponga el usuario

            switch (respuesta){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    IUMenu.verMenu();
                    break;
            }


        }while (respuesta!=0);
    }

    private static void verAgendaCitasDisponibles(){
        int respuesta = 0;
        do {
            System.out.println("::Agenda de citas");
            System.out.println(":: Selecciona una fecha: ");
            //Mostrar las fechas de los doctores que dejaron fechas disponibles
            Map<Integer, Map<Integer, Doctor>> doctores = new TreeMap<>();
            int k=0;
            for (int i = 0; i < IUMenuDoctor.doctorCitasDisponibles.size(); i++) {
                ArrayList<Doctor.CitasDisponibles> citasDisponibles
                        = IUMenuDoctor.doctorCitasDisponibles.get(i).getCitasDisponibles();
                Map<Integer, Doctor> citasDoctor = new TreeMap<>();
                for (int j = 0; j < citasDoctor.size(); j++) {
                    k++;
                    System.out.println(k + ". " + citasDisponibles.get(j).getFecha());
                    citasDoctor.put(Integer.valueOf(j), IUMenuDoctor.doctorCitasDisponibles.get(i));
                    doctores.put(Integer.valueOf(k), citasDoctor);

                }
            }
            Scanner sc = new Scanner(System.in);
            int repuestaDiaSeleccionado = Integer.valueOf(sc.nextLine());



        }while (respuesta!= 0);
    }
}
