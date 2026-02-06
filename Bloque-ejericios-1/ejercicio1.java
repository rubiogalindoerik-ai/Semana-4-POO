import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Primer numero: ");
            int num1 = sc.nextInt();
            System.out.print("Segundo numero: ");
            int num2 = sc.nextInt();
            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1+num2));
        } catch (InputMismatchException ex) {
            System.out.println("Debes ingresar un número entero");
        }
        }        
}
