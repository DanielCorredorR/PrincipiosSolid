package isp;

public class MainISP {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.enviarNotificacion();
        usuario.crearReclamo();

        Funcionario funcionario = new Funcionario();
        funcionario.enviarNotificacion();
        funcionario.generarFactura();
    }
}