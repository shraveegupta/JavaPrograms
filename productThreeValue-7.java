/*

Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.

Note: Only one of the three values can be 7.

*/

import java.util.Scanner;

class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a == 7 && b == 7 && c != 7) || (a != 7 && b == 7 && c == 7) || (a == 7 && b != 7 && c == 7)
                || (a == 7 && b == 7 && c == 7)) {
            System.out.println("only of three values can be 7");
        } else if (c == 7) {
            System.out.println("-1");
        } else if (b == 7) {
            System.out.println(c);

        } else if (a == 7) {
            System.out.println((b * c));
        } else {
            System.out.println((a * b * c));
        }
    }
}
