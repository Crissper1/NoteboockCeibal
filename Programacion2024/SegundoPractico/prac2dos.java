package SegundoPractico;

public class prac2dos {

    static void dosnum(int largo , int ancho){

        for (int i = 0; i <= ancho; i++) {
            
            for (int j = 0; j <= largo; j++) {
                if (i>=1 && i <= ancho -2){
                    if (j<1 || j == largo ){
                        System.out.print("*");
                    }
                    if (j==1|| j < largo -1 ){
                        System.out.print(" ");
                    }      
                }
                if (i==0 || i == ancho -1){
                    System.out.print("*");
                }
                
            }
            System.out.println();
    }
        
    }
    public static void main(String[] args) {
        dosnum(7, 5);

    }
}

