public class Main {
    public static void main(String[] args) {
        double[] datos = {10, 20, 15};
        GeneradorGrafico grafico;
        grafico = new GraficoBarras(datos);
        grafico.renderizarGrafico();
        grafico = new GraficoCircular(datos);
        grafico.renderizarGrafico();
        grafico = new GraficoLineal(datos);
        grafico.renderizarGrafico();
    }
}
