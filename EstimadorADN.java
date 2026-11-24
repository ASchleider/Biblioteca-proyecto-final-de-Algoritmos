import java.util.Locale;
import java.util.Scanner;

public class EstimadorADN {

    public static void main(String[] args) {
        final double REACTIVO_ML_POR_M_BASES = 0.05;
        final double COSTO_POR_ML = 12.50;          

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.print("Ingrese los millones de pares de bases procesadas: ");
        double millonesBasesProcesadas = teclado.nextDouble();
        double reactivoMl = millonesBasesProcesadas * REACTIVO_ML_POR_M_BASES;
        double reactivoLitros = reactivoMl / 1000;
        double costoTotal = reactivoMl * COSTO_POR_ML;

        System.out.println("REPORTE DE SECUENCIACION DE ADN");
        System.out.printf("Pares de bases procesados: %.2f millones%n", millonesBasesProcesadas);
        System.out.printf("Reactivo requerido: %.2f ml (%.4f litros)%n", reactivoMl, reactivoLitros);
        System.out.printf("Costo operativo total: $%.2f USD%n", costoTotal);
        System.out.println("====================================");

        teclado.close();
    }
}