package myprograms;

public class MultiDarray {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = num;
                num++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+ "" );
            }
           System.out.println();
        }
    }
}
