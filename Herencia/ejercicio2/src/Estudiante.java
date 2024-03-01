package persona;
public class Estudiante extends Persona {
    private String carrera;
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Roberto", 19, "Ingeniería Informática");

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Carrera: " + estudiante.getCarrera());
    }
}