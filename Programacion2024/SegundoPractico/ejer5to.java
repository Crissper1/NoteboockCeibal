package SegundoPractico;

import java.util.Scanner;

/*Realizar un programa que muestre el siguiente menú y realice cada operación del
mismo:
▪ 1) Sumar
▪ 2) Restar
▪ 3) Dividir
▪ 4) Multiplicar
▪ 0) Salir
Se debe definir un método para:
• mostrar el menú
• solicitar el ingreso de los operadores
• para cada operación matemática */
public class ejer5to {
    public static Scanner dato = new Scanner(System.in);
    static void menu(){
        System.out.print("Calculador\n");
        System.out.print("1) Sumar\r\n" + //
                           "2) Restar\r\n" + //
                           "3) Dividir\r\n" + //
                           "4) Multiplicar\r\n" + //
                           "0) Salir\n");
    }
    static int op(){
        
        System.out.print("Ingrese el operador segun su N°: ");
        do {
            if(!dato.hasNextInt()){
                System.out.print("Dato erroneo o fuera de Rango!!!\nVuelva a Ingresar: ");
                dato.next();
              }
            }while(!dato.hasNextInt());      
        int op = dato.nextInt();

        return op;
    }
    public static void main(String[] args) {
        
        menu();
        System.out.println(op());
    }
}
