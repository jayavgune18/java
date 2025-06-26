import java.util.*;
public class maxThreeNumber{
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numben ");
        int a = sc.nextInt();
          System.out.println("enter the second numben ");
        int b = sc.nextInt();
          System.out.println("enter the third numben ");
        int c = sc.nextInt();
        if(a > b && a > c ){
            System.out.println("this is Greater "+ a);
        }else if(b > c){
            System.out.println("this is Greater "+ b);
        }else{
            System.out.println("this is Greater "+ c);
        }   
    }
}