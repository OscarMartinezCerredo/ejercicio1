package notificable;
public class SMS implements Notificable {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}