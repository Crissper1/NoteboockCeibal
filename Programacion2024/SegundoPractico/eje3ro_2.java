package SegundoPractico;

import java.util.Scanner;
// Realizar un método que reciba un número y dos unidades de medida de
// temperatura (C, F o K) y realice la conversión entre las unidades indicas.
// ▪ Validar que las unidades sean válidas
// ▪ Validar que las unidades no sean iguales
public class eje3ro_2 {
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
    static char medInicial(){
        char m = Character.toUpperCase(dato.next().charAt(0));
        boolean bandera = false;
        do {
          if(m=='C'|| m=='F'||m=='K'){
            bandera=true;
          }else{
            System.out.print("DATO INCORRECTO!!!\nVuleva a Ingresar: ");
            m = Character.toUpperCase(dato.next().charAt(0));
          }
          }while(!bandera);
          
          return m;
        }
    static String cambMedida(){
        
        char letra = medInicial(), cM=' ';
        
        if (letra=='C'){
            System.out.print("Puede convertir\nCelsius a Fahrenheit 'F'\n"+
                                              "Celsius a Kelvin 'K': ");
        }
   
    } 
    
    static double recibe(int n, String medActual, String med_a_conver){
        
        
        return 0;
    }
    public static void main(String[] args) {
        int valorM;
        Scanner dato = new Scanner(System.in);
        System.out.println("CONVERTIDOR DE MEDIDA");
        System.out.print("Ingrese valor a convertir: ");
        valorM=formato_a_Num();
        System.out.print("Ingrese su medidada de temperatura\n" +
                         "Celsius la letra 'C'\nFahrenheit la letra 'F'\n" +
                         "Kelvin la letra 'K' :");
        System.out.println(valorM+" "+medInicial());

        dato.close();
    }
    
}
