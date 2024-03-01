package empleado;
public class Empleado {
    private String nombre;
    private double salario;
    private String departamento;
    public Empleado() {
        this.nombre = "";
        this.salario = 0.0;
        this.departamento = "";
    }
    public Empleado(String nombre) {
        this.nombre = nombre;
        this.salario = 0.0;
        this.departamento = "";
    }
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = "";
    }
    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}