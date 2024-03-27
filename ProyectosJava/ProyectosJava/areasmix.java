
import java.util.Scanner;

public class areasmix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero = 0;
        float base, altura, largo, ancho, resul;
        do {
            System.out.print("N°1 Area del Rectangulo\nN°2 Area del Triangulo\nN°3 GAMEOVER \nN°: ");
            numero = scan.nextInt();

            switch (numero) {
                case 1:
                    System.out.print("Area del Rectangulo\nIngrese el largo : ");
                    largo = scan.nextFloat();
                    System.out.print("Ingrese el Ancho: ");
                    ancho = scan.nextFloat();
                    resul = largo * ancho;
                    System.out.println("El Area de su Rectangulo es:\n" + largo + "x" + ancho + "=" + resul + "\n");
                    break;
                case 2:
                    System.out.print("Area del Traiangulo\nIngrese la base: ");
                    base = scan.nextFloat();
                    System.out.print("Ingrese Altura: ");
                    altura = scan.nextFloat();
                    resul = base * altura / 2;
                    System.out.print("El Area del Triaungulo es: " + base + "x" + altura + "/2" + "=" + resul);
                    break;
                case 3:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Número inválido");
                    break;

            }
        } while (numero != 3);
        scan.close();
    }
}