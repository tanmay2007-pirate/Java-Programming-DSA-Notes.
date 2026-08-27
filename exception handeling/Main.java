
// Learning Exception Handeling.



// public class Main {
//     public static void main(String args[]){

//         try{
//             int a = 10;

//             int b = 0;

//             System.out.println(a/b);
//         }
//         catch(Exception e  /*can also use (e.getMessage() for printing) */){
//             System.out.println("Hello world");
//             // System.out.println(e);
//             // System.out.println(e.getMessage());
//             // e.printStackTrace();
//         }

//     }
// }











// multiple catch blocks

// public class Main{
//     public static void main(String args[]){

//         try{
//             int [] arr = {10,20,30};

//             System.out.println(arr[5]);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Arithmetic error");
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Array index is invalid");
//         }
//     }
// }








// Note : - finally is used for code that should execute whether an exception happens or not.






// using finally keyword.

// public class Main{
//     public static void main(String args[]){

//         try{
//             int [] arr = {10,20,30};

//             System.out.println(arr[5]);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Arithmetic error");
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Array index is invalid");
//         }

//         finally{
//             System.out.println("Mar jaao Saalo");
//         }
//     }
// }








// throw is used for creating custom exceptions


// public class Main{
//     public static void main(String args[]){

//         int age = 15;

//         if(age <18){
//             throw new ArithmeticException("padhai kar saale");
//         }

//         System.out.println("you can vote");

//     }
// }








// throws is different.
// throws basically tells the caller:

// "This method may produce this exception."

// throw
// Actually throws an exception.


// throws
// Declares that a method can throw an exception.







// public class Main {

//     static void test() throws Exception {
//         System.out.println("Something may go wrong");
//     }

//     public static void main(String[] args) throws Exception {
//         test();
//     }
// }










// there two types of exception :- 1. Checked Exception  , 2. unchecked Exception.
// Checked exception
// Compiler forces you to handle or declare it.
// 1).IOException
// 2).SQLException
// 3).FileNotFoundException





// import java.io.FileNotFoundException;
// import java.io.FileReader;

// public class Main {
//     public static void main(String[] args) {

//         try {
//             FileReader file = new FileReader("abc.txt");
//         }
//         catch (FileNotFoundException e) {
//             System.out.println("File not found");
//         }
//     }
// }








// Unchecked exception

// Usually occurs because of programming/runtime errors.

// ArithmeticException
// NullPointerException
// ArrayIndexOutOfBoundsException
// NumberFormatException





// Custom Exception 
// we can create our own Exception.



// class AgeException extends Exception{
//     AgeException (String message){
//         super(message);
//     }
// }

// public class Main{

//     public static void checkAge(int age) throws AgeException{

//         if(age < 18){
//             throw new AgeException("Bole to Khaane ka Khujaane ka , Aur So jaane ka !!");
//         }

//         System.out.println("Eligible");
//     } 
//     public static void main(String args[]){

//         try{
//             checkAge(15);
//         }catch(AgeException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }








