import java.util.Scanner; 

class Tester {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in); 
        System.out.println("Enter Radius");
        double area;
        double pi= 3.14;
        double radius = r.nextDouble(); 
        area = pi*radius*radius;
        System.out.println("The area of circle is" + area); 
    }
}
