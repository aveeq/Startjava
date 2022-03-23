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

        //Вывод чисел на консоль в несколько строк
        System.out.println("Вывод чисел на консоль в несколько строк\n");

        int NumZero = 0;
        for (int j = 1; j < 25; j += 2) {
            if (NumZero == 5) {
                System.out.printf("%n%n");
                NumZero = 0;
            }            
            System.out.printf("%3s", j);
            NumZero++;
        } 
        if (NumZero < 5) {
            for (int j = 0; j < 5 - NumZero; j++) {
                System.out.printf("%3s", 0);
            } 
        }

        //Проверка количества единиц на четность
        System.out.println("\n. Проверка количества единиц на четность\n");

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

        char symbolChar = 0;
            System.out.println("DEC " + "Char");
            for (int j = 0; j <= 127; j++) { 
                if (j < 10) { 
                    System.out.println(j + "   " + symbolChar);
                } else if (j < 100) { 
                    System.out.println(j + "   " + symbolChar);
                } else { 
                    System.out.println(j + "   " + symbolChar);
                } 
            symbolChar++;
            }

        //Проверка, является ли число палиндромом
        System.out.println("Проверка, является ли число палиндромом\n");

        int numP  = 12321;
        int actualNum = numP ;
        int x2 = 0;
        while (numP / 1 != 0) {
            x2 *= 10;
            x2 = x2 + numP  % 10;
            numP  /= 10;
        }

        if (actualNum == x2) {
            System.out.println("Число " + actualNum + " является палиндромом.");
        } else {
            System.out.println("Число " + actualNum + " не является палиндромом.");
        }

        //Определение, является ли число счастливым
        System.out.println("Определение, является ли число счастливым\n");

        int randomNum = 781529;
        int firstThree = 0;
        int sumFirstThree = 0;
        int firstPartNumber = 0;

        int halfNum = randomNum / 1000;
        int secondThree = 0;
        int sumSecondThree = 0;
        int secondPartNumber = 0;

        do {
            firstPartNumber++;
            firstThree = randomNum % 10;
            randomNum = randomNum / 10;
            sumFirstThree = sumFirstThree + firstThree;
            System.out.print(firstThree);
            if (firstPartNumber < 3) {
                System.out.print(" + ");
            } 
            } while (firstPartNumber < 3);
        System.out.println(" = " + sumFirstThree);

        do {
            secondPartNumber++;
            secondThree = halfNum % 10;
            halfNum = halfNum / 10;
            sumSecondThree = sumSecondThree + secondThree;
            System.out.print(secondThree);
            if (secondPartNumber < 3) {
                System.out.print(" + ");
            }
            } while (secondPartNumber < 3);
        System.out.println(" = " + sumSecondThree);

        if (sumFirstThree == sumSecondThree) {
            System.out.println("Число счастливое!");
        } else {
            System.out.println("Число несчастливое!");
        }

        //Вывод таблицы умножения Пифагора
        System.out.println("Вывод таблицы умножения Пифагора\n");
        
        for(int j = 1; j < 10; j++) { 
            for(int k = 1; k < 10; k++) 
                System.out.printf("%3d",j * k);
                System.out.print("\n");
        }
    }
}