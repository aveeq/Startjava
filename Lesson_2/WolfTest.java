public class WolfTest {

    public static void main(String[] args) {
        WolfTest wolf = new WolfTest();
        wolf.setNickname("Кузя");
        wolf.setWeight(10.3f);
        wolf.setAge(12);
        wolf.setColor("Серый");

        System.out.println("Кличка Волка: " + wolf.getNickname);
        System.out.println("Вес: " + wolf.getWeight);
        System.out.println("Возраст: " + wolf.getAge);
        System.out.println("Цвет: " + wolf.getColor);
    }
}