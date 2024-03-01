package figurageometrica;
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        circulo.dibujar();
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println();

        Rectangulo rectangulo = new Rectangulo(4, 6, "Azul", "Rojo");
        rectangulo.dibujar();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        System.out.println();

        Triangulo triangulo = new Triangulo(3, 4);
        triangulo.dibujar();
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}