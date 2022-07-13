package ui;

import java.util.Scanner;

public class IUMenuDoctor {

    //creamos metodo
    public static void mostrarMenuDoctor (){
        int respuesta = 0;

        //el DO-WHILE es muy util para menus
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Bienvenido" + IUMenu.doctorlogeado.getNombre());
            System.out.println("1. Definir las citas disponibles");
            System.out.println("2. Mi agenda de citas");
            System.out.println("3. Salir del sistema");

            Scanner sc = new Scanner(System.in); //para leer lo que ponga el usuario
            String email = sc.nextLine(); //se registra lo del usuario

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
    private static void mostrarMenuCitasDisponibles(){
        int respuesta = 0;
        do {
            System.out.println("\n");
            System.out.println(":: Añadir Cita Disponible");
            System.out.println(":: Seleccionar un mes");
            for (int i=0; i<3; i++){
                int j= i + 1;
                System.out.println(j + ". " + IUMenu.MESES[i]);
            }
            System.out.println("0. Regresar");

            Scanner sc = new Scanner(System.in); //para leer lo que ponga el usuario
            String email = sc.nextLine(); //se registra lo del usuario

            if( respuesta>0 && respuesta <4){
                //1 2 3
                int mesSeleccionado = respuesta;
                System.out.println(mesSeleccionado +"." + IUMenu.MESES[mesSeleccionado]);
                System.out.println("Inserta la fecha disponible: [dd/mm/yyy]");
                String date= sc.nextLine();

                System.out.println("Tu fecha es: " + date + "\n1. Correcto \n2. Cambiar fecha");


            } else if (respuesta == 0) {
                mostrarMenuDoctor();

            }


        }while (respuesta!=0);
        }
    }

