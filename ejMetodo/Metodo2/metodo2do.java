package Metodo2;

public class metodo2do {
    static void holamundo(){
        syso("hola mundo");
    }
    static void syso(String mensaje){
        System.out.println(mensaje);
    }
    static int mayorValor(int a , int b){
        int elMayor;
        if (a > b){
            elMayor = a;
        }
        else {
            elMayor = b;
        }
        return elMayor;
    }
    public static void main(String[] args) {
        holamundo();
        int elmasGrade = mayorValor(34, 65);
        syso("El mas grade es: "+ elmasGrade);

    }
}
