package procesadorpago;
public class ApplePayProcesadorDePago implements ProcesadorDePago {
    @Override
    public void realizarPago(double dinero) {
        System.out.println("Pago realizado correctamente mediante Apple Pay: " + dinero + "€");
    }
    @Override
    public void reembolsarPago(double dinero) {
        System.out.println("Reembolso realizado correctamente mediante Apple Pay: " + dinero + "€");
    }
}