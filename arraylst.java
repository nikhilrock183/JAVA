import java.util.ArrayList;
import java.util.Scanner;
public class arraylst {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(10);
        list.add(104);
        list.add(103);
        list.add(102);
        list.add(101);
        list.add(110);
        list.add(0);
        list.add(1);
        System.out.println(list);
//        System.out.println(list.contains(75));
list.set(0,99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}
