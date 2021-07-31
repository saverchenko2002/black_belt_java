package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();

        List<Double> list1 = List.of(3.14, 3.12);
        showListInfo(list1);
        List<String> list2 = List.of("privet", "poka");
        showListInfo(list2);


        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        System.out.println(summ(ald));
    }

    static void showListInfo(List<?> list) {
        System.out.println("My list consists: " + list);
    }

    public static double summ(ArrayList<? extends Number> al) {
        double sum = 0;
        for (Number n : al) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
