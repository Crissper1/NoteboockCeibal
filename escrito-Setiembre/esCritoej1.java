

import java.util.Scanner;

/*1) Desarrollar un programa que le solicite al usuario ingresar números hasta que ingrese cero. Debe sumar 
estos números y luego mostrar el resultado en pantalla.
(3 puntos) */
public class esCritoej1 {
    public static void main(String[] args) {
        int n, suma = 0;
        Scanner dato = new Scanner(System.in);
        do {
            System.out.println("Ingrese Numeros: ");
            n = dato.nextInt();
            suma += n;
        } while (n != 0);

        System.out.println("La suma de los numeros: " + suma);
        dato.close();
    }

}
