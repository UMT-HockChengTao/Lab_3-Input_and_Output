package overagefeecaluclation;

/************************************************
 *Author: Hock Cheng Tao
 *Program Name: OverageFeeCaluclation.java
 * Description: To calculate and display the overage fee
 * Date: 28 October 2026
 * Modified Date: None
 * Version: 1.0
 *************************************************/

import java.util.*;
public class OverageFeeCaluclation {

    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        
        System.out.println("*************************************************");
        System.out.println("MY CELL PHONE OVERAGE FEE");
        System.out.println("*************************************************");
        
        System.out.print("ENTER THE NUMBER OF EXCESS MINUTES: ");
        int excessMinutes = Input.nextInt(); //get input of in the datatype of integer
        
        double overageFee = 0.35 * excessMinutes; //Calculation of overage fee
        
        System.out.printf("OVERAGE FEE = RM %.2f \n", overageFee); //Display overage fee
        
    }
    
}
