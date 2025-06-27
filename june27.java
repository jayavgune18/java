import java.util.*;
class vehicle{
    public void drive(){
        System.out.println("drive the vehicle");
    }
}
class car extends vehicle{
     public void drive(){
        System.out.println("this is method");
    }
     public void breaks(){
        System.out.println("this is specialised method");
    }
} class bike extends car {
    public void drive(){
        System.out.println("this is for bike ");
    }

}

public  class Animal{
    void bark(){
        System.out.println("Barking");
    }

}
public class demo{
    // void print(int a){
    //     System.out.println("print 1 method");
    // }
    //  void print(int a, int b){
    //     System.out.println("print 2 method");
    // }
    //  void print(float a, float b){
    //     System.out.println("print 3 method");
    // }
    //  void print(int a , float b){
    //     System.out.println("print 4 method");
    // }
    //  void print(int a, int b, float c){
    //     System.out.println("print 5 method");
    // }
    //  void print(int a, float b, float c){
    //     System.out.println("print 6 method");
    // }
    //  void print(float a, int b, double c){
    //     System.out.println("print 7 method");
    // }
    //  void print(double a, double b){
    //     System.out.println("print 8 method");
    // }
    //  void print(double a, float){
    //     System.out.println("print 9 method");
    // }
    //  void print(double a, boolean b){
    //     System.out.println("print 10 method");
    // }
    //  void print(double  a, int b){
    //     System.out.println("print 11 method");
    // }
    //  void print(boolean a, int b){
    //     System.out.println("print 12 method");
    // }
    void add(){
        System.out.println(10+20);
    }
}
class demo1 extends demo{
    void mul(){
        System.out.println(10*20);
    }
}
public class june27{
    public static void main(String args[]){
        // switch case 
        int day = 4;
        // switch(day){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Please Enter the vaid day");
        //         break; 
        //      }

        // bitwise oparator
        int a = 5;
        int b = 7;
        System.out.println("A & B : "+ (a&b));  // AND
        System.out.println("A | B : "+ (a|b));  // OR
        System.out.println("A ^ B : "+ (a^b));  // XOR
        System.out.println(" ~A : "+ (~a));  // bitwise compliment

        Animal dog = new Animal();
        dog.bark();

        // demo d1 = new demo();
        // d1.print(20, 30);

        demo1 dd1 = new demo1();
        dd1.add();
        dd1.mul();

        car c = new car();
        c.drive();
        c.breaks();
        
        bike b1 = new bike();
        b1.drive();
        
    }
}