public class prueba1 {
    public static void main(String[] args) {
        int tamaño=5;
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < tamaño - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }       
        for (int i = 1; i < tamaño; i++) {
            for (int j = 0; j < tamaño - i -1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
