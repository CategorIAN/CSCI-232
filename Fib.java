

public class Fib {

    public static int fib(int n) {
        if (n <= 1) { return n ;}
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            if (i % 10 == 1 & i / 10 % 10 != 1) {
                System.out.println(String.format("The %dst Fibonacci number is %d.", i, fib(i)));
            } else if (i % 10  == 2 & i / 10 % 10 != 1) {
                System.out.println(String.format("The %dnd Fibonacci number is %d.", i, fib(i)));
            } else if (i % 10 == 3 & i / 10 % 10 != 1) {
                System.out.println(String.format("The %drd Fibonacci number is %d.", i, fib(i)));
            } else {
                System.out.println(String.format("The %dth Fibonacci number is %d.", i, fib(i)));
            }
        }
    }
}
