package exportable;
public class SistemaDeReportes {
    public static void exportarReporte(Exportable reporte, String formato) {
        reporte.exportarDatos(formato);
    }
}