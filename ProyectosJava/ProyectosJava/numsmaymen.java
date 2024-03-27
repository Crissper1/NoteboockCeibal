

import java.util.Scanner;

public class numsmaymen {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0, may;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el N: ");
        n1 = input.nextInt();
        System.out.print("Ingrese el N2: ");
        n2 = input.nextInt();
        may = Math.max(n1, n2);
        System.out.print("El numero Mayor entre ambos es: " + may);
        input.close();
    }

}
