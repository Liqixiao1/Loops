/*
 * Lee Li
 * 24/10/2018
 * cubes And Sqiares And Powers program.
 */

package cubes.and.squares.and.powers;

import java.util.Scanner;

/**
 *
 * @author qili5995
 */
public class CubesAndSquaresAndPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner keyedInput = new Scanner(System.in);
      
      System.out.println("Please enter your choice");
      
      System.out.println("1. ...Find the Value of a number squared");
      System.out.println("2. ...Find the Value of a number cubed");
      System.out.println("3. ...Find the Value of , to any power");
      System.out.println("4. ...Exit");
      
      int choice;
      int value1;
      int value2;
      int value3;
      int answer1;
      int answer2;
      int answer3;
      
      choice = keyedInput.nextInt();
     
      if (choice == 1)
      { 
          System.out.println("You are able to find a value of a number squared.");
          System.out.println("Please enter the value: ");
           value1 = keyedInput.nextInt();
           answer1 = value1 * value1;
           System.out.println("answer1" + answer1);
           System.out.println("");
           
           System.out.println("Please enter your choice");
      
      System.out.println("1. ...Find the Value of a number squared");
      System.out.println("2. ...Find the Value of a number cubed");
      System.out.println("3. ...Find the Value of , to any power");
      System.out.println("4. ...Exit");
      
     
      choice = keyedInput.nextInt();
      }
      else if (choice == 2)
      {
          System.out.println("You are able to find a value of a number cubed.");
          System.out.println("Please enter the value:");
          value2 = keyedInput.nextInt();
          answer2 =value2 * value2 * value2;
          System.out.println("answer2" + answer2);
          System.out.println("");
          
          System.out.println("Please enter your choice");
      
      System.out.println("1. ...Find the Value of a number squared");
      System.out.println("2. ...Find the Value of a number cubed");
      System.out.println("3. ...Find the Value of , to any power");
      System.out.println("4. ...Exit");
      
     
      choice = keyedInput.nextInt();
      
      }
      else if (choice == 3)
        
              
      {
             value3 = (int)Math.round(Math.random()*1000+1);
             
      }
      else if (choice == 4)
      {
          System.out.println("You will exit.");
          
          System.out.println("");
          System.out.println("");
          System.out.println("");
          
           System.out.println("Please enter your choice");
      
      System.out.println("1. ...Find the Value of a number squared");
      System.out.println("2. ...Find the Value of a number cubed");
      System.out.println("3. ...Find the Value of , to any power");
      System.out.println("4. ...Exit");
          
          
      }
      
    }
    
}
