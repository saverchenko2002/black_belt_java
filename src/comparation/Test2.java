package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100, "Sergey", "Saverchenko", 500));
        list.add(new Employee(150, "Ivan", "Petrov", 300));
        list.add(new Employee(10, "Ivan", "Smirnov", 400));

        System.out.print("Before sort: ");
        System.out.println(list);
        System.out.print("After sort: ");
        Collections.sort(list, new IdComparator());
        System.out.println(list);

    }
}

class Employee {
    //        implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public int compareTo(Employee anotherEmp) {
//        if (this.id == anotherEmp.id)
//            return 0;
//        else if (this.id < anotherEmp.id)
//            return -1;
//        else
//            return 1;
//        return this.id - anotherEmp.id;
//        return this.id.compareTo(anotherEmp.id);
//        int res = this.name.compareTo(anotherEmp.name);
//        if (res == 0) {
//            res = this.surname.compareTo(anotherEmp.surname);
//        }
//        return res;
//    }
}

class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id)
            return 0;
        else if (emp1.id < emp2.id)
            return -1;
        else
            return 1;
    }
}