package srp;

public class Factura {

    private double consumo;

    public Factura(double consumo) {
        this.consumo = consumo;
    }

    public double calcularMonto() {
        return consumo * 1000;
    }
}
