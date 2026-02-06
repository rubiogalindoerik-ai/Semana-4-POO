import java.util.Scanner;

class Articulo {
  private String codigo;
  private String descripcion;
  private double precio;
  private int existencia;

  public Articulo(String codigo, String descripcion, double precio, int existencia) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precio = precio;
    this.existencia = existencia;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getExistencia() {
    return existencia;
  }

  public void mostrar() {
    System.out.println(
        "Código: " + codigo +
            ", Descripción: " + descripcion +
            ", Precio: " + precio +
            ", Existencia: " + existencia);
  }

  public boolean actualizarExistencia(int cantidad) {
    if (existencia + cantidad < 0) {
      System.out.println("No hay suficiente existencia para vender esa cantidad.");
      return false;
    }
    existencia += cantidad;
    return true;
  }
}

public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Articulo[] inventario = new Articulo[5];
    int opcion = 0;
    do {
      System.out.println("\n--- MENÚ ---");
      System.out.println("1. Agregar artículo");
      System.out.println("2. Mostrar artículos");
      System.out.println("3. Vender artículo");
      System.out.println("4. Reabastecer artículo");
      System.out.println("5. Salir");
      System.out.print("Elige una opción: ");
      try {
        opcion = sc.nextInt();
      } catch (Exception e) {
        System.out.println("Opción inválida.");
        sc.next();
        continue;
      }
      switch (opcion) {
        case 1:
          int posLibre = -1;
          for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) {
              posLibre = i;
              break;
            }
          }
          if (posLibre == -1) {
            System.out.println("Inventario lleno.");
            break;
          }
          sc.nextLine();
          System.out.print("Código: ");
          String codigo = sc.nextLine();
          System.out.print("Descripción: ");
          String desc = sc.nextLine();
          double precio;
          int existencia;
          try {
            System.out.print("Precio: ");
            precio = sc.nextDouble();
            System.out.print("Existencia: ");
            existencia = sc.nextInt();
            if (precio < 0 || existencia < 0) {
              System.out.println("Precio y existencia deben ser positivos.");
              break;
            }
            inventario[posLibre] = new Articulo(codigo, desc, precio, existencia);
            System.out.println("Artículo agregado correctamente.");
          } catch (Exception e) {
            System.out.println("Error en datos numéricos.");
            sc.next();
          }
          break;
        case 2:
          boolean hayArticulos = false;
          for (Articulo a : inventario) {
            if (a != null) {
              a.mostrar();
              hayArticulos = true;
            }
          }
          if (!hayArticulos) {
            System.out.println("No hay artículos registrados.");
          }
          break;
        case 3:
          sc.nextLine();
          System.out.print("Código del artículo: ");
          String codVenta = sc.nextLine();
          Articulo artVenta = buscarArticulo(inventario, codVenta);
          if (artVenta == null) {
            System.out.println("Artículo no encontrado.");
            break;
          }
          try {
            System.out.print("Cantidad a vender: ");
            int cantidad = sc.nextInt();
            if (cantidad <= 0) {
              System.out.println("Cantidad inválida.");
              break;
            }
            if (artVenta.actualizarExistencia(-cantidad)) {
              System.out.println(
                  "Venta realizada. Nueva existencia: " +
                      artVenta.getExistencia());
            }
          } catch (Exception e) {
            System.out.println("Cantidad inválida.");
            sc.next();
          }
          break;
        case 4:
          sc.nextLine();
          System.out.print("Código del artículo: ");
          String codReab = sc.nextLine();
          Articulo artReab = buscarArticulo(inventario, codReab);
          if (artReab == null) {
            System.out.println("Artículo no encontrado.");
            break;
          }
          try {
            System.out.print("Cantidad a agregar: ");
            int cantidad = sc.nextInt();
            if (cantidad <= 0) {
              System.out.println("Cantidad inválida.");
              break;
            }
            artReab.actualizarExistencia(cantidad);
            System.out.println(
                "Reabastecimiento exitoso. Nueva existencia: " +
                    artReab.getExistencia());
          } catch (Exception e) {
            System.out.println("Cantidad inválida.");
            sc.next();
          }
          break;
        case 5:
          System.out.println("Saliendo");
          break;
        default:
          System.out.println("Opción no válida.");
      }
    } while (opcion != 5);
  }

  private static Articulo buscarArticulo(Articulo[] arr, String codigo) {
    for (Articulo a : arr) {
      if (a != null && a.getCodigo().equals(codigo)) {
        return a;
      }
    }
    return null;
  }
}
