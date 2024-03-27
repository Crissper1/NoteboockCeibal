/*Se pide desarrollar una aplicación que permita registrar, generar y mostrar información de datos
del clima de la última semana.
La aplicación debe contener un menú que comprenda las siguientes acciones:
1- Registrar las arreglo de los 7 días de la semana (de lunes a domingo).
2- Registrar las lluvias de los 7 días de la semana (de lunes a domingo).
3- Mostrar las arreglo de los 7 días de la semana (de lunes a domingo).
4- Mostrar las lluvias de los 7 días de la semana (de lunes a domingo).
5 – Mostrar el promedio de arreglo de la semana.
6- Mostrar el promedio de lluvias de la semana.
7- Mostrar temperatura máxima de la semana.
8- Mostrar lluvia máxima de la semana.
9- Mostrar temperatura mínima de la semana.
10- Mostrar lluvia mínima de la semana.
11- Mostrar las arreglo de la semana, ordenadas de mayor a menor y a que día
corresponden.
12- Mostrar las lluvias de la semana, ordenadas de mayor a menor, y a que día corresponden.
0- Salir del programa*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class proyectoFinAño {
    static String dias[] = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
    static int[] resultado;
    
    static int menu;
    static int tem[] = new int[7];
    static int lluvias[] = new int[7];
    static Scanner dato = new Scanner(System.in);
    
    // Metodo registros en los vectores
    public static void registrarElemento(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == 0) {
                // Si el elemento es 0, indica que la posición está vacía y podemos agregar el nuevo elemento.
                arreglo[i] = elemento;
                break; // Salir del bucle una vez que se haya registrado el elemento.
            }
        }
    }
    // Metodo que encuentra el valor maximo y el minimo de un vector
    public static int[] encontrarMayorMenor(int[] arreglo) {
        
            int menor = arreglo[0];
            int mayor = arreglo[0];

            for (int i = 1; i < arreglo.length; i++) {
                if (arreglo[i] < menor) {
                    menor = arreglo[i];
                }
                if (arreglo[i] > mayor) {
                    mayor = arreglo[i];
                }
            }

            int[] resultado = {menor, mayor};
        
            return resultado;
        
        
    }
    //Metodo para mostrar los arreglos
    public static void mostrarArreglo(int[] arreglo, boolean temOllvia) {     
        if(temOllvia){
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print("La lluvia es " + arreglo[i]+ " ml para el día  " + dias[i]+ "\n");
            }
            //System.out.println(); // Agregar un salto de línea al final para separar la salida.
        }
        else if(!temOllvia)
        for (int i = 0; i < arreglo.length; i++) {
                System.out.print("La temperatura es " + arreglo[i]+ "°C del día " + dias[i]+ "\n"); 
            }
        }


    //Metodo para realizar promedios
    public static float calcularPromedio(int[] arreglo) {
        if (arreglo.length == 0) {
            System.out.println("No hay datos registrados. Debe ir a la opcion 1 o 2");
            return 0; // Manejar el caso de un arreglo vacío.
        }

        int suma = 0;
        for (int elemento : arreglo) 
        {
            suma += elemento;
        }

        // Calcular el promedio dividiendo la suma total por la cantidad de elementos.
        return (float) suma / arreglo.length;
    }
    //Combina los dos arreglos para luego ordenarlos de mayor a menor para la muestra
    public static List<ValorCadena> combinarArreglos(int[] arreglo, String[] dias) {
        List<ValorCadena> datos = new ArrayList<>();

        if (arreglo.length != dias.length) {
            throw new IllegalArgumentException("Los arreglos deben tener la misma longitud");
        }

        for (int i = 0; i < arreglo.length; i++) {
            datos.add(new ValorCadena(arreglo[i], dias[i]));
        }

        return datos;
    }
    // Constructor para inicializar la clase con un valor y una cadena
    public static class ValorCadena {
        private int valor;
        private String cadena;
    
        public ValorCadena(int valor, String cadena) {
            this.valor = valor;
            this.cadena = cadena;
        }
    
        public int getValor() {
            return valor;
        }
    
        public String getCadena() {
            return cadena;
        }
    
    }
    public static void main(String[] args) {
        int temp=0;
        int ml=0;
        System.out.println("Proyecto Clima");
        do {
        System.out.println();
        System.out.print("1- Registrar las temperaturas de los 7 días de la semana (de lunes a domingo).\r\n" + //
                "2- Registrar las lluvias de los 7 días de la semana (de lunes a domingo).\r\n" + //
                "3- Mostrar las temperaturas de los 7 días de la semana (de lunes a domingo).\r\n" + //
                "4- Mostrar las lluvias de los 7 días de la semana (de lunes a domingo).\r\n" + //
                "5- Mostrar el promedio de temperaturas de la semana.\r\n" + //
                "6- Mostrar el promedio de lluvias de la semana.\r\n" + //
                "7- Mostrar temperatura máxima de la semana.\r\n" + //
                "8- Mostrar lluvia máxima de la semana.\r\n" + //
                "9- Mostrar temperatura mínima de la semana.\r\n" + //
                "10- Mostrar lluvia mínima de la semana.\r\n" + //
                "11- Mostrar las temperaturas de la semana, ordenadas de mayor a menor y a que día corresponden.\r\n" + //
                "12- Mostrar las lluvias de la semana, ordenadas de mayor a menor, y a que día corresponden.\r\n" + //
                "0- Salir del programa \r\n" );
                
                System.out.print("Ingresa N° de la opcion deseada: ");
                menu=dato.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Bienvenido al Registro de Temperaturas de la semana");
                for(int i=0;i < tem.length; i++){
                    System.out.print("Temperatura para el dia "+ dias[i]+" : ");
                    temp=dato.nextInt();

                    registrarElemento(tem,temp);
                }
                break;
            case 2:
                System.out.println("Bienvenido al Registro de Lluvias de la semana");
                for(int i=0;i < lluvias.length; i++){
                    System.out.print("Lluvia en ml para el dia "+ dias[i]+" : ");
                    ml=dato.nextInt();
                    registrarElemento(lluvias,ml);
                }
                break;
            case 3:
                if(tem.length!=0){
                System.out.print("Muestra de Temperaturas de la Semana\n");
                mostrarArreglo(tem,false);//False para entrar en temperatura en el metodo
                }else System.out.println("No hay registro de arreglo");
                break;

            case 4:
                if(lluvias.length!=0){
                System.out.print("Muestra las lluvias en ml de la Semana\n");               
                mostrarArreglo(lluvias,true);//true para entrar en lluvias en el metodo
                }else System.out.println("No hay registro de lluvias");
              break;
            case 5:if
                (tem.length!=0){
                System.out.println("Calculo de promedios de las arreglo");
                System.out.println();
                double promedioTem = calcularPromedio(tem);
                System.out.println("El promedio de las arreglo es: " + promedioTem);
                }else System.out.println("No hay registro de arreglo");
                break;
            case 6:
                if(lluvias.length!=0){
                System.out.println("Calculo de promedios de las Lluvias de la semana");
                System.out.println();
                float promedioLluvi = calcularPromedio(lluvias);
                System.out.println("El promedio de las lluvias en ml es: " + promedioLluvi);
                }else System.out.println("No hay registro de lluvias");
                break;  
            case 7:
                if(tem.length!=0){
                resultado = encontrarMayorMenor(tem);
                System.out.println("La temperatura maxima de la semana es: " + resultado[1]+"°C");// Para aceder al mayor de las arreglo lo encuntro en resultado idice 1 del arreglo q almacena el mayor y el menor
                }else System.out.println("No hay registro de temperatura");
                break;
            case 8:
                if(lluvias.length!=0){
                resultado = encontrarMayorMenor(lluvias);
                System.out.println("La lluvia maxima de la semana es: " + resultado[1]+"ml");// Lo mismo que en el de temperatura...
                }else System.out.println("No hay registro de lluvias");
                break; 
            case 9:
                if(tem.length!=0){
                resultado = encontrarMayorMenor(tem);
                System.out.println("La temperatura minima de la semana es: " + resultado[0]+"°C");
                }else System.out.println("No hay registro de temperatura");
                break;
            case 10:
                if(lluvias.length!=0){
                resultado = encontrarMayorMenor(lluvias);
                System.out.println("La lluvia minima de la semana es: " + resultado[0]+"ml");
                }else System.out.println("No hay registro de lluvias");
                break;
            case 11:
                //Une los dos arreglos en una lista para mostrarlos en correlacion. ej lista={32, "lunes",30, "martes"....}
                List<ValorCadena> datos1 = combinarArreglos(tem, dias);
                // Ordenar la lista de ValorCadena de mayor a menor temperatura
                Collections.sort(datos1, (a, b) -> Integer.compare(b.getValor(), a.getValor()));
                //Muestro  los datos ordenados
                for (ValorCadena par : datos1) {
                System.out.println("Temperatura: " + par.getValor() + "°C, Día: " + par.getCadena());
        }
                break;
            case 12:
                //Une los dos arreglos en una lista para mostrarlos en correlacion. ej lista={32, "lunes",30, "martes"....}
                List<ValorCadena> datos2 = combinarArreglos(lluvias, dias);
                // Ordenar la lista de ValorCadena de mayor a menor temperatura
                Collections.sort(datos2, (a, b) -> Integer.compare(b.getValor(), a.getValor()));
                //Muestro  los datos ordenados
                for (ValorCadena par : datos2) {
                System.out.println("Lluvias: " + par.getValor() + "ml, Día: " + par.getCadena());
        }
                break;
            case 0:
                System.out.println("THE END");

                break;
            default:
                System.out.println("Ingreso un dato NO valido");
                break;
        }
    }while (menu!=0);

}

}
