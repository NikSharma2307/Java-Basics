// sum of first n natural numbers
import java.util.*;
public class sumn {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter nth term");
    int n = sc.nextInt();
    int count=0;
    int sum=0;
    while(count<=n){
        sum+=count;
        count++;
    }
    System.out.println("sum of first "+n+" natural numbers= "+sum);
}
    
}
