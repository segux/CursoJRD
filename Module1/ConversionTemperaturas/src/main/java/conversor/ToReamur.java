package conversor;

public class ToReamur implements ConversorTemperaturas {
    @Override
    public double convert(int celsius) {
        double reamur;
        reamur = 4.0 / 5.0 * celsius;
        return reamur;
    }
}
