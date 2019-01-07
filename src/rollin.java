import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
import java.awt.*;
import javax.swing.*;


public class rollin {
  public static void main(String[] args) {
      JFrame window = new JFrame();
      window.setSize(640,480);
      window.setTitle("Portal");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);

     	Scanner roll = new Scanner(System.in);
        Scanner bounce = new Scanner(System.in);
        Scanner hill = new Scanner(System.in);

   System.out.println("Enter a roll number:");
   int newRoll = roll.nextInt();
   roll.close();
    System.out.println("Enter a bounce number:");
    int newBounce = bounce.nextInt();
    bounce.close();
    System.out.println("Enter a hill number:");
    int newHill = hill.nextInt();
    hill.close();

    ballin ballinObject = new ballin();
    ballinObject.rollHill(newRoll, newBounce, newHill);



    }


}