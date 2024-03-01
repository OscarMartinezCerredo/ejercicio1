package procesadorpago;
public class PayPalProcesadorDePago implements ProcesadorDePago {
    @Override
    public void realizarPago(double dinero) {
        System.out.println("Pago realizado correctamente mediante PayPal: " + dinero + "€");
    }
    @Override
    public void reembolsarPago(double dinero) {
        System.out.println("Reembolso realizado correctamente mediante PayPal: " + dinero + "€");
    }
}