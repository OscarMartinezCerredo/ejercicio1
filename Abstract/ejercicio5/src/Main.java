package vehiculo;
public class Main {
    public static void main(String[] args) {

        Automovil automovil = new Automovil();
        automovil.acelerar();
        automovil.frenar();

        Motocicleta motocicleta = new Motocicleta();
        motocicleta.acelerar();
        motocicleta.frenar();
    }
}