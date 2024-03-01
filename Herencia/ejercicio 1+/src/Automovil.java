package vehiculo;
public class Automovil extends Vehiculo {
    private String tipoDeCombustible;
    public Automovil(String marca, String modelo, int ano, String tipoDeCombustible) {
        super(marca, modelo, ano);
        this.tipoDeCombustible = tipoDeCombustible;
    }
    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }
    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }
        public static void main(String[] args) {

            Automovil automovil = new Automovil("Toyota", "Supra", 1994, "Gasolina");

            System.out.println("Marca: " + automovil.getMarca());
            System.out.println("Modelo: " + automovil.getModelo());
            System.out.println("Año: " + automovil.getAno());
            System.out.println("Tipo de Combustible: " + automovil.getTipoDeCombustible());
    }
}