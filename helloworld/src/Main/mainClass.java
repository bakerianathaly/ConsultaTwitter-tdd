package Main;

import twitter4j.*;

import java.util.Scanner;

public class mainClass {
    static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
    static int select = -1; //opción elegida del usuario

    public static void main (String[] args) throws TwitterException {
        mainClass m = new mainClass();
        twitterConexion tw = new twitterConexion();
      //  m.searchUser("anderson_g95");

        //Mientras la opción elegida sea 0, preguntamos al usuario
        while (select != 0) {
            //Try catch para evitar que el programa termine si hay un error
            try {
                System.out.println(
                        "Twitter App Ingeniería del Software:\n" +
                        "1.- Buscar Usuario" +
                        "\n2.- Equipo de desarrollo\n" +
                        "0.- Salir");
                //Recoger una variable por consola
                select = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (select) {
                    case 1:
                        String username;
                        System.out.println("Introducir nombre de usuario: ");
                        username= scanner.nextLine();
                        tw.searchUser(username);
                        System.out.println(username);
                        break;
                    case 2:
                        System.out.println("Hecho por Nathaly Bakerian Scovino");
                        System.out.println("Para Ingenieria del Software");
                        System.out.println("Profesor. Carlos Barroeta");
                        break;
                    default:
                        System.out.println("Adios!");
                        break;
                }

                System.out.println("\n"); //Mostrar un salto de línea en Java

            } 
            catch (Exception e) {
                System.out.println("Uoop! Error!");
            }
        }
    }
}



