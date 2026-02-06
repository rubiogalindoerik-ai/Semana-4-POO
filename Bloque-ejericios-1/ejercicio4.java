import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Cuántas materias hay?: ");
    int num = sc.nextInt();
    double[] calf = new double[num];
    double total = 0;
    for (int i = 0; i < num; i++) {
      System.out.println("Ingresa la calificación: ");
      calf[i] = sc.nextDouble();
      total = total + calf[i];
    }
    double prom = total / num;
    int aprob = 0;
    int reprob = 0;
    for (int i = 0; i < num; i++) {
      if (calf[i] >= 70) {
        aprob = aprob + 1;
      } else {
        reprob = reprob + 1;
      }
    }
    System.out.println("Promedio: " + prom);
    System.out.println("Aprobadas: " + aprob);
    System.out.println("Reprobadas: " + reprob);
  }
}
