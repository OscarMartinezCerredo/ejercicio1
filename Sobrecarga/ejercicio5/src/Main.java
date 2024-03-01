package estudiante;
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Juan");
        Estudiante estudiante3 = new Estudiante("Pedro", 19);
        Estudiante estudiante4 = new Estudiante("Roberto", 19, 8.5);

        System.out.println("Estudiante: " + estudiante1.getNombre() + " - Edad: " + estudiante1.getEdad() + " - Promedio: " + estudiante1.getPromedioAcademico());
        System.out.println("Estudiante: " + estudiante2.getNombre() + " - Edad: " + estudiante2.getEdad() + " - Promedio: " + estudiante2.getPromedioAcademico());
        System.out.println("Estudiante: " + estudiante3.getNombre() + " - Edad: " + estudiante3.getEdad() + " - Promedio: " + estudiante3.getPromedioAcademico());
        System.out.println("Estudiante: " + estudiante4.getNombre() + " - Edad: " + estudiante4.getEdad() + " - Promedio: " + estudiante4.getPromedioAcademico());
    }
}