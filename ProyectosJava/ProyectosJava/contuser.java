

import java.util.Scanner;

public class contuser {
    public static void main(String[] args) {
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        input.close();
    }

}
