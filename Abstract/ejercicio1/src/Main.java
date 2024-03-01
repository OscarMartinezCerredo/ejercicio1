package animal;
public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro();
        perro.hacerSonido();
        perro.moverse();

        Gato gato = new Gato();
        gato.hacerSonido();
        gato.moverse();
    }
}