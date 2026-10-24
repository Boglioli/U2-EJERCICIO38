public abstract class GeneradorGrafico {
    double[] datos;
    public GeneradorGrafico(double[] datos) {
        this.datos = datos;
    }
    public abstract void renderizarGrafico();
}
