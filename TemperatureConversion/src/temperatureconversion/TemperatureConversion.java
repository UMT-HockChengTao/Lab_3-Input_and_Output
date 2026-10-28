package temperatureconversion;

/************************************************
 *Author: Hock Cheng Tao
 *Program Name: TemperatureConversion.java
 * Description: To convert temperature using JOptionPane
 * Date: 28 October 2026
 * Modified Date: None
 * Version: 1.0
 *************************************************/

import javax.swing.JOptionPane; //import JOptionPane
public class TemperatureConversion {

    public static void main(String[] args) {
        
        //Prompt user to input using JOptionPane
        String celsiusInput = JOptionPane.showInputDialog("Enter the temperature (Celsius): ");
        double tempCelsius = Double.parseDouble(celsiusInput); //convert the datatype into double
        
        double tempFahrenheit = (9.0/5) * tempCelsius + 32; //Conversion from Celsius to Fahrenheit
        
        System.out.printf("Temperature: %f Fahrenheit \n", tempFahrenheit);
        
    }
    
}
