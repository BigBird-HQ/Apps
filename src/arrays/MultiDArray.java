package arrays;


import java.util.Arrays;

public class MultiDArray {
    public static void main(String[] args) {


        int[][] calender = new int[3][5];
        calender[0][2] = 10;
        calender[1][2] = 20;
        calender[2][2] = 30;
        calender[0][0] = 1;
        calender[0][1] = 2;
        calender[0][3] = 3;
        calender[0][4] = 4;
        calender[1][0] = 1;
        calender[1][1] = 2;
        calender[1][3] = 3;
        calender[1][4] = 4;
        calender[2][0] = 1;
        calender[2][1] = 2;
        calender[2][3] = 3;
        calender[2][4] = 4;


        System.out.println(Arrays.deepToString(calender));
    }
}