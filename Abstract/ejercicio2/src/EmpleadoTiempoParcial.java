package empleado;
public class EmpleadoTiempoParcial extends Empleado {
    private final double sueldoPorHora;
    private final double horasTrabajadas;
    public EmpleadoTiempoParcial(double sueldoPorHora, double horasTrabajadas) {
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    @Override
    public double calcularSalario() {
        return sueldoPorHora * horasTrabajadas;
    }
}