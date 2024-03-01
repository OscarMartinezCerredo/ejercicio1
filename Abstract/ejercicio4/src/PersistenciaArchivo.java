package persistencia;
public class PersistenciaArchivo extends Persistencia {
    @Override
    public void guardarDatos() {
        System.out.println("Guardando datos en archivo...");
    }
    @Override
    public void cargarDatos() {
        System.out.println("Cargando datos desde archivo...");
    }
}