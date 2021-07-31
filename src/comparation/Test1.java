package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sergey");
        list.add("Masha");
        list.add("Ivan");
        System.out.print("Before sort: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.print("After sort: ");
        System.out.println(list);
    }
}
