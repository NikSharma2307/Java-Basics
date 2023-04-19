import java.util.*;
public class adult{
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age :");
        int a = sc.nextInt();
        if(a>=18){
            System.out.println("Adult : drive , vote");
        }
        if(a>13 && a<18){
            System.out.println("teenager");
        }
        else {
            System.out.println("not adult");
        }
        
    }
    
}
