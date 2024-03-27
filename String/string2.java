/*Escribir un programa que solicite al usuario que ingrese una palabra y un
carácter, y que luego muestre en pantalla cuántas veces se repite el
carácter en la cadena.*/


import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        String palabra;
        char letra;
        int conta = 0;
        Scanner dato = new Scanner(System.in);
        System.out.println("Pruebas de String\n");
        System.out.println("Ingrese una Palabra: ");
        palabra = dato.nextLine();
        System.out.print("Ingrese Una Letra\n a repetir: ");
        letra = dato.next().charAt(0);
        for (int i = 0; i < palabra.length(); i++) {

            System.out.println(palabra.charAt(i));
            if (palabra.charAt(i) == letra) {
                conta++;

            }
        }
        System.out.println("La letra se repite " + conta);
        dato.close();

    }
}
