package inventariable;
public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Sudaderas", 30);
        Producto producto2 = new Producto("Pantalones", 20);

        System.out.println("Stock inicial:");
        mostrarStock(producto1);
        mostrarStock(producto2);

        producto1.actualizarStock(-20);
        producto2.actualizarStock(30);

        System.out.println("\nStock 2:");
        mostrarStock(producto1);
        mostrarStock(producto2);
    }
    private static void mostrarStock(Producto producto) {
        System.out.println("Stock de " + producto.getNombre() + ": " + producto.obtenerStock());
    }
}