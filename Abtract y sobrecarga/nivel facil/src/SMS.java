package notificacion;
public class SMS extends Notificacion {
    private final int limiteCaracteres;
    public SMS(String mensaje, String destinatario, int limiteCaracteres, String detalle) {
        super(mensaje, destinatario, detalle);
        this.limiteCaracteres = limiteCaracteres;
    }
    @Override
    public void enviar() {
        if (getMensaje().length() > limiteCaracteres) {
            System.out.println("El mensaje es demasiado largo para enviar como SMS");
        } else {
            System.out.println("Enviando SMS a " + getDestinatario() + " con mensaje: " + getMensaje() + " y detalle: " + getDetalle());
        }
    }
}