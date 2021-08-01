package streams;

import java.util.stream.Stream;

public class count {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,5,5,5);
//        System.out.println(stream1.count());
        System.out.println(stream1.distinct().count());
    }
}
