package empleado;
public class Main {
    public static void main(String[] args) {
        EmpleadoPermanente empPermanente1 = new EmpleadoPermanente("Sebastian", 1021, 40000);
        empPermanente1.mostrarDetalles();

        System.out.println();

        EmpleadoTemporal empTemporal1 = new EmpleadoTemporal("Manuel", 2021, 50000, 7);
        empTemporal1.mostrarDetalles();

        System.out.println();

        EmpleadoContratista empContratista1 = new EmpleadoContratista("Pedro", 3021, 80000, 10);
        empContratista1.mostrarDetalles();
    }
}