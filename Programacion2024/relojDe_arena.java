public class relojDe_arena {
    public static void main(String[] args) {
        int tamaño = 5;
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (j < i || j > tamaño) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = tamaño -2 ; i >= 0; i--) {
            for (int j = 0 ; j < tamaño ; j++) {
                if (j < i || j > tamaño   ) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
}
}

