import java.util.*;
public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int c = a+b; 
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        System.out.println("addition = "+c);
        System.out.println("subtraction = "+d);
        System.out.println("multiplication = "+e);
        System.out.println("Quotient = "+f);
        System.out.println("reminder = "+g);
    }
    
}
