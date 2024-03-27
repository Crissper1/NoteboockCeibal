public class vector_Burbuja {
    public static void main(String[] args) {
        int arreglo []= {5,4,9,2,1};
        int aux=0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length-i-1; j++) {
                if (arreglo[j] > arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
    for (int i = 0; i < arreglo.length; i++) {
        System.out.println(arreglo[i]+", ");
    }
    }
}
