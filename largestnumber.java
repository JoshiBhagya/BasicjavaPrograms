package myprograms;

import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args){
        Scanner larg = new Scanner(System.in);
        System.out.print("enter three number :");
        int x  = larg.nextInt();
        int y = larg.nextInt();
        int z = larg.nextInt();

        if( x > y && x > z)
            System.out.println("x is largest " +x);
        else if ( y > x && y > z)
            System.out.println("y is largest "+y);
        else if ( z > x && z > y)
            System.out.println("z is largest "+z);
        else
            System.out.println("entered numbers are not distinct");

    }
}
