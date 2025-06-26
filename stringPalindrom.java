import java.util.*;
public class stringPalindrom{
   
    public static void main(String args[]){
        String rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        String str = sc.nextLine();
        int len = str.length();
        
        for(int i = len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str + " is palindrom");
        }else{
            System.out.println(str + " is not palindrom");
        }

    }
}