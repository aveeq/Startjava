public class CyclesTheme { 
    public static void main(String[] args) {
        //Подсчет суммы четных и нечетных чисел
        System.out.println("Подсчет суммы четных и нечетных чисел");

        int i = -10;
        int sumNum = 0;
        int sumNum2 = 0;

        do {
            if(i % 2 > 0) { 
                sumNum += i;
            } else {
                sumNum2 += i;
            }
            i++;
        } while(i <= 21);

        System.out.println("Сумма диапазона нечетных чисел от -10 до 21 равен " + sumNum);
        System.out.println("Сумма диапазона четных чисел от -10 до 21 равен " + sumNum2);

        //Вывод чисел между max и min
        System.out.println("Вывод чисел между max и min");

        int number1 = -1;
        int number2 = 5;
        int number3 = 10;

        if(number1 < number2 && number2 < number3 && number1 < number3) {
            System.out.println("Максимальными и минимальными числами являются " + number3 + number1);
        }
        for(int j = 10;j > -2;j--) {
            System.out.println(j);
        }

        //Вывод реверсивного числа и суммы его цифр
        System.out.println("Вывод реверсивного числа и суммы его цифр");

        int totalNum = 1234;
        int reversedNum = 0;
        int sumNumber = 0;
        
        while(totalNum != 0) {
            sumNumber = sumNumber + totalNum % 10;
            int digit = totalNum % 10;
            reversedNum = reversedNum * 10 + digit;
            totalNum /= 10;
        }
        System.out.println("Исходное значение в обратно порядке: " + reversedNum);
        System.out.println("Сумма числа 1234 равно: " + sumNumber);

        //Вывод чисел на консоль в несколько строк
        System.out.println("Вывод чисел на консоль в несколько строк");

        for(int m = 1; m <= 24; m += 2) { 
            System.out.printf("%3d",m);
            if((m + 1) % 10 == 0) { 
                System.out.println("");

            } 
        } System.out.println(" 00 00 00");
        
        //Проверка количества единиц на четность
        System.out.println("Проверка количества единиц на четность");

        int count = 0;
        int units = 3141591;
        int units1 = units % 10;
        while (units != 0) {
            if (units % 10 == 1) {
                count++;
            }
            units /= 10;
        }
        if (count % 2 == 0) { 
            System.out.println("Количество единиц  " + count + " считается чётным");
        } else {
            System.out.println("Количество единиц  " + count + " считается нечётным");
        }


        //Отображение фигур в консоли
        System.out.println("Отображение фигур в консоли");
        int square = 7;
        for(int n = 2;n < square;n++) { 
            for(int x = -3;x < square;x++) {
                System.out.print("*");
            } System.out.println();
        } 

        int num1 = 5;
        int num2 = 5;
        while (num1 > 0) {
            while (num2 > 0) {
                System.out.print("#");
                num2--;
            }
            System.out.print("\n");
            num1--;
            num2 = num1;
        }
        System.out.print("\n");

        int num3 = -2;
        int num4 = 0;
        System.out.println("$");
        do {
            do { 
                num4++;
                System.out.print("$");
            } while (num4 < 2);
            System.out.println("");
            num3++;
            num4 = num3;
        } while (num3 < 2);

        //Отображение ASCII-символов
        System.out.println("Отображение ASCII-символов");

        for(char s = '0';s < 128;s++) { 
            System.out.println((char)s);
        }

        //Проверка, является ли число палиндромом
        System.out.println("Проверка, является ли число палиндромом");

        int num = 12321;
        int numCopy = num;
        int reverseNum = 0;
        while(numCopy != 0) { 
            reverseNum = reverseNum * 10 + numCopy % 10;
            numCopy /= 10;
        } if (reverseNum == num) { 
            System.out.println(num + " Число является палиндромом ");
        } else {
            System.out.println(num + " Число  не является палиндромом ");
        }

        //Вывод таблицы умножения Пифагора
        System.out.println("Вывод таблицы умножения Пифагора");

        for(int t = 1;t < 10;t++) { 
            for(int p = 1;p < 10;p++) 
                System.out.printf("%3d",t * p);
                System.out.print("\n");
        }
    }
}










