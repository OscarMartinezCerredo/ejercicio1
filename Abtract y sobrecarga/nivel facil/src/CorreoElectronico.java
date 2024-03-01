package notificacion;
public class CorreoElectronico extends Notificacion {
    private final String asunto;
    public CorreoElectronico(String mensaje, String destinatario, String asunto, String detalle) {
        super(mensaje, destinatario, detalle);
        this.asunto = asunto;
    }
    @Override
    public void enviar() {
        System.out.println("Enviando correo electrónico a " + getDestinatario() + " con asunto: " + asunto + " y mensaje: " + getMensaje() + " y detalle: " + getDetalle());
    }
}