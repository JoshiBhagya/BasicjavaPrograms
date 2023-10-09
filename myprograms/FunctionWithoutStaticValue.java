package myprograms;

public class FunctionWithoutStaticValue {
    public static void main(String[] args){
FunctionWithoutStaticValue obj = new FunctionWithoutStaticValue();
int num1 = 20;
int num2 =  30;
int get_result =obj.add(num1,num2);
System.out.println(get_result + " = the value of result is ");
    }
    public int add(int num1, int num2){
        int result = num1+num2;
        return result;
    }
}
