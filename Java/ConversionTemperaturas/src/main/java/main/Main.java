package main;


import conversor.ToFahrenheit;
import conversor.ToKelvin;
import conversor.ToReamur;
import conversor.ConversorTemperaturas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] arrStr) {
        double fahrenheit, reamur;
        List<ConversorTemperaturas> conversores = new ArrayList<ConversorTemperaturas>();

        conversores.add(new ToFahrenheit());
        conversores.add(new ToReamur());
        conversores.add(new ToKelvin());


        for (int celsius = 0; celsius <= 100; celsius += 10) {
            StringBuilder sb = new StringBuilder();
            sb.append(celsius);
            sb.append(',');
            for (ConversorTemperaturas conversorTemperaturas : conversores) {
                sb.append(conversorTemperaturas.convertFromCelsius(celsius));
                sb.append(',');
            }

            System.out.println(sb);
        }


    }

}
