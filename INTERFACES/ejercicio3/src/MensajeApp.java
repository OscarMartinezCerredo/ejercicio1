package notificable;
public class MensajeApp implements Notificable {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando mensaje de aplicación: " + mensaje);
    }
}