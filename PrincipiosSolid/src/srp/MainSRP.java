package srp;

public class MainSRP {

    public static void main(String[] args) {

        System.out.println("=== EJEMPLO SRP ===");

        Factura factura = new Factura(50);

        System.out.println("Monto: " + factura.calcularMonto());

        FacturaRepository repo = new FacturaRepository();
        repo.guardar(factura);

        ServicioNotificacion servicio = new ServicioNotificacion();
        servicio.enviarFactura(factura);
    }
}