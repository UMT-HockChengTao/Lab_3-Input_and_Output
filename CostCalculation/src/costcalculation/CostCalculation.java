package costcalculation;

/******************************************
 * Author: Hock Cheng Tao
 * Program Name: CostCalculation.java
 * *Description: To calculate cost of product using JOptionPane class
 * Date: 30 October 2026
 * Modified Date: None
 * Version: 1.0
 ******************************************/

import javax.swing.JOptionPane;
public class CostCalculation {
    
    public static void main(String[] args) {
        
        double salesTax = 0.06; //Declare sales tax as named constant
        
        String productPriceInput = JOptionPane.showInputDialog("Enter the price of product(in RM) ");
        double productPrice = Double.parseDouble(productPriceInput); //Prompt user to input product price 
        
        double productCost = (1 + salesTax) * productPrice; //Calculation of cost of product
        
        String message = String.format("The total cost of product is: RM %.2f", productCost);
        JOptionPane.showMessageDialog(null, message); ///Display output in dialog
    }
    
}
