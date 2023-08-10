package Calculadora;

import java.util.Scanner;

public class Calculadora {

    static Scanner scannerNum = new Scanner(System.in);
    public static void sumar(){
        System.out.println("Ingrese el primer numero");
        float num1 = scannerNum.nextFloat();
        System.out.println("Ingrese el segundo numero");
        float num2 = scannerNum.nextFloat();

        float result = num1 + num2;
        System.out.println("La suma es: " + result);
    };

    public static void restar(){
        System.out.println("Ingrese el primer numero");
        float num1 = scannerNum.nextFloat();
        System.out.println("Ingrese el segundo numero");
        float num2 = scannerNum.nextFloat();

        float result = num1 - num2;
        System.out.println("La resta es: " + result);
    };

    public static void multiplicar(){
        System.out.println("Ingrese el primer numero");
        float num1 = scannerNum.nextFloat();
        System.out.println("Ingrese el segundo numero");
        float num2 = scannerNum.nextFloat();

        float result = num1 * num2;
        System.out.println("La multiplicación es: " + result);
    };

    public static void dividir(){
        System.out.println("Ingrese el primer numero");
        float num1 = scannerNum.nextFloat();
        System.out.println("Ingrese el segundo numero");
        float num2 = scannerNum.nextFloat();

        float result = num1 / num2;
        System.out.println("La división es: " + result);
    };
}
