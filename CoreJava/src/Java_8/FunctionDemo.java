package Java_8;

interface A{
    String show(String name);
}

public class FunctionDemo {

    public static void main(String[] args) {

        A a=name -> name;
        System.out.println(a.show("Software engineer"));

    }
}
