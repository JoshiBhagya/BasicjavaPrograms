package myprograms;

import java.util.Scanner;

public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        float temprature;

        Scanner temp = new Scanner(System.in);
        System.out.println("enter Fahrenheit : ");
           temprature= temp.nextInt();

          temprature = ((temprature-32)*5)/9;
            System.out.println("Temprature in Celsius : " +temprature);
    }
}
