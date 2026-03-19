package ocp;

public class FacturaOCP {

    private Calculable estrategia;

    public FacturaOCP(Calculable estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularMonto(double consumo) {
        return estrategia.calcular(consumo);
    }
}