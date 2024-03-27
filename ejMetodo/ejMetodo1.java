import java.util.Scanner;
public class ejMetodo1 {
    static float pre, total;
    static int cant;
    static Scanner dato = new Scanner(System.in);

    public static float calcUloTotal(int cantidad, float precio) {
        float calculo=cantidad*precio;

        return calculo;
    }
    
    public static void main(String[] args) {
        boolean aprova=false;
        
        System.out.println("Calculo de cantidades ");
        do {
        System.out.print("Ingrese la cantidad: ");
        cant= dato.nextInt();
        System.out.print("Ingresa el precio: ");
        pre= dato.nextFloat();
        if(cant>0&&pre>0){
        aprova=true;
        total=calcUloTotal(cant, pre);
        }else System.out.println("Debe ingresar datos positivos\nVulva a ingresar los datos");
    }while(!aprova);
        System.out.print("El calculo de lo ingresado es: "+ total);
        dato.close();
    }
}
