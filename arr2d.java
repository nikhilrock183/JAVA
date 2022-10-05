import java.util.Arrays;
import java.util.Scanner;

public class arr2d {
    public static void main(String[] args) {
//        int[][] arr2 = new int[3][];
//        arr2 = new int[][]{
//                {1, 2, 3},
//                {3, 4, 5},
//                {6, 7, 8}
//        };
        Scanner in = new Scanner(System.in);
        int[][] arr2 = new int[3][3];
        System.out.println(arr2.length);
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = in.nextInt();
            }}

            for (int row = 0; row < arr2.length; row++) {
                for (int col = 0; col < arr2[row].length; col++) {
                    System.out.println(Arrays.toString(arr2[row]) );
                }
        }

    }}
