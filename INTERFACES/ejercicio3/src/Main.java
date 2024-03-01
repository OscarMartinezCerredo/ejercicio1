package notificable;
public class Main {
    public static void main(String[] args) {
        Notificable correo = new CorreoElectronico();
        Notificable sms = new SMS();
        Notificable mensajeApp = new MensajeApp();

        SistemaDeNotificaciones.enviarNotificacion(correo, "¡Hola desde el correo electrónico!");
        SistemaDeNotificaciones.enviarNotificacion(sms, "¡Hola desde el SMS!");
        SistemaDeNotificaciones.enviarNotificacion(mensajeApp, "¡Hola desde la aplicación de mensajería!");
    }
}