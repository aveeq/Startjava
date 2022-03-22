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

        //Вывод чисел между max и min
        System.out.println("Вывод чисел между max и min\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        
        int minValue = 0;
        int maxValue = 0;
        
        if (num1 < num2) { 
            minValue = num1;
            maxValue = num2;
        } else{
            minValue = num2;
            maxValue = num1;
        }

        if (minValue > num3) { 
            minValue = num3;
        } else { 
            maxValue = num3;
        } 

        for (int j = maxValue; j >= minValue; j--) { 
            System.out.println("Число: " + j);
        } 

        //Вывод реверсивного числа и суммы его цифр
        System.out.println("Вывод реверсивного числа и суммы его цифр\n");

        int numR = 1234;
        int num4 = 0;
        int sumNum = 0;
        int d = 0;

        while (d < 4) {
            num4 = numR % 10;
            numR = numR / 10;
            sumNum = sumNum + num4; 
            System.out.print(num4);
            d++;
        }
        System.out.println("\nCумма цифр числа 1234 = " + sumNum);

        //Вывод чисел на консоль в несколько строк
        System.out.println("Вывод чисел на консоль в несколько строк\n");

        int numZero = 0;
        for (int i4 = 1; i4 < 25; i4 += 2) {
            if (numZero == 5) {
                System.out.println("\n");
                numZero = 0;
            }
            if (i4 <= 9) {
                System.out.print(" ");
            }
            System.out.print(i4 + " ");
            numZero++;
            }
        if (numZero < 5) {
            for (int j = 0; j < 5 - numZero; j++) {
            System.out.print(" 0 ");
            }
        }

        //Проверка количества единиц на четность
        System.out.println("\n. Проверка количества единиц на четность\n");

        int count = 0;
        int num11 = 3141591;
        int num22 = num11 % 10;
        while (num11 != 0) {
            if (num11 % 10 == 1) {
                count++;
            }
            num11 /= 10;
        }
        if (count % 2 == 0) {
            System.out.println("Количество единиц = " + count + " считается чётным\n");
        } else {
            System.out.println("Количество единиц = " + count + " считается нечётным\n");
        }

        //Отображение фигур в консоли
        System.out.println("Отображение фигур в консоли"); 

        for (int i5 = 0; i5 < 50; i5++) {
            if (i5 % 10 == 0) {
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
            for(int i6 = triangle; i6 <= 3; i6++) {
                System.out.print("$");
            }
        System.out.println();
        triangle--;
        } while(triangle > 0);
        do {
            for( int i7 = triangle; i7 < 2; i7++) {
                System.out.print("$");
            }
            System.out.println();
            triangle++;
        } while(triangle <= 2);

        //Отображение ASCII-символов
        System.out.println("Отображение ASCII-символов\n");

        char symbol = 0;
        for (int i1 = 1; i1 < 2; i1++) {
            System.out.println("DEC " + "Char");
            for (int j = 0; j <= 127; j++) {
                if (j < 10) {
                    System.out.println(j + "   " + symbol);
                } else if (j < 100) {
                    System.out.println(j + "   " + symbol);
                } else {
                    System.out.println(j + "   " + symbol);
                }
            symbol++;
            }
        }

        //Проверка, является ли число палиндромом
        System.out.println("Проверка, является ли число палиндромом\n");

        int numP = 12321;
        int numCopy = numP;
        int reverseNum = 0;
        while(numCopy != 0) { 
            reverseNum = reverseNum * 10 + numCopy % 10;
            numCopy /= 10;
        } if (reverseNum == numP) { 
            System.out.println(numP + " Число является палиндромом ");
        } else {
            System.out.println(numP + " Число  не является палиндромом ");
        }

        //Определение, является ли число счастливым
        System.out.println("Определение, является ли число счастливым\n");

                int happyNum = 781529;
        int h1 = 0;
        int h2 = 0;
        int h3 = 0;

        int h4 = happyNum / 1000;
        int h5 = 0;
        int h6 = 0;
        int h7 = 0;

        do {
            h3++;
            h1 = happyNum % 10;
            happyNum = happyNum / 10;
            h2 = h2 + h1;
            System.out.print(h1);
            if (h3 < 3) {
                System.out.print(" + ");
            }
            } while (h3 < 3);
        System.out.println(" = " + h2);

        do {
            h7++;
            h5 = h4 % 10;
            h4 = h4 / 10;
            h6 = h6 + h5;
            System.out.print(h5);
            if (h7 < 3) {
                System.out.print(" + ");
            }
            } while (h7 < 3);
        System.out.println(" = " + h6);

        if (h2 == h6) {
            System.out.println("Число счастливое!");
        } else {
            System.out.println("Число несчастливое!");
        }

        //Вывод таблицы умножения Пифагора
        System.out.println("Вывод таблицы умножения Пифагора\n");
        
        for(int i2 = 1; i2 < 10; i2++) { 
            for(int j1 = 1; j1 < 10; j1++) 
                System.out.printf("%3d",i2 * j1);
                System.out.print("\n");
        }
    }
}