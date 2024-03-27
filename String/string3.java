

import java.util.Scanner;

/*Escribir un programa que solicite al usuario que ingrese una palabra y luego
muestre en pantalla la palabra invertida. Por ejemplo, si ingresa “Hola”,
devuelve “aloH” */
public class string3 {
    public static void main(String[] args) {

        String palabra, palabraInver = " ";
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        palabra = dato.nextLine();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            // System.out.println(palabra.charAt(i));
            palabraInver += palabra.charAt(i);

        }
        System.out.println("La palabra invertida es: " + palabraInver);
        dato.close();
    }

}
