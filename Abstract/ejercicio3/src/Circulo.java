package figurageometrica;
public class Circulo extends FiguraGeometrica {
    double radio;
    Circulo(double radio) {
        this.radio = radio;
    }
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}