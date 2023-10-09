package myprograms;

import java.util.Scanner;

public class numberchecking {
    public static void main(String[] args){
int y=-1;
        Scanner check = new Scanner(System.in);
        System.out.println("enter the number = ");
        int x = check.nextInt();
if(x>=y)
        if(x<0){
            System.out.println("number is negative");
        } else if (x>0) {
            System.out.println("number is positive");
        }
        else {
            System.out.println("number is zero");
        }
    }
}
