package primerParactico;
/*Realizar una aplicación que muestre, utilizando estructuras repetitivas, todos los 
números primos del 2 al 100 */
    
public class Ejer3 {
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Números primos del 2 al 100:");

        for (int i = 2; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(" " +i);
            }
    


}
}
}
