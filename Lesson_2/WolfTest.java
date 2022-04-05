public class WolfTest {

    String nickname;
    float weight;
    int age;
    String color;

    public static void main(String[] args) {
        WolfTest wolf = new WolfTest();
        wolf.nickname = "Кузя";
        wolf.weight = 10.3f;
        wolf.age = 12;
        wolf.color = "Серый";

        System.out.println("Кличка Волка: " + wolf.nickname);
        System.out.println("Вес: " + wolf.weight);
        System.out.println("Возраст: " + wolf.age);
        System.out.println("Цвет: " + wolf.color);
    }
}