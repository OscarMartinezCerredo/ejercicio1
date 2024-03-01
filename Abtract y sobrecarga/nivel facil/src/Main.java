package notificacion;
public class Main {
    public static void main(String[] args) {
        CorreoElectronico correo = new CorreoElectronico("Hola", "prueba@gmail.com", "Prueba", "Adios");
        correo.enviar();

        SMS sms = new SMS("Hola", "657493784", 160, "Prueba");
        sms.enviar();

        NotificacionApp notificacionApp = new NotificacionApp("Hola", "Usuario", "12313214", "Prueba");
        notificacionApp.enviar();
    }
}