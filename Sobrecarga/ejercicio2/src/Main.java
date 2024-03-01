package rectangulo;
public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(3, 15);
        System.out.println("Rectángulo 1 - Ancho: " + rectangulo1.ancho + ", Altura: " + rectangulo1.altura);

        Rectangulo rectangulo2 = new Rectangulo(4, 6);
        System.out.println("Rectángulo 2 - Ancho: " + rectangulo2.ancho + ", Altura: " + rectangulo2.altura);

        Rectangulo rectangulo3 = new Rectangulo(3, 7);
        System.out.println("Rectángulo 3 - Ancho: " + rectangulo3.ancho + ", Altura: " + rectangulo3.altura);
    }
}