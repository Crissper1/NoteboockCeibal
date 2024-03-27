import java.util.Scanner;

public class nombredad {
    public static void main(String[] args) {
        String nom;
        int edad = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su Nombre: ");
        nom = input.next();
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        System.out.print("Su Nombre es: " + nom + "\nSu Edad es: " + edad + " años");
        input.close();

    }

}
