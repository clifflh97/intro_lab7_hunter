package javaLab10;

import java.util.Scanner;
import java.lang.Math;     

public class JavaLab10 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double wallHeight;
      double wallWidth;
      double wallArea;
      double galPaint;
      int numCans;
      final double SQUARE_FEET_PER_CAN = 350.0;
      
      System.out.println("Enter wall height (feet):");
      wallHeight = scnr.nextDouble();
      
      //wallWidth = 10.0;                      
      
      //(1): Prompt user to input wall's width
      System.out.println("Enter wall width (feet):");
      wallWidth = scnr.nextDouble();
      
      // Calculate and output wall area
      wallArea = wallHeight * wallWidth;                //(2): Calculate the wall's area
      System.out.println("Wall area: " + wallArea + " square feet");     //(3): Finish the output statement
      
      //(4): Calculate and output the amount of paint in gallons needed to paint the wall
      galPaint = wallArea / SQUARE_FEET_PER_CAN;
      System.out.println("Paint needed: " + galPaint + " gallons");
      
      //(5): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
      numCans = (int) Math.ceil(galPaint);
      System.out.println("Cans needed: " + numCans + " can(s)");
   }
}
   

