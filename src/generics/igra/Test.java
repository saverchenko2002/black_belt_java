package generics.igra;

public class Test {
    public static void main(String[] args) {
        SchoolKid schoolKid1 = new SchoolKid("Ivan", 10);
        SchoolKid schoolKid2 = new SchoolKid("Sergey", 13);

        SchoolKid schoolKid3 = new SchoolKid("Olya", 14);
        SchoolKid schoolKid4 = new SchoolKid("Ilya", 11);

        Student student1 = new Student("Masha", 19);
        Student student2 = new Student("Olga", 21);

        Employee employee1 = new Employee("Zaur", 30);
        Employee employee2 = new Employee("Misha", 35);

        Team<SchoolKid> schoolTeam = new Team<>("Dragons");
        Team<SchoolKid> schoolTeam2 = new Team<>("Monks");

        schoolTeam2.addNewParticipant(schoolKid3);
        schoolTeam2.addNewParticipant(schoolKid4);


        schoolTeam.addNewParticipant(schoolKid1);
        schoolTeam.addNewParticipant(schoolKid2);

        Team<Student> studentTeam = new Team<>("BSU");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Rabotyagi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);


    }
}
