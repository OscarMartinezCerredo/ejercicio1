package filtrableyordenable;
public class Main {
    public static void main(String[] args) {
        Datos datos = new Datos(new String[]{"dato1", "dato2", "dato3"});
        AnalisisDatos.analizar(datos, datos);
    }
}