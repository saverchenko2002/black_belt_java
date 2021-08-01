package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sorted {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 7, -3};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

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

        students = students
                .stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .collect(Collectors.toList());
        System.out.println(students);

    }
}
