import java.util.*;
public class leapYear{
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int year = sc.nextInt();
        if(year % 2 == 0){
            System.out.println( year +" is a leap year");
        }else if(year % 100 == 0 && year % 400 == 0){
            System.out.println( year +" is a leap year");
        }else{
             System.out.println( year+" not  a leap year");
        }
    }
}