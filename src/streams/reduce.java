package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(3);
        list.add(1);

        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
//        System.out.println(result);
        Optional<Integer> o = list.stream().reduce((accumulator, element) -> accumulator * element);
//        if (o.isPresent())
//            System.out.println(o.get());
        int result2 = list.stream().reduce(3, (accumulator, element) -> accumulator * element);
        System.out.println(result2);

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela");
        list3.add("okey");
        list3.add("poka");
        String result3 = list3.stream().reduce((accumulator, element) -> accumulator + " " + element).get();
        System.out.println(result3);
    }
}
