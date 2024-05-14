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
    static char cambMedida(){
        char letra = medInicial(), cM=' ';
        
        if (letra=='C'){
            do {
            System.out.print("Puede convertir\nCelsius a Fahrenheit 'F'\n"+
                                              "Celsius a Kelvin 'K': ");
            cM=Character.toUpperCase(dato.next().charAt(0));
            if(cM!='F'|| cM!='K'){
                System.out.println("Dato Incorrecto!!!Vuleva a Intenta");
            }
            }while(cM!='F'|| cM!='K');
        }
        if (letra=='F'){
            do {
            System.out.print("Puede convertir\nFahrenheit a Celsius 'C'\n"+
                                              "Fahrenheit a Kelvin 'K': ");
            cM=Character.toUpperCase(dato.next().charAt(0));
            if(cM!='F'|| cM!='K'){
                System.out.println("Dato Incorrecto!!!Vuleva a Intenta");
            }
            }while(cM!='C'|| cM!='K');
        }
        if (letra=='K'){
            do {
            System.out.print("Puede convertir\nKelvin a Celsius 'C'\n"+
                                              "Kelvin a Fahrenheit 'F': ");
            cM=Character.toUpperCase(dato.next().charAt(0));
            if(cM!='F'|| cM!='K'){
                System.out.println("Dato Incorrecto!!!Vuleva a Intenta");
            }
            }while(cM!='F'|| cM!='C');
        }
        return cM;
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
        char mI=medInicial(), cM=cambMedida();
        System.out.println(valorM+" "+mI+"Valor a convertir"+ cM);

        dato.close();
    }
    
}
