package isp;

public class Funcionario implements Notificable, Facturable {

    @Override
    public void enviarNotificacion() {
        System.out.println("Funcionario envía notificación");
    }

    @Override
    public void generarFactura() {
        System.out.println("Funcionario genera factura");
    }
}