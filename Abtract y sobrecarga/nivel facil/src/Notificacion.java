package notificacion;
public abstract class Notificacion {
    private String mensaje;
    private String destinatario;
    private String detalle;
    public Notificacion(String mensaje, String destinatario, String detalle) {
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        this.detalle = detalle;
    }
    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public abstract void enviar();
}