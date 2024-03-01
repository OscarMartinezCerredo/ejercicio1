package procesadorpago;
public interface ProcesadorDePago {
    void realizarPago(double dinero);
    void reembolsarPago(double dinero);
}