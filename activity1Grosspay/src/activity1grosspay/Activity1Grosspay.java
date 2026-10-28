package activity1grosspay;
/************************************************
 *Author: Hock Cheng Tao
 *Program Name: Activity1Grosspay.java
 * Description: To calculate and display the gross pay for an hourly paid employee
 * Date: 28 October 2026
 * Modified Date: None
 * Version: 1.0
 *************************************************/

import java.util.*; 
import javax.swing.JOptionPane;

public class Activity1Grosspay {

    public static void main(String[] args) {
        //Show prompt dialog using JOtionPane
        String hoursWorkedInput = JOptionPane.showInputDialog("Enter the number of hours worked: ");
        double hoursWorked = Double.parseDouble(hoursWorkedInput); //Convert input into double datatype
        
        String hoursRateInput = JOptionPane.showInputDialog("Enter the hourly pay rate: ");
        double hourlyRate = Double.parseDouble(hoursRateInput); //Convert input into double datatype
        
        double grossPay = hoursWorked * hourlyRate; //Calculate gross pay
        
        String message = String.format("The total gross pay is: RM %.2f \n", grossPay);
        JOptionPane.showMessageDialog(null, message); //Display gross pay
        
    }
    
}
