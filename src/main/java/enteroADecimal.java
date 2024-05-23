import java.util.Scanner;

public class enteroADecimal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número con decimales: ");

        //Se almacena el número digitado por el usuario
        double num  = scanner.nextDouble();

        //Se separa la parte decimal del número ingresado
        double decimal = num % 1;

        //se le resta la parte decimal al número para dejar solo la parte entera
        double entero = num - decimal;

        //se muestra la parte decimal de número ingresado con 3 número despues de la coma
        System.out.println("El número decimal es: " + String.format("%.3f", decimal));

        //sepasa el numero entero que esta declarado como double a entero
        int enterof = (int) entero;

        //Se muestra la parte entera del número ingresado.
        System.out.println("El nmero entero es: " + enterof);
    }
}
