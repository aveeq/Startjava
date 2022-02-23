public class VariablesTheme{
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль
        System.out.println("Создание переменных и вывод их значений на консоль");

        byte numofcores = 8;
        short ram = 16;
        int screenWidth = 1920;
        long screenHeight = 1080;
        float corefrequency = 2.6F;
        double ssdVolume = 256.3;
        char systemDrive = 'C';
        boolean isForWork = true;

        System.out.println("Количество ядер: " + numofcores);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Ширина экрана: " + screenWidth);
        System.out.println("Высота экрана: " + screenHeight);
        System.out.println("Частота процессора: " + corefrequency);
        System.out.println("Обьем SSD: " + ssdVolume);
        System.out.println("Обозначение системного диска: " + systemDrive);
        System.out.println("Компьютер для работы: " + isForWork);

        //Расчет стоимости товара со скидкой
        System.out.println("Расчет стоимости товара со скидкой");

        int priceX = 100;
        int priceY = 200;
        int discount = 11;
        int totalprice = priceX + priceY;
        int summDiscount = (priceX+priceY) * discount / 100;
        int summDiscountPrice = totalprice - summDiscount;

        System.out.println("Итоговая сумма товаров со скидкой: " + summDiscountPrice);
        System.out.println("Сумма скидки: " + summDiscount);

        //Вывод на консоль слова JAVA
        System.out.println("Вывод на консоль слова JAVA:");

        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a");

        //Отображение min и max значений числовых типов данных
        System.out.println("Отображение min и max значений числовых типов данных");

        byte maxByteValue = 127;
        short maxShortValue = 32767;
        int maxIntValue = 2147483647;
        long maxLongValue = 9223372036854775807L;

        System.out.println("Максимальное значение Byte: " + maxByteValue);
        System.out.println("Максимальное значение Short: " + maxShortValue);
        System.out.println("Максимальное значение Int: " + maxIntValue);
        System.out.println("Максимальное значение Long: " + maxLongValue);

        System.out.println("Инкремент значение Byte: " + ++maxByteValue);
        System.out.println("Инкремент значение Short: " + ++maxShortValue);
        System.out.println("Инкремент значение Int: " + ++maxIntValue);
        System.out.println("Инкремент значение Long: " + ++maxLongValue);

        System.out.println("Декремент значение Byte: " + --maxByteValue);
        System.out.println("Декремент значение Short: " + --maxShortValue);
        System.out.println("Декремент значение Int: " + --maxIntValue);
        System.out.println("Декремент значение Long: " + --maxLongValue);

        //Перестановка значений переменных
        System.out.println("Перестановка значений переменных");

        double num = 1.37;
        double num1 = 2.32;
        double num2;

        System.out.println("Значение переменной num: " + num);
        System.out.println("Значение переменной num1: " + num1);

        num2 = num;
        num = num1;
        num1 = num2;

        System.out.println("Значение переменной num2 теперь: " + num2);
        System.out.println("Значение переменной num теперь: " + num);
        System.out.println("Значение переменной num1 теперь: " + num1);

        //Вывод символов и их кодов
        System.out.println("Вывод символов и их кодов");

        int number1 = 35;
        int number2 = 38;
        int number3 = 64;
        int number4 = 94;
        int number5 = 95;

        System.out.println("Символ числа: " + number1 + " будет " + (char) number1);
        System.out.println("Символ числа: " + number2 + " будет " + (char) number2);
        System.out.println("Символ числа: " + number3 + " будет " + (char) number3);
        System.out.println("Символ числа: " + number4 + " будет " + (char) number4);
        System.out.println("Символ числа: " + number5 + " будет " + (char) number5);

        //Произведение и сумма цифр числа
        System.out.println("Произведение и сумма цифр числа");

        int srsNum = 345;
        int numof1 = srsNum / 100;
        int numof2 = (srsNum % 100) / 10;
        int numof3 = srsNum % 10;
        int summnNumm = numof1 + numof2 + numof3;
        int compositionNumm = numof1 * numof2 * numof3;

        System.out.println("Сумма числа 345 будет " + summnNumm);
        System.out.println("Произведение числа 345 будет " + compositionNumm);

        //Вывод на консоль ASCII-арт Дюка
        System.out.println("Вывод на консоль ASCII-арт Дюка");

        char slash = 47;
        char backSlash = 92;
        char bottomSpace = 95;
        char bracket1 = 40;
        char bracket2 = 41;
        char space = 32;

        System.out.println("" +space + space + space + space + slash + backSlash + space + space + space+ space + space + "");
        System.out.println("" +space + space + space + slash + space + space + backSlash + space + space + space + space + space + "");
        System.out.println("" + space + space + slash + bottomSpace + bracket1 + space + bracket2 + backSlash + space + space + space + space + "");
        System.out.println("" + space + slash + space + space + space + space + space + space + backSlash+ space + space + space + "");
        System.out.println("" + slash + bottomSpace + bottomSpace + bottomSpace + bottomSpace + slash + backSlash + bottomSpace + bottomSpace + backSlash + "");

        //Отображение сотен, десятков, единиц числа
        System.out.println("Отображение сотен, десятков, единиц числа");

        int variable = 123;
        int hundreds = variable / 100;
        int dozens = variable % 100 / 10;
        int units = variable % 10;

        System.out.println("Сотни числа 123: " + hundreds);
        System.out.println("Десятки числа 123: " + dozens);
        System.out.println("единицы числа 123: " + units);

        //Преобразование секунд
        System.out.println("Преобразование секунд");

        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minuts = (totalSeconds % 3600)/ 60;
        int seconds = (totalSeconds % 3600) % 60;

        System.out.println("Время в формате: часы:минуты:секунды : " + hours + ":" + minuts + ":" + seconds);
    }
}