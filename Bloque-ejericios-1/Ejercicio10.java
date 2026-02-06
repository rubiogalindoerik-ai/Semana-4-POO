import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
    do {
      System.out.println("\n--- MENÚ ---");
      System.out.println("1. Sumar");
      System.out.println("2. Restar");
      System.out.println("3. Multiplicar");
      System.out.println("4. Dividir");
      System.out.println("5. Salir");
      System.out.print("Elige una opción: ");
      opcion = sc.nextInt();
      double a, b;
      switch (opcion) {
        case 1:
          System.out.print("Ingresa el primer número: ");
          a = sc.nextDouble();
          System.out.print("Ingresa el segundo número: ");
          b = sc.nextDouble();
          System.out.println("Suma: " + (a + b));
          break;
        case 2:
          System.out.print("Ingresa el primer número: ");
          a = sc.nextDouble();
          System.out.print("Ingresa el segundo número: ");
          b = sc.nextDouble();
          System.out.println("Resta: " + (a - b));
          break;
        case 3:
          System.out.print("Ingresa el primer número: ");
          a = sc.nextDouble();
          System.out.print("Ingresa el segundo número: ");
          b = sc.nextDouble();
          System.out.println("Multiplicación: " + (a * b));
          break;
        case 4:
          System.out.print("Ingresa el dividendo: ");
          a = sc.nextDouble();
          do {
            System.out.print("Ingresa el divisor: ");
            b = sc.nextDouble();

            if (b == 0) {
              System.out.println("Error: no se puede dividir entre cero. Ingresa otro divisor.");
            }
          } while (b == 0);
          System.out.println("División: " + a + " / " + b + " = " + (a / b));
          break;
        case 5:
          System.out.println("Saliendo del programa...");
          break;
        default:
          System.out.println("Opción no válida.");
      }
    } while (opcion != 5);
  }
}
