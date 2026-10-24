public class GraficoCircular extends GeneradorGrafico {
    public GraficoCircular(double[] datos) {
        super(datos);
    }
    public void renderizarGrafico() {
        if (datos == null || datos.length == 0) {
            System.out.println("no hay datos para circular");
            return;
        }
        System.out.println("grafico circular");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("porcion " + (i + 1) + ": " + datos[i]);
        }
    }
}
