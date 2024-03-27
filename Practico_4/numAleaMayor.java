
import java.util.Scanner;

public class numAleaMayor {
    public static void main(String[] args) {
        int num, numMayo1 = 0, numMayo2 = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Ingrese Numeros hasta terminar con el 0 : ");
            num = input.nextInt();
            if (numMayo1 < num) {
                numMayo2 = numMayo1;
                numMayo1 = num;
            } else if (numMayo2 < num && numMayo1 != num) {
                numMayo2 = num;
            }
        } while (num != 0);
        System.out.println("El primer N mayor es: " + numMayo1 + "\nY segundo es: " + numMayo2);
        input.close();

    }
}
