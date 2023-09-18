package classes;

public class CalculadorArea {
  public double somarAreas(FiguraGeometrica[] figuras) {
    double areaTotal = 0;
    for (int i = 0; i < figuras.length; i++) {
      areaTotal += figuras[i].calcularArea();
    }
    return areaTotal;
  }
}
