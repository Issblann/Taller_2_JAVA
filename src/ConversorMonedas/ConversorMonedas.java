package ConversorMonedas;


import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorMonedas {

    static Scanner scanner = new Scanner(System.in);

    public static void usdACop(){
        System.out.println("Ingrese un numero");

            double precioDolar, pesos, result;
            System.out.println("Ingresa los dolares a convertir");
            pesos = scanner.nextDouble();
            precioDolar = 4.051;

            result = pesos * precioDolar;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.000");
        decimalFormat.setParseBigDecimal(true);
        String formattedResultCOP = decimalFormat.format(result);

        System.out.println("El equivalente en COP es: " + formattedResultCOP);
    }

    public static void usdAEur(){
        System.out.println("Ingrese un número en USD:");

        double precioDolar, dolares, result;
        System.out.println("Ingresa los dólares a convertir");
        dolares = scanner.nextDouble();
        precioDolar = 0.85;
        result = dolares * precioDolar;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String formattedResultEUR = decimalFormat.format(result);

        System.out.println("El equivalente en EUR es: " + formattedResultEUR);
    }


}
