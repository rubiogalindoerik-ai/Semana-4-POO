import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        if (edad < 14) {
            System.out.println("Hola " + nombre + ", eres un niño");
        } else if (edad > 13 && edad < 18) {
            System.out.println("Hola " + nombre + ", eres un adolescente");
        } else if (edad > 17 && edad < 66) {
            System.out.println("Hola " + nombre + ", eres un adulto");
        } else if (edad > 65) {
            System.out.println("Hola " + nombre + ", eres un adulto mayor");
        }
    }
}
