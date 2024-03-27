

import java.util.Scanner;

/*2) Escribir un programa que solicite tres números y los almacene en variables y luego de 3 opciones:
	1- mostrar suma
	2- mostrar promedio
	3- mostrar menor
	0- salir */
public class esCristoej2 {
    public static void main(String[] args) {
        int n1, n2, n3, menor, menu;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresa N1: ");
        n1 = dato.nextInt();
        System.out.println("Ingresa N2: ");
        n2 = dato.nextInt();
        System.out.println("Ingresa N3: ");
        n3 = dato.nextInt();
        System.out.println("Ingresa el numero para cada una\n1-Suma \n2-Promedio\n3-Menor\n0-Salir");
        menu = dato.nextInt();
        switch (menu) {
            case 1:
                System.out.println("La suma de los Numeros es: " + (n1 + n2 + n3));
                break;
            case 2:
                System.out.println("El promedio es: " + (n1 + n2 + n3) / 3);
                break;
            case 3:
                if (n1 < n2 && n1 < n3)
                    menor = n1;
                else if (n2 < n3)
                    menor = n2;
                else
                    menor = n3;
                System.out.println("El numero menor es: " + menor);
                break;
            case 0:
                System.out.println("GAME OVER");
                break;
            default:
                System.out.println("Lo ingresado es incorrecto");
                break;
        }
        dato.close();

    }
}
