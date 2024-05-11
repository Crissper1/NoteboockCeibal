package SegundoPractico;

import java.util.Scanner;

public class pruebasverificacion {
    public static Scanner dato = new Scanner(System.in);
    static int formato_a_Num() {
        int valor = 0;
        try {
            valor = Integer.parseInt(dato.nextLine());
        } catch (NumberFormatException e) {
            System.out.print("Dato Incorrecto!!! Vuelva a Ingresar: ");
            valor = formato_a_Num(); 
        } finally {
            dato.close();
        }
        return valor;
    }
    public static void main(String[] args) {
        System.out.print("Ingrese dato: ");
        int dato = formato_a_Num();
        System.out.println(dato);

    }
}
