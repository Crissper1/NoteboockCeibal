

import java.util.Scanner;

public class cualCantida {
    public static void main(String[] args) {
        int num = 0, cont = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el N para determinar cual es su catidad de dijitos");
        num = input.nextInt();
        while (num > 0) {
            num = num / 10;
            cont++;
        }
        System.out.println("La cantidad de dijitos es: " + cont);
        input.close();

    }

}
