import java.util.Scanner;

class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;
        while (number > 0) {
            factorial = factorial * number;
            number--;
        }
        System.out.print(factorial);
    }
}
