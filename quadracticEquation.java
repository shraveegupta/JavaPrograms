/* Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
Implement a program to solve a quadratic equation.

Find the discriminant value using the formula given below.

discriminant = b2 - 4ac

If the discriminant is 0, the values of both the roots will be same. Display the value of the root.

If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.

If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"

Use the formula given below to find the roots of a quadratic equation.

x = (-b ± discriminant)/2a 
*/


import java.util.Scanner;

class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float d = (b * b) - 4 * a * c;
        float r1 = (-b + d) / 2 * a;
        float r2 = (-b - d) / 2 * a;
        if (d == 0) {
            System.out.println("The value of both root are same" + r1);
        } else if (d > 0) {
            System.out.println("the value of roots are different" + r1 + ", " + r2);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
