package myprograms;

public class addarray {
    public static void main(String[] args){
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];

        int num=5;

        for(int i=0; i<5; i++){
            a[i]=i;
        }
        for(int i = 0; i < 5; i++) {
            b[i] = num;
            num++;
        }
        System.out.println("\nthe values of array A ");
        for(int i=0;i<5;i++){
        System.out.print(a[i] + " ");
        }
        System.out.println("\nthe values of array b ");
        for(int i=0;i<5;i++){
            System.out.print(b[i]+ " ");
        }
        System.out.println("\nthe values of array c[i]=a[i]+b[i]");
        for(int i=0;i<5;i++){
            c[i]=a[i]+b[i];
            System.out.print(c[i]+ " ");
        }
    }
}
