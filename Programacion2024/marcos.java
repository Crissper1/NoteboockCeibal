public class marcos {
    public static void main(String[] args) {
        
    
    for (int i = 1; i <= 12; i++) {
        for (int j = 2; j <= i; j++) {
            System.out.print(" ");          
        }
        System.out.print(" "); 
        for (int k = i; k <= 12; k++) {
            System.out.print("* ");
        }
        System.out.println(); 
    }

    for (int i = 11; i >= 1; i--) {
        for (int j = 2; j <= i; j++) {
            System.out.print(" ");
        }
        System.out.print(" ");
        for (int k = i; k <= 12; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
