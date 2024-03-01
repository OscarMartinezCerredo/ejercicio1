package filtrableyordenable;
public class Datos implements Filtrable, Ordenable {
    private String[] datos;
    public Datos(String[] datos) {
        this.datos = datos;
    }
    @Override
    public void filtrar() {
        System.out.println("Datos filtrados");
    }
    @Override
    public void ordenar() {
        System.out.println("Datos ordenados");
    }
}