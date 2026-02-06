import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int f, c;
    do {
      System.out.print("Número de estudiantes (máx 5): ");
      f = sc.nextInt();
      System.out.print("Número de materias (máx 5): ");
      c = sc.nextInt();
      if (f <= 0 || f > 5 || c <= 0 || c > 5) {
        System.out.println("Error: valores permitidos de 1 a 5.");
      }
    } while (f <= 0 || f > 5 || c <= 0 || c > 5);
    double[][] notas = new double[f][c];
    for (int i = 0; i < f; i++) {
      System.out.println("Estudiante " + i + ":");
      for (int j = 0; j < c; j++) {
        System.out.print("  Materia " + j + ": ");
        notas[i][j] = sc.nextDouble();
      }
    }
    for (int i = 0; i < f; i++) {
      double suma = 0;
      for (int j = 0; j < c; j++) {
        suma += notas[i][j];
      }
      System.out.println("Promedio estudiante " + i + ": " + (suma / c));
    }
    for (int j = 0; j < c; j++) {
      double suma = 0;
      for (int i = 0; i < f; i++) {
        suma += notas[i][j];
      }
      System.out.println("Promedio materia " + j + ": " + (suma / f));
    }
  }
}
