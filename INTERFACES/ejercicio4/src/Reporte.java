package exportable;
public class Reporte implements Exportable {
    private final String datos;
    public Reporte(String datos) {
        this.datos = datos;
    }
    @Override
    public void exportarDatos(String formato) {
        if (formato.equalsIgnoreCase("CSV")) {
            System.out.println("Exportando datos a formato CSV: " + datos);
        } else if (formato.equalsIgnoreCase("PDF")) {
            System.out.println("Exportando datos a formato PDF: " + datos);
        } else {
            System.out.println("Error");
        }
    }
}