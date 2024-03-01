package notificacion;
public class NotificacionApp extends Notificacion {
    private final String identificadorDispositivo;
    public NotificacionApp(String mensaje, String destinatario, String identificadorDispositivo, String detalle) {
        super(mensaje, destinatario, detalle);
        this.identificadorDispositivo = identificadorDispositivo;
    }
    @Override
    public void enviar() {
        System.out.println("Enviando notificación a " + getDestinatario() + " en el dispositivo con identificador: " + identificadorDispositivo + " y mensaje: " + getMensaje() + " y detalle: " + getDetalle());
    }
}