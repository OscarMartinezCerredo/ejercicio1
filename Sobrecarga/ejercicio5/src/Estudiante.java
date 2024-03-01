package estudiante;
public class Estudiante {
    private String nombre;
    private int edad;
    private double promedioAcademico;
    public Estudiante() {
        this("", 0, 0);
    }
    public Estudiante(String nombre) {
        this(nombre, 0, 0);
    }
    public Estudiante(String nombre, int edad) {
        this(nombre, edad, 0);
    }
    public Estudiante(String nombre, int edad, double promedioAcademico) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedioAcademico = promedioAcademico;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPromedioAcademico() {
        return promedioAcademico;
    }
    public void setPromedioAcademico(double promedioAcademico) {
        this.promedioAcademico = promedioAcademico;
    }
}