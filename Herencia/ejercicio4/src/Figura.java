package figura;
abstract class Figura {
    public abstract double calcularArea();
}
class Circulo extends Figura {
    private final double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
class Rectangulo extends Figura {
    private final double base;
    private final double altura;
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return base * altura;
    }
    public static void main(String[] args) {

        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo(8);
        figuras[1] = new Rectangulo(2, 6);

        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Área Figura " + (i + 1) + ": " + figuras[i].calcularArea());
        }
    }
}