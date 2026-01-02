package Java_8;

interface MyInterface {
     void show();
}

class MyClass {

    public static void main(String[] args) {

        MyInterface m = () -> System.out.println("Hii");

        m.show();
    }

}