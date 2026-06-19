


/*
public class javaBasics {
    public static void main(String args[]){






    }
}
// Boilerplate code
*/



/*
public class javaBasics{
    public static void main (String args[]){


        System.out.print("hello guys\n");
        System.out.print("hello guys\n");


        System.out.println("hello guys");       // line ka space


        System.out.print("1 ,2 ,3, 4, 5.");

    }
}

*/




/*
public class javaBasics{
    public static void main (String args[]){

        System.out.println("*   *   *   *");
        System.out.println("*   *   *");
        System.out.println("*   *");
        System.out.println("*");

    }
}
*/




/*
public class javaBasics{
    public static void main (String args[]){

        int a = 10;
        int b = 20;

        System.out.println(a);
        System.out.println(b);
        String name = "Tony stark";
        System.out.println(name);


        a = b;
        System.out.println(a);

    }
}
*/




/* 
public class javaBasics{
    public static void main(String args[]){

        byte b = 8;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        boolean var = true;     // or false (only two)
        float price = 10.5f;
        int num  = 12;
        //long      (for big numbers.)
        //double    (for more precise float value or big value.)
        short n = 240;


        System.out.println(price);
    }
}
*/





/*
public class javaBasics{
    public static void main(String args[]){

        int a = 10;
        int b = 5;

        int sum = a + b;

        System.out.print(sum);


    }
}
*/






/* 
import java.util.*;
public class javaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        String input = sc.next();
        System.out.println(input);


        String name = sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);

        boolean var = sc.nextBoolean();
        System.out.println(var);

       short s = sc.nextShort();
       System.out.println(s);

       long no = sc.nextLong();
       System.out.println(no);

    }
}
*/








/*
import java.util.*;
public class javaBasics{
    public static void main(String args[]){
        Scanner sh = new Scanner (System.in);

        int a = sh.nextInt();
        int b = sh.nextInt();

        int sum = a + b;

        System.out.println(sum);
    }
}
*/






/*
import java.util.*;
public class javaBasics{
    public static void main(String args[]){
        Scanner sh = new Scanner (System.in);

        float a = sh.nextFloat();
        

        float area =  3.14f *a *a;      // java considers decimal values as double not float 
                                        // so we have to add a f after decimal value to make it float in java.

        System.out.println(area);
    }
}
*/





//type casting
/*
public class javaBasics{
    public static void main (String args[]){

       int a = 3;
       float b = 20.25f;
       long c = 456;
       double d = 80.56;
       int  ans = (int) (a+b+c+d);
       System.out.println(ans);


    }
}
*/

/*
public class javaBasics{
    public static void main ( String args[]){
        
        byte b = 5;
        byte a = (byte) (b* 2);

        System.out.println(a);


    }
}
*/





/* 
//arithmetic operators
public class javaBasics{
    public static void main ( String args[]){

        float a = 50.0f;
        float b = 100.0f;

        float add = a + b;
        float sub = a - b;
        float div =  (a/b);
        float mul = a * b;
        float rem = a % b;

        System.out.println("addition = " + add);
        System.out.println("subtraction = " + sub);
        System.out.println("Divison = " + div);
        System.out.println("multiplication = " + mul);
        System.out.println("remainder = " + rem);

    }
}
*/






/* 
// relational opt.
public class javaBasics{
    public static void main (String args[]){

        int a = 10;
        int b = 5;

        System.out.println(a == b);

        System.out.println(a!=b);

        System.out.println(a>=b);//  >

        System.out.println(a<=b);//  <

    }
}
*/




/*
import java.util.*;
public class javaBasics{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        int age = sc.nextInt();

        if (age > 18){
            System.out.println("adult : can dive,can vote.");
        }
        if(age>16 && age<18){
            System.out.println("teenager");
        }else{
            System.out.println("small fry");
        }

    }

}
*/





/*
public class javaBasics{
    public static void main(String args[]){

        int a = 5;
        int b = 3;

        if(a>b){
            System.out.println("a is geater than b"); System.out.println("dvsvjk");
         } else{
            System.out.println("b is greater than a");
         }
                // in java if single line without adding curly brackets is ok
            

    }
}
*/




/* 
import java.util.*;
public class javaBasics{
    public static void main(String args[]){
    
    Scanner sc = new Scanner (System.in);

    int income = sc.nextInt();

    int tax = 0;

    if(income < 500000){
        tax = 0;
      
    }else if(income >= 500000 && income <= 1000000){
        tax = (int)  (income * 0.05);
        
    }else{
        tax = (int) (income * 0.10);
        
    }
    
    System.out.println("your tax is " + tax);
    
    }
}
*/




/*
//ternary operator.
import java.util.*;
public class javaBasics{
    public static void main(String args[]){
    
    Scanner sc = new Scanner (System.in);

     int num =  3;

     // ternary operator
     String type = ((num % 2 ==0))? "even":"odd";

     System.out.println(type);

    }
}    
*/



// switch case.
/*
import java.util.*;
public class javaBasics{
    public static void main(String args[]){
    
    Scanner sc = new Scanner (System.in);

    int choice = 2;

    switch (choice){
        case 1: System.out.println("samosa");
                    break;

        case 2: System.out.println("mango");
                    break;

        case 3: System.out.println("shake");
                    break;

        default : System.out.println("sapana dekhna acchi baat hai.");

    }

    }

}
*/




