import java.util.Scanner;

public class sumaImpares {
    public static void main(String[] args) {
        int pare = 0, suma = 0;
        Scanner S = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        pare = S.nextInt();
        for (int i = 1; i <= pare; i++) {
            if (i % 2 == 1) {
                suma += i;
                System.out.print("\nN impar: " + i);
            }
        }
        System.out.print("\nLa suma de todos los numeros impares hasta el Numero N es: " + suma);
        S.close();
    }
}
