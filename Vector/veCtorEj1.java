import java.util.Random;
/*Llenar un vector con una lista de números del 1 al 20 y que se despliegue este
vector indicando a la derecha de cada uno si es divisible por 3 o no. */
public class veCtorEj1 {
    public static void main(String[] args) {
        int lista[];
        Random ram = new Random();
        lista = new int[20];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = ram.nextInt(20);
        }
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 3 == 0)
                System.out.print(lista[i] + " Es divicible por 3\n");
            else if (lista[i] % 3 != 0) {
                System.out.println(lista[i] + " No es divicible...");
            }
        }

    }
}
