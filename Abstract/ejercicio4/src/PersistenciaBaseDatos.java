package persistencia;
public class PersistenciaBaseDatos extends Persistencia {
    @Override
    public void guardarDatos() {
        System.out.println("Guardando datos en base de datos...");
    }
    @Override
    public void cargarDatos() {
        System.out.println("Cargando datos desde base de datos...");
    }
}