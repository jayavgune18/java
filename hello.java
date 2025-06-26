import java.util.*;
public class hello{
   
    public static void main(String args[]){
        int n = 5;
        int m = 5;
       
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
             for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
         }

        System.out.println();

        for(int i = 0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
         }

         System.out.println();
          
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                if(i==0|| i==n || j==0 || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
         }
        System.out.println(); 

        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(j+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.println();
         }

        int count = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        } 
    }
}