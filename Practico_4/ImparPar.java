

import java.util.Random;

public class ImparPar {
    public static void main(String[] args) {
        int num, sumapares = 0, sumaimpares = 0;
        Random rand = new Random();
        num = rand.nextInt(100);
        for (int i = 1; i <= 10; i++) {
            num = rand.nextInt(100);
            // System.out.println("El numero al azar es " + num);
            if (num % 2 == 0) {
                System.out.println("es par el " + num);
                sumapares += num;
            } else {
                System.out.println("es impar el " + num);
                sumaimpares += num;
            }
        }
        System.out
                .println("La suma de los numeros pares es " + sumapares + "\nLa suma de los impares es " + sumaimpares);
    }

}
