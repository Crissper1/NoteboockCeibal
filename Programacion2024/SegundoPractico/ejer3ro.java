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
      System.out.println("CONVERTIDOR DE MEDIDA");
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
      public static char medida(){
            Scanner dato = new Scanner(System.in);
            char m;
            boolean bandera=false;
            do {
            
            System.out.println("Ingrese su medidada de temperatura\nCelsius la letra 'C'");
             System.out.print("Fahrenheit la letra 'F'\nKelvin la letra 'K' : ");
            m=dato.nextLine().charAt(0);
            m=Character.toUpperCase(m);
            if(m=='C'|| m=='F'||m=='K'){
              bandera=true;
            }else{
              System.out.println("DATO INCORRECTO");
            }
            }while(!bandera);
            
            return m;
          }
      public static String cambMedia(char m) {
        Scanner dato = new Scanner(System.in);
        String letra = String.valueOf(m),opvalor="1";
        System.out.println("CONVERTIDOR DE MEDIDA");
        do {
            if (letra.equals("C")) {
                System.out.print("Puede convertir\n1- Celsius a Fahrenheit\n2- Celsius a Kelvin: ");
                try {   
                    opvalor = dato.next();
                    Integer.parseInt(opvalor);    
                } catch (NumberFormatException e) {
                    System.out.print("Dato incorrecto! Ingrese un número entero (1 o 2): ");
                    dato.nextLine();
                   
                }finally{dato.close();}
            } else if (letra.equals("F")) {
                System.out.print("Puede convertir N° \n1- Fahrenheit a Celsius\n2- Fahrenheit a Kelvin: ");
                try { 
                  Integer.parseInt(opvalor);  
                  opvalor = dato.nextLine();    
                } catch (NumberFormatException e) {
                    System.out.println("Dato incorrecto! Ingrese un número entero (1 o 2): ");
                    dato.nextLine();
                }
            } else if (letra.equals("K")) {
                System.out.print("Puede convertir N° \n1- Kelvin a Celsius\n2- Kelvin a Fahrenheit\nes: ");
                try {
                  opvalor = dato.nextLine();
                  Integer.parseInt(opvalor);
                } catch (NumberFormatException e) {
                    System.out.print("Dato incorrecto! Ingrese un número entero (1 o 2): ");
                    dato.nextLine();
                }   
            } else {
                System.out.println("Unidad seleccionada no es válida.");
            }
            if (!opvalor.equals("1")  && !opvalor.equals("2")) {
                System.out.println("Opción no válida. Ingrese 1 o 2.");
            }
        } while (!opvalor.equals("1")  && !opvalor.equals("2"));
        return opvalor;
    }
    
    public static void main(String[] args) {
      int vl=ValorN();
      float  valorConver=0;
      char m=medida(),m1=' ';
      String cM = cambMedia(m);
      if(m=='C'){
        //Celsius a Fahrenheit
      if(cM.equals("1")){
        valorConver=(vl * 9/5) + 32;
        m1='F';
      }
        //Celsius a kelvin
      if(cM.equals("2")){
        valorConver= (vl  + 273);
        m1='K';
      }
    }
    if(m=='F'){
        //Fahrenheit a Celsius 
      if(cM.equals("1")){
        valorConver=(vl * 5/9) - 32;
        m1='C';
      }
        //Fahrenheit a Kelvin
      if(cM.equals("2")){
        valorConver= (vl + 459 * 5/9);
        m1='K';
      }
    }
    if(m=='K'){
      //Kelvin a Celsius
      if(cM.equals("1")){
        valorConver=(vl - 273);
        m1='C';
      }
      //Kelvin a Fahrenheit
      if(cM.equals("2")){
        valorConver= (vl - 273 * 9/5 + 32);
        m1='F';
      } 
    }
      System.out.println(vl+"°"+m+ " son "+valorConver+"°"+m1);
 
  }
}


