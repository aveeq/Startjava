public class JaegerTest {

    public static void main(String[] args) {
        Jaeger coyoteTango = new Jaeger();
        coyoteTango.setModelName("Coyote Tango");
        coyoteTango.setMarkNumber("Mark-1");
        coyoteTango.setOrigin("Japan");
        coyoteTango.setHeight(85.34f);
        coyoteTango.setWeight(2.312f);
        coyoteTango.setSpeed(5);
        coyoteTango.setStrength(7);
        coyoteTango.setArmor(4);
     
        System.out.println("Имя робота:" + coyoteTango.getModelName());
        System.out.println("Номер модели:" + coyoteTango.getMarkNumber());
        System.out.println("Страна производства:" + coyoteTango.getOrigin());
        System.out.println("Высота:" + coyoteTango.getHeight() + " метров");
        System.out.println("Вес:" + coyoteTango.getWeight() + " тонны");
        System.out.println("Скорость:" + coyoteTango.getSpeed());
        System.out.println("Сила:" + coyoteTango.getStrength());
        System.out.println("Броня:" + coyoteTango.getArmor());
     
        System.out.println("===================================================");
     
        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMarkNumber("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(85.34f);
        chernoAlpha.setWeight(2.412f);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);
     
        System.out.println("Имя робота:" + chernoAlpha.getModelName());
        System.out.println("Номер модели:" + chernoAlpha.getMarkNumber());
        System.out.println("Страна производства:" + chernoAlpha.getOrigin());
        System.out.println("Высота:" + chernoAlpha.getHeight() + " метров");
        System.out.println("Вес:" + chernoAlpha.getWeight() + " тонны");
        System.out.println("Скорость:" + chernoAlpha.getSpeed());
        System.out.println("Сила:" + chernoAlpha.getStrength());
        System.out.println("Броня:" + chernoAlpha.getArmor());
    }
}