package SegundoPractico;

import java.util.Scanner;

public class pruebasverificacion {
    public static Scanner dato = new Scanner(System.in);
    static int datolimpio() {
        int dato1 = 0;
        try {
            dato1 = Integer.parseInt(dato.nextLine());
        } catch (NumberFormatException e) {
            System.out.print("Dato Incorrecto!!! Vuelva a Ingresar: ");
            dato1 = datolimpio(); 
        } finally {
            dato.close();
        }
        return dato1;
    }
    public static void main(String[] args) {
        System.out.print("Ingrese dato: ");
        int dato = datolimpio();
        System.out.println(dato);

    }
}
