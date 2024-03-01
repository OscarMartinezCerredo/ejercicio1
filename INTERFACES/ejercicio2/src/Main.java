package procesadorpago;
public class Main {
    public static void main(String[] args) {
        ProcesadorDePago paypalProcesador = new PayPalProcesadorDePago();
        AplicacionDeProcesamientoDePagos aplicacionPayPal = new AplicacionDeProcesamientoDePagos(paypalProcesador);

        aplicacionPayPal.procesarPago(90.0);
        aplicacionPayPal.procesarReembolso(40.0);

        ProcesadorDePago applepayProcesador = new ApplePayProcesadorDePago();
        AplicacionDeProcesamientoDePagos aplicacionApplePay = new AplicacionDeProcesamientoDePagos(applepayProcesador);

        aplicacionApplePay.procesarPago(130.0);
        aplicacionApplePay.procesarReembolso(20.0);
    }
}