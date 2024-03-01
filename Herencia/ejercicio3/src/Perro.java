package animal;
public class Perro extends Animal {
    @Override
    public void emitirSonido() {
        System.out.println("El perro ladra");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.emitirSonido();

        Perro perro = new Perro();

        perro.emitirSonido();
    }
}