import java.util.Scanner;
public class arr1 {
    public static void main(String[] args) {
     printarr();

        }
        static void printarr() {
            Scanner in = new Scanner(System.in);
            int[] arr = new int[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
                System.out.println(arr[i]);
            }
        }}
