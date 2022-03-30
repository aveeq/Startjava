public class GuessNumber {
    public static void main(String[] args) {
        //Игра “Угадай число”
        int playerNum = 10;
        int hiddenNum = 5;

        for (int i = 1; i <= 100; i++){
            if (hiddenNum > playerNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
                hiddenNum--;
            } else if (hiddenNum < playerNum) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                hiddenNum++;
            } else {
                System.out.println("Вы победили!");
                break;
            }
        }
    }
}