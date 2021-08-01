package lambda_expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
//        list.removeIf(element -> element.length() < 5);
        System.out.println(list);
        Predicate<String> pc = str -> str.length() > 3;
        collSort(list, pc);


    }

    static void collSort(ArrayList<String> str, Predicate<String> pc) {
        for (String str1 : str) {
            if (pc.test(str1))
                System.out.println(str1);
        }
        ;
    }
}