/*
// Calculator.
import java.util.*;
public class javaBasics{
    public static void main(String args[]){
    
    Scanner sc = new Scanner (System.in);


    System.out.println("Enter first number : ");
    int a = sc.nextInt();


    char operator = sc.next().charAt(0);

    
    System.out.println("Enter the second number :");
    int b = sc.nextInt();

    

    switch(operator){
        case '+' : System.out.println("Addition of these two numbers is : " + (a+b));
                    break;
        case '-' : System.out.println("Subtraction of these two numbers is : " + (a-b));
                    break;
        case '*' : System.out.println("Multiplication of these two numbers is :" + (a*b));
                    break;
        case '/' : System.out.println("Divison of these two numbers is : "+ (a/b));
                    break;
        case '%' : System.out.println("After divison remainder is : " + (a%b));
                    break;
        default  : System.out.println("Invalid operator entered.");
    }



    }
}
*/





/*
//while loop
import java.util.*;
public class javaBasics{
    public static void main(String args[]){
    
    Scanner sc = new Scanner (System.in);

    int n = 0;
     while(n<10){
        System.out.println("Hello guys");
        System.out.println(n+1);
        n++;

     }

    }
}
*/





/* 
//reverse of a number.
import java.util.*;
public class javaBasics{
    public static void main(String args[]){
    
    Scanner sc = new Scanner (System.in);


        System.out.print("Enter the number : ");
        
        int n = sc.nextInt();
        
        while (n > 0){
            int lastdigit = n % 10;

            System.out.print(lastdigit);

            n /= 10;
        }

    }
}
 */




/*
import java.util.*;
public class javaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();


        boolean isprime = true;
        for (int i= 2 ; i <=Math.sqrt(n) ; i++){        //we can use i=2 to i = n-1 ,but for square root we wrote "Math.sqrt(n)".
            if(n%i==0){
                isprime = false;
            }

        }
        
            if ( isprime == true){
                System.out.println("number is prime");
            }else{
                System.out.println("number is not prime");
            }


    }
}
*/




// patterns. ( I ).


/* 
import java.util.*;
public class javaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        /* 
        for (int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }*/
        
        /* 
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= (n-i+1) ; j++ ){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        */


       /* 
       for (int i = 1 ; i <= n ; i++){
        for (int j = 1 ; j <= i ; j++){
            System.out.print(j);
        }
        System.out.print("\n");
       }*/
        

       /* 
       char ch = 'A';
       for (int i = 1 ; i <= n ; i++){
        for(int j = 1 ; j <= i ; j++){
            System.out.print(ch);
            ch++;
        }
        System.out.print("\n");
       }
        

    }
} */
            


// after learning functions come back for 
// ADVANCED Patterns ( II ).

//1).HOLLOW RECTANGLE
/*
public class javaBasics{
    public static void hollowrect(int rows , int columns){
        for (int i = 1 ; i <= rows ; i++){
            for (int j = 1 ; j <= columns ; j++ ){
                if( i == 1 || j == 1 || i == rows || j == columns ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){


        hollowrect(5,7);

    }
}
*/




//2).INVERTED & ROTATED PYRAMID.

/* 
public class javaBasics{

    public static void invpyamid(int n){
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n - i ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        
        invpyamid(10);
        

    }
}
*/




// 3).INVERTED ROTATED PYRAMID WITH NUMBERS.
/* 
public class javaBasics{
    public static void main(String args[]){


        for (int i = 1 ; i <= 5 ; i++){
            for (int j = 1 ; j <= 5-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
*/




//4). fLOYDS TRIANGLE PATTERN.
/* 
public class javaBasics{
    public static void main(String args[]){
 
        int counter = 1;
        for (int i = 1 ; i <= 5 ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

    }
}
*/





// 5).0-1 TRIANGLE
/* 
public class javaBasics{
    public static void main(String args[]){
        
        for (int i =1 ; i <= 5 ; i++){
            for (int j = 1 ; j<= i ; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }

    }
}
*/



//BUTTERFLY PATTERN.
 
public class javaBasics{
    public static void butterfly(int n){
         // 1st half
        for ( int i =1 ; i <= n ; i++){
            for( int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1  ; j <= 2*(n-i); j++){
                System.out.print(" ");

            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        // 2nd half
        for ( int i =n ; i >= 1 ; i--){
            for( int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1  ; j <= 2*(n-i); j++){
                System.out.print(" ");

            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){


        butterfly(4);

    }
}





//SOLID RHOMBUS.
/* 
public class javaBasics{
    public static void solidrhombus(int n ){
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){

        solidrhombus(5);

    }
}
*/




// HOLLOW RHOMBUS
/* 
public class javaBasics{

    public static void hollowrhombus(int n){
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= n ; j++){
                if(i == 1 || i == n || j == 1 || j == n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    
    public static void main(String args []){

        hollowrhombus(5);

    }
}
*/


//DIAMOND PATTERN.
/* 
public class javaBasics{
    public static void diamond (int n){
        // first half
        for (int i = 1; i <= n ; i++){
            for (int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= ((2*i)-1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        for (int i = n; i >= 1 ; i--){
            for (int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= ((2*i)-1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args []){

        diamond(10);

    }
}
*/










