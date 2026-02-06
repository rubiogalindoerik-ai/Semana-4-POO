import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Frase: ");
    String frase = sc.nextLine();
    String limpia = "";
    for (int i = 0; i < frase.length(); i++) {
      char c = frase.charAt(i);
      if (c != ' ') {
        if (c >= 'A' && c <= 'Z') {
          c = (char) (c + 32);
        }
        limpia += c;
      }
    }
    boolean esPalindromo = true;
    int izquierda = 0;
    int derecha = limpia.length() - 1;
    while (izquierda < derecha) {
      if (limpia.charAt(izquierda) != limpia.charAt(derecha)) {
        esPalindromo = false;
        break;
      }
      izquierda++;
      derecha--;
    }
    if (esPalindromo) {
      System.out.println("La frase es un palíndromo.");
    } else {
      System.out.println("La frase NO es un palíndromo.");
    }
  }
}
