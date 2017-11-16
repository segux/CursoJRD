package conversor;

public class ToKelvin implements ConversorTemperaturas {

    @Override
    public double convertFromCelsius(int celsius) {
        return celsius + 273.16;
    }
}
