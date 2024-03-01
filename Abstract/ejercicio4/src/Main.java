package persistencia;
public class Main {
    public static void main(String[] args) {

        Persistencia persistenciaArchivo = new PersistenciaArchivo();
        persistenciaArchivo.guardarDatos();
        persistenciaArchivo.cargarDatos();

        Persistencia persistenciaBaseDatos = new PersistenciaBaseDatos();
        persistenciaBaseDatos.guardarDatos();
        persistenciaBaseDatos.cargarDatos();
    }
}