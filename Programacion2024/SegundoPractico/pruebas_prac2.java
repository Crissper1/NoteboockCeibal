package SegundoPractico;

public class pruebas_prac2 {
    public static void main(String[] args) {
        int ancho = 4;
        int largo = 4;
        for (int i = 0; i <= ancho; i++) {
            
            for (int j = 0; j <= largo; j++) {
                if (i == 0 || i == ancho -1 || j == 1 || j < largo -1){
                    if (j < 1 || j == largo -1 ){
                        System.out.print("*");
                    }
                    else 
                    {
                        System.out.print(" ");
                    }      
                }
                
            }
            System.out.println();
    }
}
}
