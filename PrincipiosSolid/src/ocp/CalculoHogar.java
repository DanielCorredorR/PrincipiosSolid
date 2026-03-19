package ocp;

public class CalculoHogar implements Calculable {

    @Override
    public double calcular(double consumo) {
        return consumo * 1000;
    }
}