package conversor;

public class ToReamur implements ConversorTemperaturas {
    @Override
    public double convertFromCelsius(int celsius) {
        double reamur;
        reamur = 4.0 / 5.0 * celsius;
        return reamur;
    }
}
