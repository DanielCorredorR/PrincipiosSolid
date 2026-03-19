package dip;

public class EmailService implements NotificacionService {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);
    }
}