import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Student> studentList = List.of(
            new Student("John", 17, 6.7),
            new Student("Willie", 20, 7.3),
            new Student("Bill", 23, 8.6),
            new Student("Clint", 22, 7.8),
            new Student("Bob", 19, 8.2)
        );

        //------------------------1nd-Task--------------------------------
        System.out.println("1st-Task--------------------------");
        // Stream<Student> ageMore = streamFromList.filter(contact -> contact.getAge() < 22);
        // List<Student> olderStudents = ageMore.collect(Collector.toList());
        Stream<Student> streamFromList = studentList.stream();
        List<Student> newOlderStudents = streamFromList
                .filter(student -> student.getAge() >= 22)
                .collect(Collectors.toList());

        System.out.println(newOlderStudents);
        System.out.println("----------------------------------");

        //------------------------2nd-Task--------------------------------
        System.out.println("2nd-Task--------------------------");
        List<String> names = new ArrayList<>();
        for (Student student  : studentList){
            names.add(student.getName());
        }
        System.out.println(names);
        System.out.println("----------------------------------");

        //------------------------3rd-Task--------------------------------
        System.out.println("3d-Task--------------------------");
        Integer ageStudents = studentList.stream()
            .map(student -> student.getAge())
            .reduce(0, (accumu, element) -> accumu + element);
            System.out.println(ageStudents);

        System.out.println("----------------------------------");

    }
}
