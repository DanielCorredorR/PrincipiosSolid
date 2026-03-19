package dip;

public class Alerta {

    private NotificacionService servicio;

    public Alerta(NotificacionService servicio) {
        this.servicio = servicio;
    }

    public void enviarAlerta(String mensaje) {
        servicio.enviar(mensaje);
    }
}