

import java.util.Random;

public class randomej1 {
    public static void main(String[] args) {
        int num_aleatorio = 0, cont = 0;
        Random ramd = new Random();
        for (int i = 1; i <= 15; i++) {
            num_aleatorio = ramd.nextInt(1000);
            if (num_aleatorio % 5 == 0 && num_aleatorio > 10) {
                System.out.println("El numero elegido es: " + num_aleatorio);
                cont++;
            } else {
                System.out.println("Numero que NO entran en el la condicion " + num_aleatorio);
            }

        }
        System.out.println("Hay solo: " + cont + " Nº divisibles entre 5 y mayores a 10");

    }

}
