package exportable;
public class Main {
    public static void main(String[] args) {
        Exportable reporte = new Reporte("Datos del reporte");

        SistemaDeReportes.exportarReporte(reporte, "CSV");
        SistemaDeReportes.exportarReporte(reporte, "PDF");
    }
}