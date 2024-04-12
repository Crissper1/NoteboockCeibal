package SegundoPractico;

public class prac2dos {

    static void dosnum(int largo, int ancho) {
        
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < largo; j++) {
                if (i == 0 || i == ancho - 1 || j == 0 || j == largo - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        dosnum(7, 5);

    }
}
