package conversor;

public class ToFahrenheit extends ConversorTemperaturas {

    @Override
    public double convert(int number) {
        double fahrenheit;
        fahrenheit = 9.0 / 5.0 * number + 32.0;
        return fahrenheit;
    }


}
