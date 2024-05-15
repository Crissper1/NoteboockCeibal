package SegundoPractico;

import java.util.Scanner;
// Realizar un método que reciba un número y dos unidades de medida de
// temperatura (C, F o K) y realice la conversión entre las unidades indicas.
// ▪ Validar que las unidades sean válidas
// ▪ Validar que las unidades no sean iguales
public class eje3ro {
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
        char m = Character.toUpperCase(dato.nextLine().charAt(0));
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
    static char cambMedida(char med_inicial){
        char letra = med_inicial , medActual=' ';
        
        if (letra=='C'){
            do {
            System.out.print("Puede convertir\nCelsius a Fahrenheit 'F'\n"+
                                              "Celsius a Kelvin 'K': ");
            medActual=Character.toUpperCase(dato.next().charAt(0));
            if(medActual!='F' && medActual!='K'){
                System.out.println("Dato Incorrecto!!!Vuleva a Intenta");
            }
            }while(medActual!='F'&& medActual!='K');
        }
        if (letra=='F'){
            do {
            System.out.print("Puede convertir\nFahrenheit a Celsius 'C'\n"+
                                              "Fahrenheit a Kelvin 'K': ");
            medActual=Character.toUpperCase(dato.next().charAt(0));
            if(medActual!='C'&& medActual!='K'){
                System.out.println("Dato Incorrecto!!!Vuleva a Intenta");
            }
            }while(medActual!='C'&& medActual!='K');
        }
        if (letra=='K'){
            do {
            System.out.print("Puede convertir\nKelvin a Celsius 'C'\n"+
                                              "Kelvin a Fahrenheit 'F': ");
            medActual=Character.toUpperCase(dato.next().charAt(0));
            if(medActual!='F'&& medActual!='C'){
                System.out.println("Dato Incorrecto!!!Vuleva a Intenta");
            }
            }while(medActual!='F'&& medActual!='C');
        }
        return medActual;
    }
    static double recibe(int n, char medActual, char med_a_conver){
        double valorConver =0;
        if(medActual=='C'){
            //Celsius a Fahrenheit
          if(med_a_conver=='F'){
            valorConver=(n * 9/5) + 32;
          }
            //Celsius a kelvin
          if(med_a_conver=='K'){
            valorConver= (n  + 273);
          }
        }
        if(medActual=='F'){
            //Fahrenheit a Celsius 
          if(med_a_conver=='C'){
            valorConver=(n * 5/9) - 32;
          }
            //Fahrenheit a Kelvin
          if(med_a_conver=='K'){
            valorConver= (n + 459 * 5/9);  
          }
        }
        if(medActual=='K'){
          //Kelvin a Celsius
          if(med_a_conver=='C'){
            valorConver=(n - 273);
          }
          //Kelvin a Fahrenheit
          if(med_a_conver=='F'){
            valorConver= (n - 273 * 9/5 + 32);
          } 
        }
          System.out.println(n+"°"+medActual+ " son "+valorConver+"°"+med_a_conver);
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
        char mI=medInicial(), medActual=cambMedida(mI);
        recibe(valorM, mI, medActual);
        dato.close();
    }
    
}
