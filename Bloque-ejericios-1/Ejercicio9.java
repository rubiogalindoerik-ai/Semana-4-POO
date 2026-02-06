import java.util.Scanner;

class Libro {
  private String titulo;
  private String autor;
  private int totalEjemplares;
  private int ejemplaresPrestados;

  public Libro(String titulo, String autor, int totalEjemplares) {
    this.titulo = titulo;
    this.autor = autor;
    this.totalEjemplares = totalEjemplares;
    this.ejemplaresPrestados = 0;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getTotalEjemplares() {
    return totalEjemplares;
  }

  public void setTotalEjemplares(int totalEjemplares) {
    this.totalEjemplares = totalEjemplares;
  }

  public int getEjemplaresPrestados() {
    return ejemplaresPrestados;
  }

  public boolean prestar() {
    if (totalEjemplares - ejemplaresPrestados > 0) {
      ejemplaresPrestados++;
      return true;
    }
    return false;
  }

  public boolean devolver() {
    if (ejemplaresPrestados > 0) {
      ejemplaresPrestados--;
      return true;
    }
    return false;
  }

  public void mostrarInfo() {
    System.out.println("----- Información del libro -----");
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Total de ejemplares: " + totalEjemplares);
    System.out.println("Ejemplares prestados: " + ejemplaresPrestados);
    System.out.println("Ejemplares disponibles: "
        + (totalEjemplares - ejemplaresPrestados));
    System.out.println("--------------------------------");
  }
}

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Libro libro = new Libro("Harry Potter", "J. K. Rowling", 3);
    int opcion;
    do {
      System.out.println("\n------------ MENÚ -----------");
      System.out.println("1. Ver información del libro");
      System.out.println("2. Prestar un ejemplar");
      System.out.println("3. Devolver un ejemplar");
      System.out.println("4. Salir");
      System.out.print("Elige una opción: ");
      opcion = sc.nextInt();
      switch (opcion) {
        case 1:
          libro.mostrarInfo();
          break;
        case 2:
          if (libro.prestar()) {
            System.out.println("Préstamo realizado con éxito.");
          } else {
            System.out.println("No hay ejemplares disponibles.");
          }
          break;
        case 3:
          if (libro.devolver()) {
            System.out.println("Devolución realizada con éxito.");
          } else {
            System.out.println("No hay ejemplares prestados.");
          }
          break;
        case 4:
          System.out.println("Saliendo");
          break;
        default:
          System.out.println("Opción no válida.");
      }
    } while (opcion != 4);
  }
}
