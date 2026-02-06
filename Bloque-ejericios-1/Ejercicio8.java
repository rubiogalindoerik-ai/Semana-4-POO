import java.util.Scanner;

public class Ejercicio8 {
  public static int buscarElemento(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Cuantos numeros son?: ");
    int n = sc.nextInt();
    int[] arreglo = new int[n];
    System.out.println("Ingresa los elementos del arreglo:");
    for (int i = 0; i < n; i++) {
      arreglo[i] = sc.nextInt();
    }
    System.out.print("Número a encontrar: ");
    int x = sc.nextInt();
    int indice = buscarElemento(arreglo, x);
    if (indice != -1) {
      System.out.println("El número " + x + " se encontró en el índice: " + indice);
    } else {
      System.out.println("El número " + x + " no se encuentra en el arreglo.");
    }
  }
}
