package lsp;

public class MainLSP {

    public static void main(String[] args) {

        ContadorAgua contador1 = new ContadorActivo();
        contador1.enviarLectura();

        ContadorAgua contador2 = new ContadorDañado();
        contador2.enviarLectura();
    }
}