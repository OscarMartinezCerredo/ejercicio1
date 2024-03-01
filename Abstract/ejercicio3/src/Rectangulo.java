package figurageometrica;
public class Rectangulo extends FiguraGeometrica {
    double base;
    double altura;
    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcularArea() {
        return base * altura;
    }
}