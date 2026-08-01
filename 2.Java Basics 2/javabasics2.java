

// FUNCTIONS AND METHODS.
/*
public class javabasics2{
    public static void helloworld(){            // function declaration.
        System.out.println("Hello World!");
        System.out.println("Hello World!");      // body.
        System.out.println("Hello World!");
        return ;                                // even if we don't write return for void return type code will still run.

    }
    public static void main (String args[]){
        
        helloworld();                            // function call

    }
}
*/





/*
import java.util.*;
public class javabasics2{
    public static void calculate(){
        Scanner sc = new Scanner ( System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b ;

        System.out.print("Sum is : " + sum);
        return;
    }
    public static void main(String args[]){

        calculate();

    }
}
*/


/*
import java.util.*;
public class javabasics2{
    public static int calculate(int num1 , int num2){       //parameters or formal parameters.
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculate(a,b);               // Arguments /Actual parameters.

        System.out.print("Sum is : " + sum);

    }
}
*/



/*
import java.util.*;
public class javabasics2{
    public static void swap(int a , int b){
        
        //swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int a = 5;
        int b = 10;

        //swap
        swap(a,b);


        System.out.println(a);
        System.out.println(b);

    }
}
*/





/*
import java.util.*;
public class javabasics2{
   public static int fact(int n){
    int m=1;
    for(int i = n; i > 0 ; i--){
        m = m*i;
    }
    return m;
   }
    public static void main(String args[]){
            Scanner sc = new Scanner (System.in);
        int n =  sc.nextInt();

        int m = fact(n);

        System.out.println("The factorial is : " + m);

    }
}
*/




/*
// Binomial coefficient.
import java.util.*;
public class javabasics2{
   public static int fact(int n){
    int m=1;
    for(int i = n; i > 0 ; i--){
        m = m*i;
    }
    return m;
   }

   public static int binomialcoff(int n , int r){
            int a = fact(n);
            int b = fact(r);
            int c = fact(n-r);

            int bc = a / (b*c) ;
            return bc;
   }
    public static void main(String args[]){
            Scanner sc = new Scanner (System.in);
        int n =  sc.nextInt();
        int r = sc.nextInt();


        int bc = binomialcoff(n,r);

        System.out.println(bc);

    }
}
*/



/*
// Function overloading.
//using parameters.
public class javabasics2 {
    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a  ,int b, int c){
        return a + b + c;
    }
    public static void main(String args[]){


        System.out.println(sum(3,5));
        System.out.println(sum(3,4,5));

    }
}
*/
/*
public class javabasics2{

    public static int sum(int a , int b){
        return a+b;
    }
    public static float sum(float a , float b){
        return a+b;
    }
    public static void main(String args []){

        System.out.println(sum(3,4));
        System.out.print(sum(3.05f,3.67f));

    }
}
*/





/*
//find prime by function
//for optimized find for i=2 to math.sqrt(a)
import java.util.*;
public class javabasics2{
    public static boolean prime(int a){
        if(a==2){
            return true;
        }
        boolean isprime = true;
        for(int i = 2 ; i<= a-1 ; i++){
            if(a % i ==0){
                return false ;
            }
        }
        return isprime ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

    System.out.println(prime(5));
    System.out.print(prime(4));


    }
}
*/







/*// range of prime numbers

import java.util.*;
public class javabasics2{
    public static boolean prime(int a){
        if(a==2){
            return true;
        }
        boolean isprime = true;
        for(int i = 2 ; i<= a-1 ; i++){
            if(a % i ==0){
                return false ;
            }
        }
        return isprime ;
    }
    public static void printprimes(int n){
        for(int i = 2 ; i<= n ; i++){
            if(prime(i)==true){
                System.out.println(i);
            }
        }

    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        printprimes(n);

    }
}
*/






/*
// Binary to decimal
public class javabasics2{

    public static void bintodec(int binnum){

        int mynum = binnum ;
        int pow = 0;
        int dec = 0;

        

        while (binnum > 0){
                int lastdigit = (binnum % 10);
                dec = dec + (lastdigit * (int)Math.pow(2,pow));
                
                pow++;
                binnum = binnum / 10;
        }
        System.out.println("deciamal of " + mynum + "= " + dec);
        

    }
    public static void main(String args[]){

        bintodec(111);


    }
}
*/







//decimal to binary.
/* 
public class javabasics2{
    public static void dectobin(int n){
        int mynum = n;
        int bin = 0;
        int pow = 0;
        while (n > 0){
            
            int rem = n % 2;
            
            bin = bin + (rem * (int)Math.pow(10 , pow));
            pow++;
            n = n/2 ;

        }
        
        System.out.println("the binary form of "+ mynum + " = " + bin);
    }
    public static void main(String args[]){

        dectobin(7);

    }
}
*/







































