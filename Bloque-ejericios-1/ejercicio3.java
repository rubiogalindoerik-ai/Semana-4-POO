import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingresa un número del 1 al 10 para mostrar su tabla: ");
            int num = sc.nextInt();
            if (num < 0 || num > 10) {
                System.out.println("Solo puede ser del 1 al 10");
            } else {
                for (int i = 1; i < 11; i++) {
                    System.out.println(num + " * " + i + " = " + (num*i));
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Ingresa un número entero");
        }
    }
}
