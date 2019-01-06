import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

public class rollin {
  public static void main(String[] args) {

     	Scanner roll = new Scanner(System.in);
        Scanner bounce = new Scanner(System.in);
        Scanner hill = new Scanner(System.in);

   System.out.println("Enter a roll number:");
   int newRoll = roll.nextInt();
    System.out.println("Enter a bounce number:");
    int newBounce = bounce.nextInt();
    System.out.println("Enter a hill number:");
    int newHill = hill.nextInt();

    ballin ballinObject = new ballin();
    ballinObject.rollHill(newRoll, newBounce, newHill);



    }


}