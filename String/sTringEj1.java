/*Escribir un programa que pida al usuario que ingrese una cadena de
caracteres, la almacene y luego devuelva la cantidad de vocales que ésta
contiene. */

import java.util.Scanner;

public class sTringEj1 {
    public static void main(String[] args) {
        String palabra;
        int cont=0;
        
        Scanner dato= new Scanner(System.in);
        System.out.println("Ingrese la palabra a ver sus vocales");
        palabra=dato.nextLine();
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.charAt(i)=='a'|palabra.charAt(i)=='e'|palabra.charAt(i)=='i'|palabra.charAt(i)=='o'|palabra.charAt(i)=='u')
            cont++;
            
        }
        System.out.print("La cantidad de vocales es: "+cont);
        dato.close();

        
    }
}
