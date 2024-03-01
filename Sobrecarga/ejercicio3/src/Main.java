package producto;
public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Iphone", 1000, 100);

        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: " + + producto.getPrecio() + "€");
        System.out.println("Stock: " + + producto.getStock());
    }
}