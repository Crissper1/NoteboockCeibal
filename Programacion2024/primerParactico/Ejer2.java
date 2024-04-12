package primerParactico;
import java.util.*;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;


public class Ejer2 {
    @SuppressWarnings("deprecation")
    public static String obtenerNombreMes(int month) {
        Month mes = Month.of(month);
        return mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
    }
    public static int obtenerDiasEnMes(int mes, int año) {
        switch (mes) {
            case 2: // Febrero
                return (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) ? 29 : 28;
            case 4: case 6: case 9: case 11: // Abril, junio, septiembre, noviembre
                return 30;
            default:
                return 31;
        }
    }

    public static void main(String[] args) {
        
        /*Realizar una aplicación que solicite el ingreso del número del mes (1 – 12) y 
            muestre:
            a. la cantidad de días del mes
            b. el nombre del mes */


        int mes = 0, año = 2024;
        
        Scanner input = new Scanner(System.in);
        do { 
        System.out.print("Ingrese N° del mes: ");
        mes = input.nextInt();
        if (mes < 1 || mes > 12){
            System.out.println("Ingrese dato correcto, N° Entre 1 y 12. Vuelva a intentar... ");
        }
        }while(mes < 1 || mes > 12);
        String nombreMes = obtenerNombreMes(mes);
        int days = obtenerDiasEnMes(mes, año);
        
        System.out.println("El número de días en el mes es: " + days);
        System.out.println("El Nombre del mes es: " + nombreMes);
        input.close();
    }
    
}
