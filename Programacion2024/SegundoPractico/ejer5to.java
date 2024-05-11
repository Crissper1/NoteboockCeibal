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
    static int formato_a_Num() {
        int valor = 0;
        try {
            valor = Integer.parseInt(dato.nextLine());
        } catch (NumberFormatException e) {
            System.out.print("Dato Incorrecto!!! Vuelva a Ingresar: ");
            valor = formato_a_Num(); 
        }
        return valor;
    }
    static void menu(){
        System.out.print("Calculador\n");
        System.out.print("1) Sumar\r\n" + 
                         "2) Restar\r\n" + 
                         "3) Dividir\r\n" + 
                         "4) Multiplicar\r\n" +
                         "0) Salir\n");
    }
    static int op(){
        System.out.print("Ingrese el operador segun su N°: ");
        int op = formato_a_Num();
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
        System.out.print("Ingrese el su 1er N°: ");
        int a=formato_a_Num();
        System.out.print("Ingrese el su 2do N°: ");
        int b=formato_a_Num();
        int[] resultado = {a,b}; 
        return resultado;
    }
    public static void main(String[] args) {
        int[] resultado;
        int op;
        do{
        menu();
        op=op();
        switch (op) {
            case 1:
                resultado=digAB();
                System.out.println("Su resultado es "+suma(resultado[0], resultado[1]));
                break;
            case 2:
                resultado=digAB();
                System.out.println("Su resultado es "+resta(resultado[0], resultado[1]));
                break;
            case 3:
                resultado=digAB();
                System.out.println("Su resultado es "+divicion(resultado[0], resultado[1]));
                break;
            case 4:
                resultado=digAB();
                System.out.println("Su resultado es "+multi(resultado[0], resultado[1]));
                break;
            case 0:
                System.out.print("Game Over");
                break;
            default:
                System.out.println("Dato Incorrecto!!!Otra Vez...");
                break;
        }
    }while(op!=0);
    dato.close();
    }

}
