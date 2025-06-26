import java.util.*;
public class factorial{
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int fact = 1;
        int a = sc.nextInt();
        for(int i =1; i<=a; i++){
            fact =  fact * i;
        }
         System.out.println("factorial  = "+ fact);

    }
}