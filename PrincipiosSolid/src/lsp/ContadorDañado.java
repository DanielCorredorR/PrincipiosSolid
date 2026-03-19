package lsp;

public class ContadorDañado extends ContadorAgua {

    @Override
    public void enviarLectura() {
        System.out.println("No se puede enviar lectura, contador dañado");
    }
}
