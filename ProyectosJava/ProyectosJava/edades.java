

import java.util.Scanner;

public class edades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double promedio = 0;
        int sumaEdades = 0, edad = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese la edad " + i + ": ");
            edad = scanner.nextInt();
            sumaEdades += edad;
        }
        promedio = sumaEdades / 3;

        System.out.println("El promedio de las edades es: " + promedio);
        scanner.close();
    }
}
