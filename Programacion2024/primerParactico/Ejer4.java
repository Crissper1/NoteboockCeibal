package primerParactico;
import java.util.*;
/* Realizar una aplicación que solicite dos números enteros (base y exponente) y 
muestre, utilizando estructuras repetitivas, la potencia de la base al exponente */
public class Ejer4 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0;
        double resultado = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Potencia de la base al exponente");
        System.out.print("Ingrese base: ");
        n1 = input.nextInt();
        System.out.print("Ingrese exponente: ");
        n2 =input.nextInt();
        for (int i = 0; i < n2; i++) {
            resultado *= n1; 
        }
        System.out.println("La potencia de " + n1 + " elevado a " + n2 + " es " + resultado);
     
    input.close();
    }
    
}
