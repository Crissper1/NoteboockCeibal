import java.util.Scanner;

public class pruEbaVector {
    public static void main(String[] args) {
        int sueldo[]= new int[5];
        Scanner dato = new Scanner(System.in);
        for (int i = 0; i < sueldo.length; i++) {
            System.out.println("Ingrese valor del componente");
            sueldo[i]=dato.nextInt();

        }
        for (int i = 0; i < sueldo.length; i++) {
            System.out.print(sueldo[i]+" ");
        }
        dato.close();

    }
}
