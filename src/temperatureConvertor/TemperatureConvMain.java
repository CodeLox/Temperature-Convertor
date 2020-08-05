package temperatureConvertor;

import java.text.DecimalFormat;

/**
 *
 * @author
 */
public class TemperatureConvMain {
//type = 1 means fahrenheit + given temp is celsius and vice versa

    public static double TemperatureConvertor(double temperature, boolean type) {

        if (type) {
            return (1.8 * temperature) + 32;
        }
        return (0.56) * (temperature - 32); //else type = 0

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TemperatureConvertor tempC = new TemperatureConvertor();
    }

}
