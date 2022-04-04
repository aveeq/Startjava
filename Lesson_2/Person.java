public class Person {

    String gender = "Male";
    String name = "Kirill";
    float height = 1.89f;
    float weight = 87.0f;
    int age = 24;

    void go() {
        System.out.println("Идти");
    }

    void sit() {
        System.out.println("Сидит");
    }

    boolean run() {
        System.out.println("Бежит");
        return true;
    }

    boolean talk() {
        System.out.println("Говорит");
        return true;
    }

    boolean learnJava() {
        System.out.println("Учит Java");
        return true;
    }
}