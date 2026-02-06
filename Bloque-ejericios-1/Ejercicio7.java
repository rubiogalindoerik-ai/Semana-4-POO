import java.util.Scanner;

class Rectangulo {
  private double ancho;
  private double alto;

  public Rectangulo(double ancho, double alto) {
    this.ancho = ancho;
    this.alto = alto;
  }

  public double getAncho() {
    return ancho;
  }

  public double getAlto() {
    return alto;
  }

  public void setAncho(double ancho) {
    this.ancho = ancho;
  }

  public void setAlto(double alto) {
    this.alto = alto;
  }

  public double calcularArea() {
    return ancho * alto;
  }

  public double calcularPerimetro() {
    return 2 * (ancho + alto);
  }
}

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double ancho = 0;
    double alto = 0;
    try {
      System.out.print("Ancho: ");
      ancho = sc.nextDouble();
      System.out.print("Alto: ");
      alto = sc.nextDouble();
      if (ancho <= 0 || alto <= 0) {
        System.out.println("El ancho y el alto deben ser positivos.");
        return;
      }
      Rectangulo r = new Rectangulo(ancho, alto);
      System.out.println("Área: " + r.calcularArea());
      System.out.println("Perímetro: " + r.calcularPerimetro());
    } catch (Exception e) {
      System.out.println("Error: debes ingresar valores numéricos.");
    }
  }
}
