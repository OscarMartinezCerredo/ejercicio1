package dispositivo;
public class Smartphone extends DispositivoElectronico {
    public Smartphone(String fabricante, int anoDeFabricacion) {
        super(fabricante, anoDeFabricacion);
    }
    public void instalarAplicacion(String aplicacion) {
        System.out.println("Instalando la aplicación " + aplicacion);
    }
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("Apple", 2023);

        System.out.println("Fabricante: " + smartphone.getFabricante());
        System.out.println("Año de Fabricación: " + smartphone.getAnoDeFabricacion());

        Telefono telefono = new Telefono();
        telefono.llamar("123456789");
        telefono.recibirLlamadas();

        smartphone.instalarAplicacion("WhatsApp");
    }
}