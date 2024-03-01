package notificable;
public class SistemaDeNotificaciones {
    public static void enviarNotificacion(Notificable notificable, String mensaje) {
        notificable.enviarNotificacion(mensaje);
    }
}