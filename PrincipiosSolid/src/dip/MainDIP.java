package dip;

public class MainDIP {

    public static void main(String[] args) {

        NotificacionService email = new EmailService();
        Alerta alertaEmail = new Alerta(email);
        alertaEmail.enviarAlerta("Consumo irregular detectado");

        NotificacionService sms = new SmsService();
        Alerta alertaSms = new Alerta(sms);
        alertaSms.enviarAlerta("Fuga de agua detectada");
    }
}