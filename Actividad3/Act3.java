import java.util.Scanner;

class Producto {
  private String codigo;
  private String descripcion;
  private String tipo;
  private Double costo;
  private Double impuesto;

  public String getCodigo() {
    return codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public String getTipo() {
    return tipo;
  }

  public Double getCosto() {
    return costo;
  }

  public Double getImpuesto() {
    return impuesto;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setCosto(Double costo) {
    this.costo = costo;
  }

  public void setImpuesto(Double impuesto) {
    this.impuesto = impuesto;
  }

  public void muestraProducto() {
    System.out.println("Código: " + codigo);
    System.out.println("Descripción: " + descripcion);
    System.out.println("Tipo: " + tipo);
    System.out.println("Costo: " + costo);
    System.out.println("Impuesto: " + impuesto);
  }

  public double calcularPrecio(double utilidad) {
    double precioConUtilidad = costo + (costo * utilidad / 100);
    double montoImpuesto = precioConUtilidad * (impuesto / 100);
    return precioConUtilidad + montoImpuesto;
  }
}

public class Act3 {
  public static String compararProductos(Producto p1, Producto p2, double utilidad) {
    double precio1 = p1.calcularPrecio(utilidad);
    double precio2 = p2.calcularPrecio(utilidad);
    if (precio1 > precio2) {
      return p1.getDescripcion();
    } else if (precio2 > precio1) {
      return p2.getDescripcion();
    } else {
      return "Ambos productos tienen el mismo precio de venta";
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Producto p1 = new Producto();
    Producto p2 = new Producto();
    try {
      System.out.print("Código producto 1: ");
      p1.setCodigo(sc.nextLine());
      System.out.print("Descripción producto 1: ");
      p1.setDescripcion(sc.nextLine());
      System.out.print("Tipo producto 1: ");
      p1.setTipo(sc.nextLine());
      System.out.print("Costo producto 1: ");
      p1.setCosto(sc.nextDouble());
      System.out.print("Impuesto producto 1 (%): ");
      p1.setImpuesto(sc.nextDouble());
      sc.nextLine();
      System.out.print("\nCódigo producto 2: ");
      p2.setCodigo(sc.nextLine());
      System.out.print("Descripción producto 2: ");
      p2.setDescripcion(sc.nextLine());
      System.out.print("Tipo producto 2: ");
      p2.setTipo(sc.nextLine());
      System.out.print("Costo producto 2: ");
      p2.setCosto(sc.nextDouble());
      System.out.print("Impuesto producto 2 (%): ");
      p2.setImpuesto(sc.nextDouble());
    } catch (Exception e) {
      System.out.println("Error en la entrada de datos.");
      sc.close();
      return;
    }
    System.out.println("\n--- PRODUCTO 1 ---");
    p1.muestraProducto();
    System.out.println("\n--- PRODUCTO 2 ---");
    p2.muestraProducto();
    System.out.print("\nPorcentaje de utilidad: ");
    double utilidad = sc.nextDouble();
    String resultado = compararProductos(p1, p2, utilidad);
    System.out.println("\nProducto con mayor precio de venta: " + resultado);
    sc.close();
  }
}
