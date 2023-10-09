package myprograms;

public class FunctionWithStaticValue{
    public static void main(String[] args){
    wedding();
    int a =10;
    int b = 20;
    adding(a,b);
    }
    public static void wedding(){
        System.out.println("it's wedding time!! ");
    }
    public static void adding(int a, int b){
        System.out.println(a+b + " = adding by two numbers ");
    }
}
