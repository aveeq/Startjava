public class CyclesTheme {
    public static void main(String[] args) {
        //Подсчет суммы четных и нечетных чисел
        System.out.println("Подсчет суммы четных и нечетных чисел\n");

        int i = -10;
        int sumOdd = 0;
        int sumEven = 0;

        do {
            if(i % 2 > 0) {
                sumOdd += i;
            } else {
                sumEven += i;
            }
            i++;
        } while(i <= 21);

        System.out.println("Сумма диапазона нечетных чисел от -10 до 21 равен " + sumOdd);
        System.out.println("Сумма диапазона четных чисел от -10 до 21 равен " + sumEven);
        System.out.println();

        //Вывод чисел между max и min
        System.out.println("Вывод чисел между max и min\n");

        int num1 = 0;
        int maxValue = 9;
        int minValue = 5;
        
        if (minValue > num1) {
            minValue = num1;
        } else {
            minValue = maxValue;
        }

        for (int j = maxValue; j >= minValue; j--) {
            System.out.println("Число: " + j);
        } System.out.println();

        //Вывод реверсивного числа и суммы его цифр
        System.out.println("Вывод реверсивного числа и суммы его цифр\n");

        int numReversed = 1234;
        int digit = 0;
        int sumDigits = 0;

        while (numReversed != 0) {
            digit = numReversed % 10;
            numReversed /= 10;
            sumDigits += digit; 
            System.out.print(digit);
        }
        System.out.println("\nСумма цифр реверсивного числа = " + sumDigits);
        System.out.println();

        //Вывод чисел на консоль в несколько строк
        System.out.println("Вывод чисел на консоль в несколько строк\n");

        int counter = 0;
        for (int j = 1; j < 25; j += 2) {
            if (counter == 5) {
                System.out.printf("%n%n");
                counter = 0;
            }
            System.out.printf("%3s", j);
            counter++;
        }
        for (int j = 0; j < 5 - counter; j++) {
                System.out.printf("%3s", 0);
            } System.out.println();

        //Проверка количества единиц на четность
        System.out.println("\n Проверка количества единиц на четность\n");

        int count = 0;
        int srcNum = 3141591;

        while (srcNum != 0) {
            if (srcNum % 10 == 1) {
                count++;
            }
            srcNum /= 10;
        }
        if (count % 2 == 0) {
            System.out.println("Количество единиц = " + count + " считается чётным\n");
        } else {
            System.out.println("Количество единиц = " + count + " считается нечётным\n");
        }

        //Отображение фигур в консоли
        System.out.println("Отображение фигур в консоли"); 

        for (int j = 0; j < 50; j++) {
            if (j % 10 == 0) {
                System.out.print("\n");
            }
            System.out.print("*");
        }
         System.out.println("\n");

        int num5 = 5;
        int num6 = 5;
        while (num5 > 0) {
            while (num6 > 0) {
                System.out.print("#");
                num6--;
            }
            System.out.print("\n");
            num5--;
            num6 = num5;
        }
        System.out.print("\n");

        int triangle = 3;
        do {
            for(int k = triangle; k <= 3; k++) {
                System.out.print("$");
            }
        System.out.println();
        triangle--;
        } while(triangle > 0);
        do {
            for( int j = triangle; j < 2; j++) {
                System.out.print("$");
            }
            System.out.println();
            triangle++;
        } while(triangle <= 2);

        //Отображение ASCII-символов
        System.out.println("Отображение ASCII-символов\n");

        char symbol = 0;
        System.out.println("DEC " + "Char");
        for (int j = 0; j <= 128; j++) { 
            if (j < 128) {
                System.out.printf(j + "%3s", symbol);
                System.out.println();
            }
        symbol++;
        }

        //Проверка, является ли число палиндромом
        System.out.println("Проверка, является ли число палиндромом\n");

        int numP  = 12321;
        int actualNum = numP ;
        int x2 = 0;
        while (numP / 1 != 0) {
            x2 *= 10;
            x2 += numP  % 10;
            numP  /= 10;
        }

        if (actualNum == x2) {
            System.out.println("Число " + actualNum + " является палиндромом");
        } else {
            System.out.println("Число " + actualNum + " не является палиндромом");
        } System.out.println();

        //Определение, является ли число счастливым
        System.out.println("Определение, является ли число счастливым\n");

        int srcNum1 = 781529;
        int digit1 = 0;
        int sumThreeNum = 0;
        int sumSecondThreeNum = 0;
        int firstPartNum = 0;
        int secondPartNum = 0;


        for (int j = 0; j < 6; j++) {
            digit1 = srcNum1 % 10;
            srcNum1 /= 10;

            if (srcNum1 / 100 != 0) {
                firstPartNum++;
                sumThreeNum += digit1;
                System.out.print(digit1);
                if (firstPartNum < 3) {
                    System.out.print(" + ");
                } else if (firstPartNum == 3) {
                    System.out.println(" = " + sumThreeNum);
                }
            } else {
                secondPartNum++;
                sumSecondThreeNum += digit1;
                System.out.print(digit1);
                if (secondPartNum < 3) {
                    System.out.print(" + ");
                } else if (secondPartNum == 3) {
                    System.out.println(" = " + sumSecondThreeNum);
                }
            }
        }
        if (sumThreeNum == sumSecondThreeNum) {
            System.out.println("Число счастливое!");
        } else {
            System.out.println("Число несчастливое!");
        }

        //Вывод таблицы умножения Пифагора
        System.out.println("Вывод таблицы умножения Пифагора\n");

        int j = 2;
        int k = 0;

        System.out.print("   ");
        while (j < 10) {
            System.out.print(" " + j + " ");
            j++;
        }
        System.out.println();
        for (j = 2; j < 10; j++) {
            System.out.print(" " + j + " ");
            for (k = 2; k < 10; k++) {
                if (j * k < 10) {
                    System.out.print(" " + j * k + " ");
                } else {
                    System.out.print(j * k + " ");
                }
            }
            System.out.println();
        }
    }
}