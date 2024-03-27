
/*Escribe un programa que pida 10 números por teclado, los almacene en un vector
y que luego muestre el máximo valor, el mínimo y las posiciones que ocupan en el
vector. */
import java.util.Scanner;

public class veCtorEj2 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int max = 0, min = 1000, imax = 0, imin = 0;
        int vector[];
        vector = new int[10];
        System.out.println();
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese 10 Numeros " + (i) + " : ");
            vector[i] = dato.nextInt();
        }
        for (int i = 0; i < vector.length; i++) {
            if (max < vector[i]) {
                max = vector[i];
                imax = i;
            } else if (min > vector[i]) {
                min = vector[i];
                imin = i;
            }

        }
        System.out.print(
                "El numero mayor es: " + max + "\nEl Menor es: " + min + "\nLos idices son: " + imax + "," + imin);
        dato.close();
    }
}
