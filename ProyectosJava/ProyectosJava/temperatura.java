
import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        float tem;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la temperatura ambiente: ");
        tem = input.nextFloat();
        if (tem >= 20) {
            System.out.print("Es un dia templado");

        } else {
            System.out.print("Es un dia frio");

        }
        input.close();
    }
}
