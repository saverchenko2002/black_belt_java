package lambda_expressions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {
    public static void main(String[] args) {

//        List<Integer> list = List.of(1, 3, 5, 7, 9);
//        System.out.println(list.stream().filter(n -> n > 5).collect(Collectors.toList()));
        Student st1 = new Student("Ivan", 'm', 22, 3, 9.2);
        Student st2 = new Student("Sergey", 'm', 19, 1, 4.2);
        Student st3 = new Student("Mariya", 'f', 23, 4, 6.2);
        Student st4 = new Student("Dmitriy", 'm', 22, 3, 5.2);
        Student st5 = new Student("Alex", 'm', 21, 2, 7.2);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Function<Student, Double> f = student -> student.avgGrade;

        double res = avgOfSomething(students, student -> student.avgGrade);
        System.out.println(res);




//        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.testStudents(students, s1 -> s1.sex == 'f');
//        Collections.sort(students, (s1, s2) -> {
//            return s1.course - s2.course;
//        });
//        studentInfo.testStudents(students, new CheckOverGrade());
//        studentInfo.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });
//        studentInfo.testStudents(students, (Student s) -> { return s.age<30; } );

//        StudentChecks sc = p -> p.avgGrade < 8;
//        studentInfo.testStudents(students, sc);
    }
    private static double avgOfSomething(List <Student> students, Function<Student,Double> f) {
        double result = 0;
        for (Student student : students) {
            result+=f.apply(student);
        }
        result = result/students.size();
        return result;
    }

    void testStudents(ArrayList<Student> students, Predicate<Student> predicate) {
        for (Student s : students) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
//
//    void printStudentsOverGrade(ArrayList<Student> students, double grade) {
//        for (Student s : students) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> students, int age) {
//        for (Student s : students) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }

//    void printStudentsMixCondition(ArrayList<Student> students, int age, double grade, char sex) {
//        for (Student s : students) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}
//
//class Test {
//    public static void main(String[] args) {
//        Student st1 = new Student("Ivan", 'm', 22, 3, 9.2);
//        Student st2 = new Student("Sergey", 'm', 19, 1, 4.2);
//        Student st3 = new Student("Mariya", 'f', 23, 4, 6.2);
//        Student st4 = new Student("Dmitriy", 'm', 22, 3, 5.2);
//        Student st5 = new Student("Alex", 'm', 21, 2, 7.2);
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(st1);
//        students.add(st2);
//        students.add(st3);
//        students.add(st4);
//        students.add(st5);
//
//        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.printStudentsOverGrade(students, 8);
//        System.out.println();
//        studentInfo.printStudentsUnderAge(students, 22);
//        System.out.println();
//        studentInfo.printStudentsMixCondition(students, 20, 9, 'f');
//    }
//}

//interface StudentChecks {
//    boolean check(Student s);
//}
//
//class CheckOverGrade implements StudentChecks {
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}