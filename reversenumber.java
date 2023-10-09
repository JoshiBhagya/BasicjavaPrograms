package myprograms;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args){
        int x , y, sum =0;
        Scanner reverse = new Scanner(System.in);
        System.out.print("Enter the number to be reversed =");
        x = reverse.nextInt();
        while(x>0){
            y = x % 10;
            sum = sum * 10 + y;
            x = x / 10;
        }
        System.out.println("reversed the number"+sum);
    }
}
