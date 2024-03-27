

import java.util.Scanner;

public class elNumeroN {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int cantidadN = 0, mayor = 0, posicion = 0, suma = 0;
        System.out.print("Ingrese el valor de N: ");
        cantidadN = S.nextInt();
        int[] arreglo = new int[cantidadN];

        for (int i = 0; i < cantidadN; i++) {
            System.out.print("Ingrese números: ");
            arreglo[i] = S.nextInt();
        }

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
                posicion = i;
            }
        }
        for (int i = 0; i <= posicion; i++) {
            suma += arreglo[i];

        }
        System.out
                .println("El Numero mayor es " + mayor + "\nY la Suma de los Numero hasta el Mayor incluso es " + suma);
        S.close();
    }
}
