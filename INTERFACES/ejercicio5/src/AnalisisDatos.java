package filtrableyordenable;
public class AnalisisDatos {
    public static void analizar(Filtrable filtrable, Ordenable ordenable) {
        filtrable.filtrar();
        ordenable.ordenar();
    }
}