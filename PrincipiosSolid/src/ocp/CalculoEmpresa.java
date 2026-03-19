package ocp;

public class CalculoEmpresa implements Calculable {

    @Override
    public double calcular(double consumo) {
        return consumo * 2000;
    }
}