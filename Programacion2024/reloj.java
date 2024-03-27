public class reloj {
    public static void main(String[] args) {
        int tamaño=5;
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (j >= i && j <= tamaño ) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i < tamaño ; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (j > i && j < tamaño) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
    }
}

