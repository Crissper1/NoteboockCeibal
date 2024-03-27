

import java.util.Scanner;

public class numeroRepetido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        boolean repetido;

        System.out.println("Ingrese tres números:");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        repetido = false;
        if (num1 == num2 || num1 == num3) {
            repetido = true;
            System.out.println("El número repetido es: " + num1);
        } else if (num2 == num3) {
            repetido = true;
            System.out.println("El número repetido es: " + num2);
        }
        if (!repetido) {
            System.out.println("No hay números repetidos.");
        }
        scanner.close();
    }
}
