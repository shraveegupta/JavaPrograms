//Implement a program to display the geometric sequence as given below for a given value n, where n is the number of elements in the sequence.
//1, 2, 4, 8, 16, 32, 64, ......, 1024

import java.util.Scanner;

class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;
        System.out.print(s);
        for (int i = 1; i < n; i++) {
            s = s + s;
            System.out.print("," + s);
        }
    }
}
