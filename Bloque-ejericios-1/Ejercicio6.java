import java.util.Scanner;

public class Ejercicio6 {
  public static boolean orden(int[] a) {
    for (int i = 1; i < a.length; i++) {
      if (a[i] < a[i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Cuántos números enteros vas a guardar?: ");
    int len = sc.nextInt();
    int[] numbers = new int[len];
    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Ingresa el número " + i + ": ");
      numbers[i] = sc.nextInt();
    }
    if (orden(numbers)) {
      System.out.println("El arreglo está ordenado.");
    } else {
      System.out.println("El arreglo no está ordenado.");
    }
  }
}
