package figurageometrica;
abstract class FiguraGeometrica {
    protected String colorLinea;
    protected String colorRelleno;
    public FiguraGeometrica() {
        this.colorLinea = "Negro";
        this.colorRelleno = "Blanco";
    }
    public FiguraGeometrica(String colorLinea, String colorRelleno) {
        this.colorLinea = colorLinea;
        this.colorRelleno = colorRelleno;
    }
    public abstract void dibujar();
    public abstract double calcularArea();
    public String getColorLinea() {
        return colorLinea;
    }
    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
    public String getColorRelleno() {
        return colorRelleno;
    }
    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }
}