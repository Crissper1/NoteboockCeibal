package SegundoPractico;

import java.util.Scanner;

// Realizar un método que reciba un número y dos unidades de medida de
// temperatura (C, F o K) y realice la conversión entre las unidades indicas.
// ▪ Validar que las unidades sean válidas
// ▪ Validar que las unidades no sean iguales
public class ejer3ro {

    public static int ValorN() {
      Scanner dato = new Scanner(System.in);
      int valor;
      System.out.print("Ingrese valor a convertir: ");
      do {
        if(!dato.hasNextInt()){
          System.out.print("Dato erroneo!!!\nVuelva a Ingresar: ");
          dato.next();
        }
      }while(!dato.hasNextInt());
      valor=dato.nextInt();
      return valor;
    }
    
    public static void main(String[] args) {
      
      System.out.println(ValorN());
      
        
        
    }
}
