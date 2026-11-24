import java.util.Locale;
import java.util.Scanner;

public class AutonomiaRobot {

    public static void main(String[] args) {
        final double CONSUMO_MAH_POR_METRO = 15.5;
        final double CAPACIDAD_BATERIA_MAH = 5000.0;

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        System.out.print("Ingrese el porcentaje de bateria actual (0 a 100): ");
        double porcentajeBateriaActual = teclado.nextDouble();

    
        if (porcentajeBateriaActual < 0 || porcentajeBateriaActual > 100) {
            System.out.println("Error: el porcentaje debe estar entre 0 y 100.");
        } else {
            double energiaDisponibleMah = CAPACIDAD_BATERIA_MAH * porcentajeBateriaActual / 100;
            double autonomiaMetros = energiaDisponibleMah / CONSUMO_MAH_POR_METRO;
            double autonomiaKm = autonomiaMetros / 1000;
            System.out.println("Autonomia del robot");
            System.out.printf("Energia disponible: %.2f mAh%n", energiaDisponibleMah);
            System.out.printf("Autonomia restante: %.2f metros%n", autonomiaMetros);
            System.out.printf("Autonomia restante: %.3f kilometros%n", autonomiaKm);
        }

        teclado.close();
    }
}