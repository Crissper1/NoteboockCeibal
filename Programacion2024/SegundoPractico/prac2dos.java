package SegundoPractico;

public class prac2dos {

    static int dosnum(int largo , int ancho){

        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < largo; j++) {
                if (i <= 0 && i  < ancho){
                System.out.print("*");
                }
            }
            System.out.println();

        }
        return dosnum(largo, ancho);
    }
    public static void main(String[] args) {
        dosnum(7, 5);

    }
}
