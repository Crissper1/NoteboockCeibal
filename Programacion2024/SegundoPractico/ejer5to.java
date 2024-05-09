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
                System.out.print("Dato erroneo!!!\nVuelva a Ingresar: ");
                dato.next();
              }
            }while(!dato.hasNextInt());      
        int op = dato.nextInt();
        return op;
    }
    static int suma(int a, int b){
        int resultado=a+b;
        return resultado;
    }
    static int resta(int a, int b){
        int resultado=a-b;
        return resultado;
    }
    static int divicion (int a, int b){
        int resultado=a/b;
        return resultado;
    }
    static int multi(int a, int b){
        int resultado=a*b;
        return resultado;

    }
    static  int[] digAB(){
        
        int[] dig_AB = new int[2];
        dig_AB[0]=0;
        dig_AB[1]=0;
        System.out.print("Ingrese el su 1er N°: ");
        dig_AB[0]=dato.nextInt();
        System.out.print("Ingrese el su 2do N°: ");
        dig_AB[1]=dato.nextInt();
        return dig_AB[];
    }

    public static void main(String[] args) {
        
        menu();
        switch (op()) {
            case 1:
                suma(digAB()[0], digAB()[1]);
                
                break;
        
            default:
                break;
        }


    dato.close();
    }

}
