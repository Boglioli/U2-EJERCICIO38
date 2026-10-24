public class GraficoBarras extends GeneradorGrafico{
    public GraficoBarras(double[] datos) {
        super(datos);
    }
    public void renderizarGrafico() {
        if (datos == null || datos.length == 0) {
            System.out.println("no hay datos para barras");
            return;
        }
        System.out.println("grafico de barras");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < (int) datos[i]; j++) {
                System.out.println("#");
            }
            System.out.println();
        }
    }
}
