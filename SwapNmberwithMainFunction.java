package myprograms;

import java.util.Scanner;

public class SwapNmberwithMainFunction {
    public static void main(String[] args){
        Scanner swap = new Scanner(System.in);
        System.out.print("Enter the number to Swap : ");
        int x = swap.nextInt();
        int y = swap.nextInt();
        System.out.println("Before Swaping the number\n x : " +x+"\n y : " +y);
        x = x + y;  //x = 2 + 3 = 5
        y = x - y;  //y = 5 - 3 = 2
        x = x - y;  //x = 5 - 2 = 3
        System.out.println("after Swaping the number\n x : " +x+"\n y : " +y);

    }
}
