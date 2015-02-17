/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3;

import java.util.Scanner;

/**
 *
 * @author nl2027
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
          
        Scanner kbd = new Scanner(System.in);
        int [] inputedNumber;
       
       inputedNumber = new int [50];
        int ascending = inputAscendingNumber(inputedNumber, inputedNumber.length);
    System.out.print("After numbers get sorted:");
        int i;
    for(i = 0; i <inputedNumber.length; i++)
      System.out.print(ascending);
      
    int descending = inputDescendingNumber(inputedNumber, inputedNumber.length);
     System.out.print(descending);
    
               
    }
    

    private static int inputAscendingNumber(int[] inputedNumber, int number) {
       Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter");
        
            int max = inputedNumber.length;
            number = input.nextInt();
             if (number > max)
             {
                 System.out.print("Sorry enter 50 numbers maximum");
             }
             else{
                 System.out.println("Please enter " + number + "numbers");
            for (int i=0; i< (inputedNumber.length - 1); i++)
            {
                inputAscendingNumber(number, inputedNumber); //
                // algorithim sort (bubble method)
                }           
             }
        return number;
    }

 
    private static int inputedDescendingNumbers(int[] inputedNumber, int number)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter");
        
            int max = inputedNumber.length;
            number = input.nextInt();
             
             if (number > max)
             {
                 System.out.print("Sorry enter 50 numbers maximum");
             }
             else if{
                 System.out.println("Please enter " + number + "numbers");
            for (int i=0; i< (number - 1); i++)
            {
                  inputDescendingNumber(number, inputedNumber);
                  //bubble sort algorithim
                  
                } 
            
        return number;
          
            
        
    
    }
    }