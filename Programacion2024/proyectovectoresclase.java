/*Utilizando un array y estructuras de control, realizar una aplicación que solicite el
ingreso de 10 números enteros y luego realice las siguientes operaciones:
• mostrar el valor máximo del array
• mostrar el valor mínimo del array
• mostrar el promedio de todos elementos
• ordenar los elementos del array de mayor a menor
 */

 
import java.util.Arrays;
import java.util.Scanner;
public class proyectovectoresclase {
    public static int[] encontrarMayorMenor(int[] arreglo) {
        
        int menor = arreglo[0];
        int mayor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        int[] resultado = {menor, mayor};
    
        return resultado;
    
    
}
public static float calcularPromedio(int[] arreglo) {
    if (arreglo.length == 0) {
        System.out.println("No hay datos registrados. Debe ir a la opcion 1 o 2");
        return 0; // Manejar el caso de un arreglo vacío.
    }

    int suma = 0;
    for (int elemento : arreglo) 
    {
        suma += elemento;
    }

    // Calcular el promedio dividiendo la suma total por la cantidad de elementos.
    return (float) suma / arreglo.length;
}
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] resultado;
    int[] num = new int[3];

    for (int j = 0; j < num.length; j++) {
        System.out.print("Ingrese 10 N° "+ (j+1) + " : ");
        num[j]= input.nextInt();
    }
    //Mostrar Valor mayor
    resultado = encontrarMayorMenor(num);
   System.out.println("Valor Mayor: "+ (resultado[1]));
   //mostrar menor 
    resultado = encontrarMayorMenor(num);
    System.out.println("Valor Menor: "+ (resultado[0]));
    //mostrar promedio
    System.out.println("Calculo de promedio es  " + calcularPromedio(num));
    // Mayor menor 
    int menor;
    for(int i = 0; i < num.length; i++){
        menor = num[0];

        if (num[i] < menor){
            menor = num[i];
        }
        else{
            if (num[i] > menor){
              menor = menor;
            }      
        }
    }
    System.out.println(Arrays.toString(num));
}
}
