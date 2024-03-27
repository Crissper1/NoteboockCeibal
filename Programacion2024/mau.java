public class mau {
    public static void main(String[] args) {
        int tamaño = 5;
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < tamaño -i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 2; i < tamaño +1; i++) {
            for (int j = 0; j < tamaño -i  ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        
    }
}
