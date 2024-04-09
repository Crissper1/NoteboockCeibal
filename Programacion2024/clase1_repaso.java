import java.util.Scanner;
public class clase1_repaso {

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ejempolo de arreglo");
    int[] num = new int[5];
    for (int i = 0; i < num.length; i++) {
        System.out.println("indice " + i + " = " + num[i]);
   
    }

    for (int i = 0; i < num.length; i++) {
        System.out.println("Ingresar los nuevos valores del vector");
        num[i] = input.nextInt();

    }
    for (int i = 0; i < num.length; i++) {
        System.out.println("indice ingresado " + i + " = " + num[i]);
        

    }
    input.close();
 }  

}
