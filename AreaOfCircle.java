/* Implement a program to find the area of a circle by using the formula given below and display the calculated area. 

Area = pi*radius*radius 

The value of pi is 3.14 */


import java.util.Scanner; 

class Tester {
    public static void main(String[] args) 
    {
        Scanner r = new Scanner(System.in);// to take input 
        System.out.println("Enter Radius");
        double area;
        double pi= 3.14;
        double radius = r.nextDouble(); 
        area = pi*radius*radius;
        System.out.println("The area of circle is" + area); 
    }
}
