package savingforecast;

/************************************************
 *Author: Hock Cheng Tao
 *Program Name: SavingForecast.java
 * Description: To calculate the present deposit using Scanner Class
 * Date: 28 October 2026
 * Modified Date: None
 * Version: 1.0
 *************************************************/

import java.util.*;

public class SavingForecast {

    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        
        System.out.println("*******************************************");
        System.out.println("MY SAVING FORECAST PROGRAM");
        System.out.println("*******************************************");
        
        System.out.print("WHAT IS THE VALUE YOU WANT TO HAVE IN YOUR ACCOUNT? RM ");
        double futureValue = Input.nextDouble(); //Prompt the user to input the desired future value
        
        System.out.print("HOW MANY YEARS YOU WANT THE MONEY TO SIT IN YOUR ACCOUNT? ");
        int year = Input.nextInt(); //Prompt the user to input the desired number of years to sit the money
        
        System.out.print("WHAT IS THE ANNUAL INTEREST RATE (IN %)? ");
        double annualRate = Input.nextDouble(); //Prompt the user to enter the annual interest rate
        
        double presentAmount = futureValue / Math.pow(1 + annualRate / 100, year);
        //Calculation of present amount need to deposit today using Math.pow function
        
        System.out.printf("\nTHE AMOUNT YOU NEED TO DEPOSIT TODAY IS RM%.2f \n", presentAmount);
        //Display the present amount
    }
}
