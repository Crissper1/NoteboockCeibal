

import java.util.Scanner;

public class multiploX {
    public static void main(String[] args) {
        int num = 0, numMultiplo = 0, cont = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresar el N multiplo");
        num = input.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.print("Ingrese numero para saber si es multiplo: ");
            numMultiplo = input.nextInt();
            if (numMultiplo % num == 0) {
                cont++;
            }
        }
        System.out.println("La cantidad de N Multiplos de " + num + " es: " + cont);
        input.close();
    }
}
