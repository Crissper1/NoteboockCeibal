

import java.util.Scanner;

public class numnegativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, sum = 0, cont = 0;
        while (Math.signum(num) != -1) {
            System.out.print("Ingrese dato Numerico: ");
            num = input.nextInt();
            if (Math.signum(num) != -1) {
                sum += num;

            }
        }
        System.out.print("El promedio de todos los datos q ingreso son: " + sum / cont);
        input.close();
    }

}
