package figurageometrica;
public class Circulo extends FiguraGeometrica {
    private final double radio;
    public Circulo(double radio) {
        super();
        this.radio = radio;
    }
    public Circulo(double radio, String colorLinea, String colorRelleno) {
        super(colorLinea, colorRelleno);
        this.radio = radio;
    }
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo con radio " + radio + ", color de línea " + colorLinea + " y color de relleno " + colorRelleno);
    }
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}