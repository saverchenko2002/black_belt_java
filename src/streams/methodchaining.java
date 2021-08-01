package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class methodchaining {
    public static void main(String[] args) {
        int[] array = {5, 213, 213, 241, 21425, 354, 5654, 62, 342, 4};
        int res = Arrays.stream(array)
                .filter(element -> (element % 2 == 1))
                .map(element -> element /= 3)
                .reduce((accumulator, element) -> accumulator += element).getAsInt();
        System.out.println(res);

        List<Student> students = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 9.2);
        Student st2 = new Student("Sergey", 'm', 19, 1, 4.2);
        Student st3 = new Student("Mariya", 'f', 23, 4, 6.2);
        Student st4 = new Student("Dmitriy", 'm', 22, 3, 5.2);
        Student st5 = new Student("Alex", 'm', 21, 2, 7.2);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);


        students.stream()
                .map(element -> {
                    element.setName(element.getName().toUpperCase());
                    return element;
                })
                .filter(element -> element.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge()).forEach(System.out::println);
    }
}
