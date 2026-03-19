package isp;

public class Usuario implements Notificable, Reclamable {

    @Override
    public void enviarNotificacion() {
        System.out.println("Usuario recibe notificación");
    }

    @Override
    public void crearReclamo() {
        System.out.println("Usuario crea reclamo");
    }
}