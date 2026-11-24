import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> libros = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE BIBLIOTECA =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Consultar libros");
            //System.out.println("3.  Modificar informacion de libro");
            System.out.println("4. Eliminar libro");
            //System.out.println("5. Enseńar libros registrados");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nombre del libro: ");
                    String libro = entrada.nextLine();

                    libros.add(libro);

                    System.out.println("Libro registrado correctamente.");
                    break;

                case 2:
                    System.out.println("\n===== LISTA DE LIBROS =====");

                    if (libros.isEmpty()) {
                        System.out.println("No hay libros registrados.");
                    } else {
                        for (int i = 0; i < libros.size(); i++) {
                            System.out.println((i + 1) + ". " + libros.get(i));
                        }
                    }
                    break;

                //case 3: System.out.println("\n===== Modificar informacion de libro =====");

                case 4:
                    System.out.println("\n===== ELIMINAR LIBRO =====");

                    if (libros.isEmpty()) {
                        System.out.println("No hay libros para eliminar.");
                    } else {
                        for (int i = 0; i < libros.size(); i++) {
                            System.out.println((i + 1) + ". " + libros.get(i));
                        }

                        System.out.print("Ingrese el numero del libro: ");
                        int numero = entrada.nextInt();
                        entrada.nextLine();

                        if (numero >= 1 && numero <= libros.size()) {
                            String eliminado = libros.remove(numero - 1);
                            System.out.println("Libro eliminado: " + eliminado);
                        } else {
                            System.out.println("Numero no valido.");
                        }
                    }
                    break;

                //case 5: System.out.println("\n===== Enseńar libros registrados =====");


                case 6:
                    System.out.println("Gracias por utilizar la biblioteca.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 6);

        entrada.close();
    }
}

//Elemento	Función Scanner	Permite ingresar información por teclado.
//ArrayList	Almacena los libros registrados.
//add()	Registra un libro.
//isEmpty()	Comprueba si la lista está vacía.
//get()	Consulta un libro.
//remove()	Elimina un libro.
//switch	Permite seleccionar las opciones del menú.
//do while	Mantiene el menú funcionando hasta salir.