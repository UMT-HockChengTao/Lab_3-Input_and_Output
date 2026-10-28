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

public class Activity1Grosspay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create scanner to read users' input
        
        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = scanner.nextDouble(); //Prompt user to input hours worked
        
        System.out.print("Enter the hourly pay rate: ");
        double hourlyRate = scanner.nextDouble(); //Prompt user to input hourly rate
        
        double grossPay = hoursWorked * hourlyRate; //Calculate gross pay
        
        System.out.printf("The total gross pay is: RM %.2f \n" , grossPay); //Display gross pay
        
    }
    
}
