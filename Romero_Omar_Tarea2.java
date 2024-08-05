package tarea2;

import java.util.Scanner;

public class Romero_Omar_Tarea2 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");

        String eleccion;
        String palabra;

        while (true) {
            System.out.println("Menu");
            System.out.println("*******************");
            System.out.println("1. Palabra en Diagonal");
            System.out.println("2. Piramide de Numeros");
            System.out.println("3. Palindromos o No");
            System.out.println("4. Salir del Codigo");
            System.out.println("*******************");
            eleccion = lea.next();

            if (eleccion.equals("1")) {
                while (!eleccion.equalsIgnoreCase("no")) {
                    System.out.println("Ingrese una palabra:");
                    palabra = lea.next();

                    for (int i = 0; i < palabra.length(); i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println(palabra.charAt(i));
                    }

                    for (int i = palabra.length() - 1; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println(palabra.charAt(i));
                    }

                    while (true) {
                        System.out.println("Desea ingresar otra palabra? [si/no])");
                        eleccion = lea.next();
                        if (eleccion.equalsIgnoreCase("no")) {
                            break;
                        } else if (eleccion.equalsIgnoreCase("si")) {
                            break;
                        } else {
                            System.out.println("Ingrese una opcion valida");
                        }
                    }
                }

            } else if (eleccion.equals("2")) {
                while (!eleccion.equalsIgnoreCase("no")) {
                    System.out.println("Ingrese un numero el cual se basara para hacer la piramide");
                    int fila = lea.nextInt();

                    for (int i = 1; i <= fila; i++) {

                        for (int j = 1; j < i; j++) {
                            System.out.print("  ");
                        }

                        for (int k = i; k <= fila; k++) {
                            System.out.print(k + " ");
                        }

                        for (int l = fila - 1; l >= i; l--) {
                            System.out.print(l + " ");
                        }

                        System.out.print("\n");
                    }

                    while (true) {
                        System.out.println("Desea crear otra piramide? [si/no])");
                        eleccion = lea.next();
                        if (eleccion.equalsIgnoreCase("no")) {
                            break;
                        } else if (eleccion.equalsIgnoreCase("si")) {
                            break;
                        } else {
                            System.out.println("Ingrese una opcion valida");
                        }
                    }
                }
            } else if (eleccion.equals("3")) {
                while (!eleccion.equalsIgnoreCase("no")) {
                    System.out.println("Ingrese la cantidad de palabras que desea ingresar");
                    int cantidadpalabras = lea.nextInt();
                    String listapalindromos = "";
                    String listanopalindromos = "";
                    String palabrainv = "";

                    for(int contador=1;contador <= cantidadpalabras;contador++){
                        System.out.println("Palabra " + contador + " ");
                        palabra = lea.next().toLowerCase();

                        for (int i = palabra.length() - 1; i >= 0; i--) {
                            char letra = palabra.charAt(i);
                            palabrainv += letra;
                        }

                        if (palabrainv.equals(palabra)) {
                            listapalindromos += palabra + " ";
                            palabrainv = "";
                        } else {
                            listanopalindromos += palabra + " ";
                            palabrainv = "";
                        }
                    }

                    System.out.println("Palindromos: " + listapalindromos);
                    System.out.println("No Palindromos: " + listanopalindromos);

                    while (true) {
                        System.out.println("Desea hacer otra lista? [si/no])");
                        eleccion = lea.next();
                        if (eleccion.equalsIgnoreCase("no")) {
                            break;
                        } else if (eleccion.equalsIgnoreCase("si")) {
                            break;
                        } else {
                            System.out.println("Ingrese una opcion valida");
                        }
                    }
                }
            } else if (eleccion.equals("4")) {
                System.out.println("Adios, nos vemos pronto!");
                break;
            } else {
                System.out.println("Escriba una opcion valida");
            }

        }

    }
}