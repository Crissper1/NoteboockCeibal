package SegundoPractico;

import java.util.Scanner;

// Realizar un método que reciba un número y dos unidades de medida de
// temperatura (C, F o K) y realice la conversión entre las unidades indicas.
// ▪ Validar que las unidades sean válidas
// ▪ Validar que las unidades no sean iguales
public class ejer3ro {

    public static String[] num_and_Medida() {
        Scanner input = new Scanner(System.in);
        String[] temN = new String[2]; // Cambié la capacidad a 2 para almacenar el número y la medida
        System.out.print("Ingrese N° a convertir: ");
        temN[0] = input.nextLine();
        System.out.print("Ingrese la primera letra de su medida de temperatura (Celsius, Fahrenheit, Kelvin): ");
        temN[1] = input.nextLine();
        input.close();
        return temN;
    }
    
    public static void main(String[] args) {
      String[] a = num_and_Medida();  
      System.out.println(a[0] +" " + a[1] );
        
        
        
    }
}
