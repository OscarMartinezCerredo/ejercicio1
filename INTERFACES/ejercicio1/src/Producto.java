package inventariable;
public class Producto implements Inventariable {
    private final String nombre;
    private int stock;
    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }
    @Override
    public int obtenerStock() {
        return stock;
    }
    @Override
    public void actualizarStock(int cantidad) {
        stock += cantidad;
    }
    public String getNombre() {
        return nombre;
    }
}