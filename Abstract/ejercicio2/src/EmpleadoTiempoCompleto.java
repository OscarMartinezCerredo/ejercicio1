package empleado;
public class EmpleadoTiempoCompleto extends Empleado {
    private final double sueldoSemanal;
    public EmpleadoTiempoCompleto(double sueldoSemanal) {
        this.sueldoSemanal = sueldoSemanal;
    }
    @Override
    public double calcularSalario() {
        return sueldoSemanal * 4;
    }
}