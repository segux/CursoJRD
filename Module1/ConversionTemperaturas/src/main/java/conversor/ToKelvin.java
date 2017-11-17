package conversor;

public class ToKelvin implements ConversorTemperaturas {

    @Override
    public double convert(int celsius) {
        return celsius + 273.16;
    }
}
