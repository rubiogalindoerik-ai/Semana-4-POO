import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String usuarioCorrecto = "admin";
    String contrasenaCorrecta = "1234";
    int intentos = 3;
    while (intentos > 0) {
      System.out.print("Usuario: ");
      String usuario = sc.nextLine();
      System.out.print("Contraseña: ");
      String contrasena = sc.nextLine();
      if (usuario.equals(usuarioCorrecto) &&
          contrasena.equals(contrasenaCorrecta)) {
        System.out.println("Acceso concedido.");
        sc.close();
        return;
      } else {
        intentos--;
        if (intentos > 0) {
          System.out.println(
              "Datos incorrectos. Te quedan " + intentos + " intentos.");
        }
      }
    }
    System.out.println("Cuenta bloqueada.");
  }
}
