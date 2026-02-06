import java.util.Scanner;

class Producto {
  private String nombre;
  private double costo;
  private double impuesto; // porcentaje

  public Producto(String nombre, double costo, double impuesto) {
    this.nombre = nombre;
    this.costo = costo;
    this.impuesto = impuesto;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getCosto() {
    return costo;
  }

  public void setCosto(double costo) {
    this.costo = costo;
  }

  public double getImpuesto() {
    return impuesto;
  }

  public void setImpuesto(double impuesto) {
    this.impuesto = impuesto;
  }

  public double calcularPrecio(double utilidad) {
    double ganancia = costo * (utilidad / 100);
    double iva = (costo + ganancia) * (impuesto / 100);
    return costo + ganancia + iva;
  }
}

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    do {
      try {
        System.out.print("¿Cuántos productos vas a capturar? (máx 5): ");
        n = sc.nextInt();
        if (n <= 0 || n > 5) {
          System.out.println("Error: el número debe estar entre 1 y 5.");
        }
      } catch (Exception e) {
        System.out.println("Error: ingresa un número válido.");
        sc.next(); // limpiar buffer
      }
    } while (n <= 0 || n > 5);
    Producto[] productos = new Producto[n];
    sc.nextLine(); // limpiar salto de línea
    for (int i = 0; i < n; i++) {
      System.out.println("\nProducto " + (i + 1));
      System.out.print("Nombre: ");
      String nombre = sc.nextLine();
      double costo = 0;
      double impuesto = 0;
      while (true) {
        try {
          System.out.print("Costo: ");
          costo = sc.nextDouble();
          System.out.print("Impuesto (%): ");
          impuesto = sc.nextDouble();
          if (costo < 0 || impuesto < 0) {
            System.out.println("Los valores no pueden ser negativos.");
            continue;
          }
          break;
        } catch (Exception e) {
          System.out.println("Error: ingresa valores numéricos.");
          sc.next(); // limpiar buffer
        }
      }
      productos[i] = new Producto(nombre, costo, impuesto);
      sc.nextLine(); // limpiar buffer
    }
    double utilidad = 0;
    while (true) {
      try {
        System.out.print("\nPorcentaje de utilidad: ");
        utilidad = sc.nextDouble();
        if (utilidad < 0) {
          System.out.println("La utilidad no puede ser negativa.");
          continue;
        }
        break;
      } catch (Exception e) {
        System.out.println("Error: ingresa un número válido.");
        sc.next();
      }
    }
    System.out.println("\n--- LISTA DE PRODUCTOS ---");
    for (Producto p : productos) {
      System.out.println(
          "Producto: " + p.getNombre() +
              " | Costo: " + p.getCosto() +
              " | Impuesto: " + p.getImpuesto() +
              " | Precio final: " + p.calcularPrecio(utilidad));
    }
  }
}
