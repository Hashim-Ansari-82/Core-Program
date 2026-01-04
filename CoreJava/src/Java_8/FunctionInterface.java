package Java_8;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {


        Function<Integer,Integer> f= x ->2 * x;
        Function<Integer,Integer> f1=x -> x * x * x;

        System.out.println(f.andThen(f1).apply(3));
        System.out.println(f1.andThen(f).apply(3));
        System.out.println(f.compose(f1).apply(3));

     /* Function<String, String> function = x -> x.toUpperCase();
        Function<String, String> function1 = x -> x.toString();
        System.out.println(function1.andThen(function).apply("Hashim"));

      /*  System.out.println(function.apply("Hashim Ansari"));
        System.out.println(function1.apply("Hashim Ansari"));
        Function<List<Student>, List<Student>> prefixHa = l -> {
            List<Student> result = new ArrayList<>();
            for (Student s : l) {
                if (function1.apply(s.getName()).equalsIgnoreCase("ha")){
                    result.add(s);
                }
            }
            return result;
        };

        Student s1 = new Student("Hashim", 12);
        Student s2 = new Student("Hamza", 13);
        Student s3 = new Student("Hhad", 14);
        List<Student> student= Arrays.asList(s1,s2,s3);
        List<Student> filteredStudent=prefixHa.apply(student);
        System.out.println(filteredStudent);*/
   // }
   /* private static class Student{
        private int id;
        private String name;


        public Student(String name,int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return "Student{" +"id=" + id + ", name='" + name + '\'' + '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }*/
    }
}
