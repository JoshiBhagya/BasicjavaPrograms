package myprograms;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args){
        int year;
        boolean flag;
        Scanner leap = new Scanner(System.in);
        System.out.println("Enter the leap year = ");
         year = leap.nextInt();

         if(year % 400 == 0)
             flag = true;
         else if (year % 100 == 0)
             flag = false;
         else if (year % 2 == 0)
             flag = true;
         else
             flag = false;
         if(flag)
         System.out.println("year" + year + "is a leap year");
         else
             System.out.println("year"+year+"is not a leap year");
    }
}
