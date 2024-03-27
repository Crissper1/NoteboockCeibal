

/*3) Escribir un programa que muestre en pantalla todos los números pares del 1 al 100 y que además muestre la suma de los mismos.
(4 puntos) */
public class esCritoej3 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 0; i <= 100; i += 2) {
            suma += i;
        }
        System.out.println("La suma de todos los numeros pares del 0 al 100 es: " + suma);
    }
}
