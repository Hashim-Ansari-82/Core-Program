package Java_8;

import java.util.*;
import java.util.stream.Collectors;

class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ConstructorReferenceOperator {


    public static void main(String[] args) {
        List<String> name= Arrays.asList("Hashim","Mohsin","Faheem");
        List<Student> student = name.stream().map(Student::new).collect(Collectors.toList());
       student.forEach(s -> System.out.println(s.getName()));
    }
}
