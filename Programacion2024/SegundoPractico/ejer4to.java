package SegundoPractico;

public class ejer4to {

/* Realizar un método que reciba como parámetro la altura y muestre lo siguiente:
        ▪ altura = 5
        ▪ resultado:
                       * 
                      * *
                     * * *
                    * * * *
                   * * * * *
*/
    static void piramide(int altura){
        
for (int i = 0; i < altura; i++) {
    for (int j = 0; j < altura - i -1; j++) {
        System.out.print(" ");
    }
    for (int k = 0; k <= i; k++) {
        System.out.print("*");
    }
    System.out.println();
} 

    }
    public static void main(String[] args) {
    piramide(5);    




}
}
