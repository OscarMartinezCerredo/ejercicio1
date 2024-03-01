package procesadorpago;
public class AplicacionDeProcesamientoDePagos {
    private final ProcesadorDePago procesadorDePago;
    public AplicacionDeProcesamientoDePagos(ProcesadorDePago procesadorDePago) {
        this.procesadorDePago = procesadorDePago;
    }
    public void procesarPago(double dinero) {
        procesadorDePago.realizarPago(dinero);
    }
    public void procesarReembolso(double dinero) {
        procesadorDePago.reembolsarPago(dinero);
    }
}