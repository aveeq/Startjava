public class VariablesTheme { 
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль
        System.out.println("Создание переменных и вывод их значений на консоль");

        byte numOfCores = 8;
        short ram = 16;
        int screenWidth = 1920;
        long screenHeight = 1080;
        float coreFrequency = 2.6F;
        double ssdVolume = 256.3;
        char systemDrive = 'C';
        boolean isForWork = true;

        System.out.println("Количество ядер: " + numOfCores);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Ширина экрана: " + screenWidth);
        System.out.println("Высота экрана: " + screenHeight);
        System.out.println("Частота процессора: " + coreFrequency);
        System.out.println("Обьем SSD: " + ssdVolume);
        System.out.println("Обозначение системного диска: " + systemDrive);
        System.out.println("Компьютер для работы: " + isForWork);

        //Расчет стоимости товара со скидкой
        System.out.println("Расчет стоимости товара со скидкой");

        int priceX = 100;
        int priceY = 200;
        int discount = 11;
        int totalPrice = priceX + priceY;
        int sumDiscount = (priceX + priceY) * discount / 100;
        int sumDiscountPrice = totalPrice - sumDiscount;

        System.out.println("Итоговая сумма товаров со скидкой: " + sumDiscountPrice);
        System.out.println("Сумма скидки: " + sumDiscount);

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

        int lattice = 35;
        int ampersand = 38;
        int at = 64;
        int symbol = 94;
        int underscore = 95;

        System.out.println("Символ числа: " + lattice + " будет " + (char) lattice);
        System.out.println("Символ числа: " + ampersand + " будет " + (char) ampersand);
        System.out.println("Символ числа: " + at + " будет " + (char) at);
        System.out.println("Символ числа: " + symbol + " будет " + (char) symbol);
        System.out.println("Символ числа: " + underscore + " будет " + (char) underscore);

        //Произведение и сумма цифр числа
        System.out.println("Произведение и сумма цифр числа");

        int srcNum = 345;
        int numof1 = srcNum / 100;
        int numof2 = (srcNum % 100) / 10;
        int numof3 = srcNum % 10;
        int sumNum = numof1 + numof2 + numof3;
        int compositionNum = numof1 * numof2 * numof3;

        System.out.println("Сумма числа 345 будет " + sumNum);
        System.out.println("Произведение числа 345 будет " + compositionNum);

        //Вывод на консоль ASCII-арт Дюка
        System.out.println("Вывод на консоль ASCII-арт Дюка");

        char slash = '/';
        char backSlash = 92;
        char underScore = '_';
        char bracket1 = '(';
        char bracket2 = ')';
        char space = ' ';

        System.out.println("" + space + space + space + space + slash + backSlash + space + space + space+ space + space + "");
        System.out.println("" + space + space + space + slash + space + space + backSlash + space + space + space + space + space + "");
        System.out.println("" + space + space + slash + underScore + bracket1 + space + bracket2 + backSlash + space + space + space + space + "");
        System.out.println("" + space + slash + space + space + space + space + space + space + backSlash+ space + space + space + "");
        System.out.println("" + slash + underScore + underScore + underScore + underScore + slash + backSlash + underScore + underScore + backSlash + "");

        //Отображение сотен, десятков, единиц числа
        System.out.println("Отображение сотен, десятков, единиц числа");

        int srcNum1 = 123;
        int hundreds = srcNum1 / 100;
        int dozens = srcNum1 % 100 / 10;
        int units = srcNum1 % 10;

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