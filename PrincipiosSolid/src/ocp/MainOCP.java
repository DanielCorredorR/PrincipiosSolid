package ocp;

public class MainOCP {

    public static void main(String[] args) {

        System.out.println("=== EJEMPLO OCP ===");

        Calculable hogar = new CalculoHogar();
        FacturaOCP facturaHogar = new FacturaOCP(hogar);

        System.out.println("Hogar: " + facturaHogar.calcularMonto(50));

        Calculable empresa = new CalculoEmpresa();
        FacturaOCP facturaEmpresa = new FacturaOCP(empresa);

        System.out.println("Empresa: " + facturaEmpresa.calcularMonto(50));
    }
}