package Java_8;

public class Demo {

    public static void main(String[] args) {
        Runnable r=() -> System.out.println("iiii");
        r.run();
    }
}
