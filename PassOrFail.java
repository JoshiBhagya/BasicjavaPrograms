package myprograms;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args){

        int marksObtained;
        int passingMarks  = 35;
        char Grade;

        Scanner mark = new Scanner(System.in);
        System.out.println("marks are obtained ");
        marksObtained = mark.nextInt();

        if (marksObtained>=passingMarks){
        if (marksObtained>90 && marksObtained<95)
           Grade = 'A';
        else if (marksObtained>75 && marksObtained<80)
            Grade = 'B';
        else if (marksObtained>65 && marksObtained<70)
            Grade = 'C';
        else
            Grade = 'D';
        System.out.println("passed with grade "+Grade);
        }
        else
            Grade = 'f';
        System.out.println("failed in exam with grade "+Grade);
    }
}
