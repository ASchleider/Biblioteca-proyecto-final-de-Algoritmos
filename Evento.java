import java.util.Scanner;

public class Evento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // limpia el salto de línea pendiente

        System.out.print("¿Tiene documento de identidad vigente? (Si/No): ");
        boolean documento = scanner.nextLine().equalsIgnoreCase("si");

        System.out.print("¿Tiene entrada VIP? (Si/No): ");
        boolean entradaVip = scanner.nextLine().equalsIgnoreCase("si");

        if (entradaVip) {
            System.out.println(nombre + ": acceso VIP concedido.");
        } else if (edad >= 18 && documento) {
            System.out.println(nombre + ": acceso general concedido.");
        } else if (edad < 18) {
            System.out.println(nombre + ": acceso denegado. Es menor de edad.");
        } else {
            System.out.println(nombre + ": acceso denegado. No presenta documento de identidad vigente.");
        }

        scanner.close();
    }
}