package srp;

public class FacturaMala {

    private double consumo;

    public FacturaMala(double consumo) {
        this.consumo = consumo;
    }

    public double calcularMonto() {
        return consumo * 1000;
    }

    public void guardarFactura() {
        System.out.println("Guardando factura...");
    }

    public void enviarFactura() {
        System.out.println("Enviando factura...");
    }
}
