package SegundoPractico;

// Realizar un método que reciba dos números enteros como parámetros y devuelva
// un texto indicando:
// ▪ El primer valor es el más grande
// ▪ El segundo valor es el más grande
// ▪ Son iguales

public class ejer2dos {
    public static void nmayor(int n1 , int n2) {
        
        String mayor_igual = (n1 > n2) ? "El primer N° es mayor" : (n1 < n2) ? "El segundo N° es mayor" : "Ambos N° son iguales";
        System.out.print(mayor_igual);
    }
    public static void main(String[] args) {
        nmayor(10, 10);
    }
}
