package myprograms;

public class FindAreaUsingMethodOverload {
    public static void main(String[] args){
        FindAreaUsingMethodOverload obj = new FindAreaUsingMethodOverload();
    int num1 = 2;
    int num2 = 5;
    int num = 5;

float area_circle=obj.area(num);
int area_rectangle=obj.area(num1,num2);

System.out.println("Area of a Circle = " + area_circle);
System.out.println("Area of a Rectangle = " + area_rectangle);
    }
public int area(int num1,int num2){
        int result = num1*num2;
        return  result;
}
public  float area(int num){


        float result = 3.14f*num*num;
        return result;
    }
}
