public class GraficoLineal extends GeneradorGrafico {
    public GraficoLineal(double[] datos) {
        super(datos);
    }
    public void renderizarGrafico() {
        if (datos == null || datos.length == 0) {
            System.out.println("no hay datos para lineal");
            return;
        }
        System.out.println("grafico lineal");
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i] + "->");
        }
        System.out.println("fin");
    }
}
