public class IfElseStatementTheme { 

    public static void main(String[] args) { 
        //Перевод псевдокода на язык Java
        System.out.println("Перевод псевдокода на язык Java");

        int age = 17;
        if(age > 20) { 
            System.out.println("Человек старше " + age + "лет");
        } else {
            System.out.println("человек младше " + age + "лет");
        }

        boolean isMale = false;
        if (!isMale) { 
            System.out.println("Человек женского пола"); 
        }

        float height = 1.43F;
        if (height < 1.23) { 
            System.out.println("Рост человека выше " + height + "см");
        } else {
            System.out.println("Рост человека ниже " + height + "см");
        }

        char firstNameLetter = "Kirill".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("Первая буква имени человека - " + firstNameLetter);
        } 
        else if (firstNameLetter == 'I') { 
            System.out.println("Первая буква имени человека - " + firstNameLetter);
        } 
        else {
            System.out.println("Первая буква имени человека не M и не I");
        }

        //Поиск максимального и минимального числа
        System.out.println("Поиск максимального и минимального числа");

        int num1 = 32;
        int num2 = 64;
        if (num1 > num2) { 
            System.out.println("Число " + num1 + "больше чем число " + num2);
        } else if (num1 < num2) {
            System.out.println("Число " + num1 + " меньше чем число " + num2);
        }

        //Работа с числом
        System.out.println("Работа с числом");

        int srcNum = 8;
        if (srcNum % 2 == 0) { 
            System.out.println("Число " + srcNum + " является четным");
        } else {
            System.out.println("Число " + srcNum + " является нечетным");
        }
        if (srcNum < 0){
            System.out.println("Число " + srcNum + " является отрицальным");
        } else if (srcNum > 0) {
            System.out.println("Число " + srcNum + "  является положительным");
        } else {
            System.out.println("Число " + srcNum + " является нулем");
        }

        //Поиск общей цифры в числах
        System.out.println("Поиск общей цифры в числах");

        int srcNum1 = 251;
        int srcNum2 = 341;
        int firstNum1 = srcNum1 / 100;
        int secondNum1 = (srcNum1 % 100) / 10;
        int thirdNum1 = srcNum1 % 10;
        int firstNum2 = srcNum2 / 100;
        int secondNum2 = (srcNum2 % 100) / 10;
        int thirdNum2 = srcNum2 % 10;
        if (firstNum1 == firstNum2) { 
            System.out.println("У числа " + srcNum1 + " и " + srcNum2 + " общее является число " + firstNum1);
        } else if (secondNum1 == secondNum2) { 
            System.out.println("У числа " + srcNum1 + " и " + srcNum2 + " является " + secondNum1);
        } else if (thirdNum1 == thirdNum2) { 
            System.out.println("У числа " + srcNum1 + " и " + srcNum2 + " является " + thirdNum1);
        }

        //Определение буквы или символа по их коду
        System.out.println("Определение буквы или символа по их коду");

        char symbol = '\u005A';
        if ((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z') || (symbol >= 'А' && symbol <= 'Я') || (symbol >= 'а' && symbol <= 'я')) { 
            System.out.println("Символ " + symbol + " является буквой " + "Z");
        } else if ((symbol == '0') || (symbol == '9')) { 
            System.out.println("Символ " + symbol + "является числом " + "1");
        } else {
            System.out.println("Символ " + symbol + "не число и не буква");
        }

        //Определение суммы вклада и начисленных банком %
        System.out.println("Определение суммы вклада и начисленных банком %");

        int depositAmount = 300_000;
        int percent = 0;
        int totalAmount;
        totalAmount = depositAmount * percent / 100;

        if (depositAmount < 100_00) {
            System.out.println("Если сумма вклада меньше " + 100_000 + " банк начисляет " + (percent = 5) + " процентов");
        } else if (depositAmount >= 150_000) {
            System.out.println("Если сумма вклада меньше " + 150_000 + " банк начисляет " + (percent = 7) + " процентов");
        } else if (depositAmount > 300_00) {
            System.out.println("Если сумма вклада больше " + 300_000 + " банк начисляет " + (percent = 10) + " процентов");
        }

        totalAmount = depositAmount * percent / 100;
        System.out.println("Итоговая сумма с начисленными процентами будет " + totalAmount);

        //Определение оценки по предметам
        System.out.println("Определение оценки по предметам");

        int scorePercentHistory = 59;
        int scorePercentProgramming = 91;
        double scoreHistory;
        double scoreProgramming;
        double averagePercent = (scorePercentHistory + scorePercentProgramming) / 2;
        double scoreAverage;

        if (scorePercentHistory <= 60) { 
            scoreHistory = 2;
        } else if (scorePercentHistory > 60 && scorePercentHistory > 73) {
            scoreHistory = 3;
        } else if (scorePercentHistory > 73 && scorePercentHistory > 91) {
            scoreHistory = 4;
        } else { 
            scoreHistory = 5;
        }

        if (scorePercentProgramming <= 60) { 
            scoreProgramming = 2;
        } else if (scorePercentProgramming > 60 && scorePercentProgramming > 73) {
            scoreProgramming = 3;
        } else if (scorePercentProgramming > 73 && scorePercentProgramming > 91) {
            scoreProgramming = 4;
        } else { 
            scoreProgramming = 5;
        }

        scoreAverage = (scoreProgramming + scoreHistory) / 2;

        System.out.println("Оценка по истории " + scoreHistory);
        System.out.println("Оценка по программированию " + scoreProgramming);
        System.out.println("Средний балл оценки по всем предметам " + scoreAverage);
        System.out.println("Средний процент по предметам " + averagePercent);

        //Расчет прибыли (убытка)
        System.out.println("Расчет прибыли (убытка)");

        int rentPrice = 5000;
        int salePriceMonth = 15000;
        int costPrice = 9000;
        int salePriceYear = (salePriceMonth - costPrice - rentPrice) * 12;
        if (salePriceYear < 0) { 
            System.out.println("Убыток продавца за год составила - " + salePriceYear);
        } else if(salePriceYear > 0) { 
            System.out.println("Прибыль продавца за год составила + " + salePriceYear);
        }

        //Определение существования треугольника
        System.out.println("Определение существования треугольника");

        int sideX = 5;
        int sideY = 5;
        int sideZ = 9;
        int cornerSide = 90;
        if(sideX + sideY > sideZ && sideX + sideZ > sideY && sideY + sideZ > sideX){
            System.out.println("Такой треугольник существует!");
        } else {
            System.out.println("Такой треугольник существует не существует!");
        }

        double triangleS = 0.5 * sideX * sideY;

        System.out.println("Площадь треугольника равна " + triangleS);

        System.out.println("          /|");
        System.out.println("         / |");
        System.out.println("        /  |");
        System.out.println("       /   |");
        System.out.println("      /    |");
        System.out.println("     /     |");
        System.out.println("    /      |");
        System.out.println("   /       |");
        System.out.println("  /        |");
        System.out.println("  _________| ");

        //Подсчет количества банкнот
        System.out.println("Подсчет количества банкнот");

        int totalSum = 567;
        int nominal50 = totalSum / 50;
        int nominal10 = (totalSum % 50) / 10;
        int nominal1 = totalSum % 10;
        int originalSum = nominal50 * 50 + nominal10 * 10 + nominal1 * 1;

        System.out.println("Количество банкнот 50 :" + nominal50);
        System.out.println("Количество банкнот 10 :" + nominal10);
        System.out.println("Количество банкнот 1 :" + nominal1);
        System.out.println("Исходная сумма суммы 567 :" + originalSum);
    }
}
