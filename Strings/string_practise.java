
// Strings are immutable in java.



// import java.util.*;
// public class string_practise{
//     public static void main(String args[]){



//         // Declaration 
//         char arr[] = {'a','b','c','d'};

//         String str = "abcd";

//         String str2 = new String("abcd");

//         // Strings are immutable

//         Scanner sc = new Scanner(System.in);


//         // how to take Input.

//         String name;

//         name = sc.nextLine();       // for only one word only sc.next();

//         System.out.print(name);


//     }
// }















// length of string.


// public class string_practise{
//     public static void main(String args[]){

//         String full_name = "tony stark";

//         System.out.print(full_name.length());
       
//     }
// }






// concatenation

// public class string_practise{
//     public static void main(String args[]){

//         String firstname = "Tanmay";

//         String lastname = "Patharkar";

//         String fullname = firstname +" "+ lastname ;
        
//         System.out.println(fullname + "is this");
       
//     }
// }










//for accessing character at index.
// use .charAt();

// public class string_practise{

//     public static void printletters(String str){

//         for(int i = 0 ; i < str.length() ; i++){
//             System.out.print(str.charAt(i)+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){

//         String fullname = "Tanmay Patharkar";

//         System.out.print(fullname.charAt(0));
        
//         System.out.println();


//         printletters(fullname);
       
       
//     }
// }
















//  chaeck if a String is a Pallandrome.


// public class string_practise{

//     public static void check_pallandrome(String str){

//         boolean is_pallandrome = true;

//         int n = str.length();

//         for(int i = 0 ; i < str.length()/2 ; i++){
//             if(str.charAt(i) != str.charAt(n-i-1)){
//                 is_pallandrome = false;
//             }
//         }
//         System.out.print(is_pallandrome);
//     }
//     public static void main(String args[]){

//         String str = "racecar";
//         check_pallandrome(str);
       
//     }
// }















// question 2 :- given route containing 4 directions (E,W,S,N) find the shortest path to reach the destination.ffbn       



// public class string_practise{

//     public static float shortest_path(String path){

//         int x = 0 , y = 0;

//         for (int i = 0 ; i < path.length() ; i++){
//             char dir = path.charAt(i);

//             if( dir == 'S'){
//                 y--;
//             }else if(dir == 'N' ){
//                 y++;
//             }else if(dir == 'E'){
//                 x++;
//             }else{
//                 x--;
//             }

//         }

//         int X2 = (x*x);
//         int Y2  = (y*y);

//         return (float)Math.sqrt(X2 + Y2);


//     }

    
//     public static void main(String args[]){

//         String path = "WNEENESENNN";
        
//         System.out.print(shortest_path(path));
       
       
//     }
// }












// String COMPARISON 

// public class string_practise{
//     public static void main(String args[]){


//         String s1 = "Tony";

//         String s2 = "Tony";

//         String s3 = new String("Tony");


//         if(s1 == s2){
//             System.out.println("Strings are equal");
//         }else{
//             System.out.println("Strings are not equal");

//         }

//         if(s1.equals(s3)){
//             System.out.println("Strings are equal");
//         }else{
//             System.out.println("Strings are not equal");
//         }


//     }
// }















// String Substring.

// public class string_practise{

//     public static String substring(String str , int si , int ei){

//         String substr = "";

//         for(int i= 0 ; i< ei ; i++){
//             substr += str.charAt(i);
//         }
//         return substr;

//     }
//     public static void main(String args[]){

//         String str = "Hello World";


//         System.out.println(substring(str , 0 , 5));

//     }
// }
















//question 3 :- Find largestt String in LEXICOGRAPHIC ORDER.



// public class string_practise{
//     public static void main(String args[]){

//         String fruits[] = {"apple" , "mango" , "banana"};

//         String largest = fruits[0];

//         for(int i = 1 ; i < fruits.length ; i++){
//             if(largest.compareTo(fruits[i]) < 0){
//                 largest = fruits[i];
//             }
//         }
       
//         System.out.println(largest);


//     }
// }













// for ignoring case.


// public class string_practise{
//     public static void main(String args[]){


//        String s1 = "TAnmay";

//        String s2 = "tanmay";

//        System.out.print(s1.compareToIgnoreCase(s2));

//     }
// }

















// String Builder 

// public class string_practise{
//     public static void main(String args[]){

//         StringBuilder sb = new StringBuilder("");

//         for(char ch ='a' ; ch <= 'z' ; ch++){
//             sb.append(ch);
//         }
//                                                                     // O(26)
//                                                                     // if we didn,t used String builder it will be O(26*n);

//         System.out.println(sb);
//     }
// }












// Question 4 : - Converting each first letter of each word to Upper case.


// public class string_practise{

//     public static String touppercase(String str){

//         StringBuilder sb = new StringBuilder("");

//         char ch = Character.toUpperCase(str.charAt(0));

//         sb.append(ch);

//         for(int i= 1 ; i < str.length() ; i++){
//             if(str.charAt(i) == ' ' && i < str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));

//             }else{
//                 sb.append(str.charAt(i));
//             }
//         }

//         return sb.toString();
//     }
//     public static void main(String args[]){

//         String str = "hi i am tanmay";


//         System.out.print(touppercase(str));
       


//     }
// }
















// String COmpression.

// yaha pe string  use ki kujhe string builder se karna hai

// public class string_practise{

//     public static String compression(String str){

//         String newstr ="";

//         //aaabbcccdd

//         for(int i = 0 ; i < str.length() ; i++){        // O(n).
//             Integer count = 1;

//             while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                 count ++;
//                 i++;
//             }
//             newstr += str.charAt(i);

//             if(count > 1){
//                 newstr += count.toString();
//             }
//         }


//         return newstr;
//     }
//     public static void main(String args[]){

//         String str = "aaabbcccdd";
       
//         System.out.println(compression(str));


//     }
// }





































