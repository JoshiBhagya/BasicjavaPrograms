package myprograms;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args){
        int flag = 1;
        Scanner pnum = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n =  pnum.nextInt();
        for (int i=2;i<n;i++)
        {
            if(n % i == 0)
            {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
            System.out.println(" "+n+" is a prime number");
        else
            System.out.println(" "+n+" is not a prime number");
    }
}
