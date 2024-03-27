

import java.util.Scanner;

public class mayormenor {
    public static void main(String[] args) {
        int edad = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese edad: ");
        edad = input.nextInt();
        if (edad > 18) {
            System.out.print("Usted es mayor de edad");
        } else {
            System.out.print("Usted es menor de edad");

        }
        input.close();

    }

}
