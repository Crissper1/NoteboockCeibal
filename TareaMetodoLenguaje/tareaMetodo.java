
/*Sea B un lenguaje definido sobre V = {0,1} inductivamente donde:
1 ∈ B
0 ∈ B
Si a ∈ B → 1a1 ∈ B
Si a ∈ B → 0a0 ∈ B
C. Clausura
Y el siguiente criptograma donde existen cadenas de ese lenguaje de largo
mayor de 6 escondidas encuéntrelas
101100111010111110010101010
1000010000101000110101010101
01010100010001111101111101011
1000001110000001101010101000
1000101010001111100010011010
Una de ellas es de largo quince y es la clave de acceso a un sistema
¿Cuáles? Justifique su respuesta. */
import java.util.Scanner;

public class tareaMetodo {

    public static void buscarValoresEnMatriz(int[][] matriz, int[] arregloABuscar) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
    
        
           
            for (int fila = 0; fila < filas; fila++) {
                for (int columna = 0; columna < columnas; columna++) {
                        int valorABuscar = arregloABuscar[columna];
                        boolean encontrado = false;  
                        if (matriz[fila][columna] == valorABuscar) {
                            System.out.println("Valor encontrado: " + valorABuscar);
                            System.out.println("Fila: " + fila);
                            System.out.println("Columna: " + columna);
                            encontrado = true;
                        }
                        else if(!encontrado) {
                            System.out.println("Valor " + valorABuscar + " no se encontró en la matriz.");
                        }
                }
            }
    
            
        }
    

    public static void main(String[] args) {
        String varian = "";
        String varian1 = "101", varian2 = "111", varian3 = "000", varian4 = "010";
        // StringBuilder cadena = new StringBuilder(varian1);
        // Usamos un ciclo para permitir al usuario agregar valores
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa 1 var 101\nIngresa 2 var 111\nIngresa 3 var 000\nIngresa 4 var 010\nEs: ");
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                varian = varian1;
                break;
            case 2:
                varian = varian2;
                break;
            case 3:
                varian = varian3;
                break;
            case 4:
                varian = varian4;
                break;
            default:
                System.out.println("Datos Incorrectos");
                break;
        }
        StringBuilder cadena = new StringBuilder(varian);
        while (continuar) {
            System.out.println("Cadena actual: " + cadena);
            System.out.println("Elija una opción:");
            System.out.println("0. Agregar valor 0 ");
            System.out.println("1. Agregar valor 1 ");
            System.out.println("2. Salir");
            System.out.println("3. Para busacar cadena");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    int valorAlPrincipio = 0;
                    cadena.insert(0, valorAlPrincipio);
                    int valorAlFinal = valorAlPrincipio;
                    cadena.append(valorAlFinal);

                    break;
                case 1:
                    int valorAlPrincipio1 = 1;
                    cadena.insert(0, valorAlPrincipio1);
                    int valorAlFinal1 = valorAlPrincipio1;
                    cadena.append(valorAlFinal1);
                    break;
                case 2:
                    continuar = false;
                    break;
                case 3:
                    // Declaración e inicialización de una matriz de enteros 5x28

                    int[][] matrizBinaria = new int[5][27];

                    // Valores de la matriz
                    String datos = "101100111010111110010101010 " +
                            "1000010000101000110101010101 " +
                            "0101010001000111110111110101 " +
                            "1000001110000001101010101000 " +
                            "1000101010001111100010011010";

                    // Dividir los datos en filas
                    String[] filas = datos.split(" ");

                    // Llenar la matriz con los valores
                    for (int i = 0; i < matrizBinaria.length; i++) {
                        String fila = filas[i];
                        for (int j = 0; j < matrizBinaria[i].length; j++) {
                            char valor = fila.charAt(j);
                            matrizBinaria[i][j] = Character.getNumericValue(valor);
                        }
                    }
                    /*
                  for (int fila = 0; fila < matrizBinaria.length; fila++) {
                        for (int columna = 0; columna < matrizBinaria[fila].length; columna++) {
                            System.out.print(matrizBinaria[fila][columna] + " ");
                        }
                        System.out.println();
                    }
                    */
                    // Cadena a buscar
                    int[] valorAbuscar = {1, 0, 1};
                    buscarValoresEnMatriz(matrizBinaria, valorAbuscar);

                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

         
        scanner.close();
    }

}
