import java.util.*;
public class evenOdd{
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("Number is Even");
        }else{
             System.out.println("Number is Odd");
        }
    }
}