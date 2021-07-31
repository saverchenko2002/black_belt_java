package generics;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedMethod {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,5);
        int a = GenMethod.getSecondElement(list);
        System.out.println(a);

        List<String> list1 = List.of("a", "b", "c");
        String b = GenMethod.getSecondElement(list1);
        System.out.println(b);
    }
}

class GenMethod {
    public static <T> T getSecondElement(List<T> al) {
        return al.get(1);
    }
}
