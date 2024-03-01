package figurageometrica;
public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(4, 14);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        Circulo circulo = new Circulo(5);
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}