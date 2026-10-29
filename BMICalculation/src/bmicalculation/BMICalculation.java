package bmicalculation;

/******************************************
 * Author: Hock Cheng Tao
 * Program Name: BMICalculation.java
 * *Description: To calculate BMI using JOptionPane class
 * Date: 28 October 2026
 * Modified Date: None
 * Version: 1.0
 ******************************************/

import javax.swing.JOptionPane;
public class BMICalculation {

    public static void main(String[] args) {
        
        String weightInput = JOptionPane.showInputDialog("Enter your weight (in kilogram): ");
        double weight = Double.parseDouble(weightInput); //Prompt user to input weight
        
        String heightInput = JOptionPane.showInputDialog("Enter your height (in metres): ");
        double height = Double.parseDouble(heightInput); //Prompt user to input height
        
        double BMI = weight / Math.pow(height, 2); // Calculation of BMI
        
        String message = String.format("Your Body Mass Index (BMI) is : %.1f", BMI);
        JOptionPane.showMessageDialog(null, message); //Display the output
    }
    
}
