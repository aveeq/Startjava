public class Calculator {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int result = a;
        char sign = '/';

        if(a > 0 & b > 0) {
            if(sign == '+') {
                result = a + b;
            } else if(sign == '-') {
                result = a - b;
            } else if(sign == '*') {
                result = a * b;
            } else if(sign == '/') {
                result = a / b;
            } else if(sign == '^') {
                for(int i = 1; i <= b; i++) {
                    result *= a;
                }
            } else if(sign == '%') {
                result = a % b;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}