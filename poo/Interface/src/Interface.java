import classes.*;

public class Interface {
    public static void main(String[] args) throws Exception {
        Circulo c1 = new Circulo(1);
        System.out.println("Area: " + c1.calcularArea());

        Quadrado q1 = new Quadrado(2);
        System.out.println("Area: " + q1.calcularArea());

        FiguraGeometrica[] figuras = new FiguraGeometrica[2];
        figuras[0] = c1;
        figuras[1] = q1;

        CalculadorArea ca = new CalculadorArea();
        System.out.println("Area total: " + ca.somarAreas(figuras));
    }
}
