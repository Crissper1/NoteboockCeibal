import java.util.Scanner;

public class calculadoraJava {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, resul = 0;
        boolean noRepetir = true;
        String calcular;
        Scanner input = new Scanner(System.in);
        do {
            if (noRepetir) {
                System.out.println(
                        "Bienvenido a la super calculadora\nPara poder sumar,restar,multipicar o dividir solo necesitas.\nIngresar la primera letra de cada una\nPara salir ingresa la letra X.");
            }
            System.out.print("S,R,M,D,X: ");
            calcular = input.next();

            switch (calcular) {
                case "s":
                    System.out.print("Bienvenido a la Sumatoria\nPrimer N: ");
                    num1 = input.nextInt();
                    System.out.print("Segundo N :");
                    num2 = input.nextInt();
                    resul = num1 + num2;
                    System.out.println("El resultado es: " + resul);
                    break;
                case "r":
                    System.out.print("Bienvenido a la Resta\nPrimer N: ");
                    num1 = input.nextInt();
                    System.out.print("Segundo N :");
                    num2 = input.nextInt();
                    resul = num1 - num2;
                    System.out.println("El resultado es: " + resul);
                    break;
                case "m":
                    System.out.print("Bienvenido a la Multiplicacion\nPrimer N: ");
                    num1 = input.nextInt();
                    System.out.print("Segundo N :");
                    num2 = input.nextInt();
                    resul = num1 * num2;
                    System.out.println("El resultado es: " + resul);
                    break;
                case "d":
                    System.out.print("Bienvenido a la Divicion\nPrimer N: ");
                    num1 = input.nextInt();
                    System.out.print("Segundo N :");
                    num2 = input.nextInt();
                    resul = num1 / num2;
                    System.out.println("El resultado es: " + resul);
                    break;
                case "x":
                    System.out.println("Game Over");
                    break;
                default:
                    System.out.println("Error con lo ingresado. Vuelva a intentar");

            }
            // input.close();
            // System.out.println(!calcular.equals(calcular));
            // calcular = calcular;
            noRepetir = false;
        } while (!calcular.equals("x"));
        input.close();
    }
}