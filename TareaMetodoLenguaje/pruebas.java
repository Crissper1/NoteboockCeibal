public class pruebas {
        public static void main(String[] args) {
            int[] arreglo = {1, 0, 1, 0, 1, 1, 1, 0, 1, 0};
            int[] secuencia = {1, 0, 1};
    
            buscarSecuencia(arreglo, secuencia);
        }
    
        public static void buscarSecuencia(int[] arreglo, int[] secuencia) {
            for (int i = 0; i <= arreglo.length - secuencia.length; i++) {
                boolean coincide = true;
                
                for (int j = 0; j < secuencia.length; j++) {
                    if (arreglo[i + j] != secuencia[j]) {
                        coincide = false;
                        break;
                    }
                }
    
                if (coincide) {
                    System.out.println("Secuencia encontrada en el índice " + i + " hasta el índice " + (i + secuencia.length - 1));
                }
            }
        }
    }
    

