package coche;
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Toyota");
        Coche coche3 = new Coche("Toyota", "Supra");
        Coche coche4 = new Coche("Toyota", "Supra", 1994, "Naranja");

        System.out.println(coche1.getMarca() + " " + coche1.getModelo() + " " + coche1.getAno() + " " + coche1.getColor());
        System.out.println(coche2.getMarca() + " " + coche2.getModelo() + " " + coche2.getAno() + " " + coche2.getColor());
        System.out.println(coche3.getMarca() + " " + coche3.getModelo() + " " + coche3.getAno() + " " + coche3.getColor());
        System.out.println(coche4.getMarca() + " " + coche4.getModelo() + " " + coche4.getAno() + " " + coche4.getColor());
    }
}