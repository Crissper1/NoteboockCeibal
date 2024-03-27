
import java.util.Scanner;
/*Realizar un programa que lea 10 valores enteros en un vector desde el teclado y
calcule y muestre la suma, y el promedio */
public class veCtoresEj3 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int vector[] = new int[10];
        int suma=0,promedio=0;
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese Numeros "+i+":");
            vector[i]=dato.nextInt();
        }
        for (int i = 0; i < vector.length; i++) {
            suma+=vector[i];
            promedio=suma/vector.length;
        }
    System.out.println("La suma de todos los Numeros es: "+suma+"\nEl Promedio es: "+promedio);
    dato.close();
    }
}
