import java.util.Scanner; 

class Tester {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in); 
        System.out.println("Enter Temperature in Fahrenheit");
        float C;
        float F = p.nextFloat(); 
        C = ((F - 32) / 9) * 5;
        System.out.println("Temperatur in celcius is" + C); 
    }
}
