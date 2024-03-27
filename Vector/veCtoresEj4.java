/*Escribir un programa que solicite al usuario completar un vector de enteros de 20
lugares. Luego el programa debe solicitar al usuario un número y devolverle la
posición en la que este se encuentra. Si este no se encuentra en el vector debe
devolver un mensaje. */
import java.util.Scanner;

public class veCtoresEj4 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int num[]=new int[20];
        boolean numEsta=false;
        int indi=0,numN;
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingresa numeros: ");
            num[i]=dato.nextInt();
        }
        System.out.print("Ingresa Numero a Buscar: ");
        numN=dato.nextInt();
        for (int i = 0; i < num.length; i++) {
            if(numN==num[i]){
                numEsta=true;
                indi=i;
                break;
            }
        }
        if(numEsta==true){
            System.out.println("El Numero ingresado es "+numN+" esta en la pocicion "+indi);
        }
         else {System.out.println("No esta");}
         dato.close();



        
    }
}
