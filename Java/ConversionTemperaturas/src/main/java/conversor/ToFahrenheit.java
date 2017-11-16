package conversor;

public class ToFahrenheit implements ConversorTemperaturas {

    @Override
    public double convertFromCelsius(int celsius) {
        double fahrenheit;
        fahrenheit = 9.0 / 5.0 * celsius + 32.0;
        return fahrenheit;
    }
}
