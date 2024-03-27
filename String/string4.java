

/*Escribir un programa que le pida al usuario que ingrese una oración (sin
puntos ni comas) y la almacene en un String, luego cuente la cantidad de
palabras y lo muestre en pantalla. */
import java.util.Scanner;

public class string4 {
    public static void main(String[] args) {
        String oracion;
        char espacio = ' ';
        int conta = +1;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese una oracion con al menos 3 espacios: ");
        oracion = dato.nextLine();
        for (int i = 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) == espacio) {
                conta++;
            }
        }
        if (!oracion.isEmpty()) {
            System.out.println("La cantidad de palabras son " + conta);
        } else
            System.out.println("No ingreso ninguna oracion");
        dato.close();
    }
}
