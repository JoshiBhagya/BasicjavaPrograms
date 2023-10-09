package myprograms;

public class SwapNmberWithStaticValue {
    public static void main(String[] args){
int x = 9;
int y =7;
        swap(x,y);
    }
    public static void swap(int x,int y){
        System.out.println("Before Swapping a = " +x+ " b = "+y);

        int c = x;
        x = y;
        y = c;
        System.out.println("After Swapping a = " +x+ " b = "+y);
    }
}
