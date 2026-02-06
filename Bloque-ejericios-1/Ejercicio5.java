import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa una palbara sin espacios: ");
    String palabra = sc.nextLine();
    String minuscula = palabra.toLowerCase();
    char[] caracteres = minuscula.toCharArray();
    int vocales = 0;
    int consonantes = 0;
    for (int i = 0; i < caracteres.length; i++) {
      if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o'
          || caracteres[i] == 'u') {
        vocales = vocales + 1;
      } else {
        consonantes = consonantes + 1;
      }
    }
    System.out.println("vocales: " + vocales);
    System.out.println("consonantes: " + consonantes);
  }
}
