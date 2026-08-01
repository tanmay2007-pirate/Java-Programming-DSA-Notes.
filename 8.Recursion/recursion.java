

// RECRSIONS.


// p1 :- print numbers from n to 0 in decreasing order.

// public class recursion {

//     public static void decreasingOrder(int n){

//         if(n <= 0 ){
//             return;
//         }
//         System.out.println(n);
//         decreasingOrder(n-1);
       
//     }
//     public static void main(String args[]){

        
//         decreasingOrder(10);
//     }
// }














// p2 - print numbers from increasing orde from 1 to n;

// public class recursion {

//     public static void increasingOrder(int n){

//         if(n == 1){
//             System.out.println(n);
//             return;
//         }
//         increasingOrder(n-1);

//         System.out.println(n);
//     }

//     public static void main(String args[]){

//         increasingOrder(10);

//     }
// }











// p3 :- find Factorial 


// public class recursion{

//     public static int  factorial(int n){

//         if( n == 1){
//             return 1;
//         }

//         return n * factorial(n-1);

//     }
//     public static void main(String args[]){

//         System.out.println(factorial(5));

//     }
// }










// p4 :- find sum of first n natural number.

// public class recursion{

//     public static int sumOfnatural(int n){

//         if( n == 1){
//             return 1 ;
//         }

//         return n + sumOfnatural(n-1);

//     }
//     public static void main(String args[]){


//         System.out.println(sumOfnatural(10));

//     }
// }












// p5 :- print n th fibonacci number.


// public class recursion{

//     public static int nth_fibonacci(int n){              //// n is natural number.

//         if(n == 1){
//             return 0;
//         }
//         if(n == 2){
//             return 1;
//         }

//         return nth_fibonacci(n-1) + nth_fibonacci(n-2);

//     }
//     public static void main(String args[]){

//         System.out.println(nth_fibonacci(0));

//     }
// }














// p6 : - check if array is sorted or not


// public class recursion{

//     public static boolean isSorted(int arr[] , int i){

//         // base case
//         if(i == arr.length-1){
//             return true;
//         }

//         // compare
//         if(arr[i] > arr[i+1]){
//             return false;
//         }

//         //recall
//         return isSorted(arr  , i+1);

//     }
//     public static void main(String args[]){

//         int arr[] = {4,5,6,1,2,7,8,9};

//         System.out.println(isSorted(arr , 0));
//     }
// }












// ps :- first Occurence.


// public class recursion{

//     public static int firstOccurance(int arr [] , int key , int i){


//         // base case
//         if( i == arr.length ){
//             return -1;
//         }

//         //compare
//         if(arr[i] == key){
//             return i;
//         }

//         // inner call.
//         return firstOccurance(arr,key,i+1);

//     }
//     public static void main(String args[]){

//         int arr [] = {8,3,6,9,5,10,2,5,45};

//         System.out.println(firstOccurance(arr ,45, 0));
//     }
// }













// ps :- Last Occurance of element.


// public class recursion {

//     public static int lastOccurance(int arr[] , int key , int i){

//         if(i == arr.length){
//             return -1;
//         }
//         int isfound = lastOccurance(arr , key , i+1);

//         if(isfound == -1 && arr[i] == key){
//             return i;
//         }


//         return isfound;
//     }
//     public static void main(String args[]){


//         int arr [] = {8,3,6,9,5,10,2,5,3};

//         System.out.println(lastOccurance(arr , 5 , 0));

//     }
// }















// ps :- print x to the power n


// public class recursion{

//     public static int power(int x , int n){
        
//         if(n == 0){
//             return 1;
//         }
        
//         int xnm1 = power( x , n-1);

//         int xn = x * xnm1;

//         return xn;
//     }
//     public static void main(String args[]){

//         System.out.println(power(2 , 10));

//     }
// }










// ps :- Optimal solution of x to the power n

// public class recursion {

//     public static int power(int a , int n){

//         if(n==0){
//             return 1;
//         }
//         int halfpow = power(a , n/2);
//         int halfpowersq = halfpow*halfpow;

//         //n is odd

//         if(n %2 != 0){
//             halfpowersq = a* halfpowersq;
//         }

//         return halfpowersq;
//     }
//     public static void main(String args[]){

//         System.out.println(power(2,5));

//     }
// }
















// Recursion part 2


// p11 :- Tiling problem .


// given  a "2 x n" floor and tiles of size "2 x 1 " , count the number of ways to tile the given board using the 2X1 tiles. (A tile can either be placed horizantally of vertically.)





// public class recursion{

//     public static int tilingproblem(int n){         // 2xn is board length

//         if(n == 0 || n == 1){
//             return 1;
//         }

//         //kaam
//         // vertical choice

//         int fnm1 = tilingproblem(n-1);

//         // horizantal choice

//         int fnm2 = tilingproblem(n-2);


//         //Total ways.
//         int totways = fnm1 + fnm2;

//         return totways;

//     } 
//     public static void main(String args[]){


//         System.out.println(tilingproblem(4));
//     }
// }
















// remove duplicates from the string



// public class recursion {

//     public static void remove_duplicates(String str , int idx ,StringBuilder newstring , boolean map[]){

//         if(idx == str.length()){
//             System.out.println(newstring);
//             return ;
//         }

//         // kaam 

//         char currchar = str.charAt(idx);

//         if(map[currchar - 'a'] == true){
//             //duplicates
//             remove_duplicates(str , idx+1 , newstring ,map);
//         }else{
//             map[currchar - 'a'] = true;
//             remove_duplicates(str , idx+1 , newstring.append(currchar) , map);
//         }

//     }
//     public static void main(String args[]){


//         String str = "appnnacollage";

//         remove_duplicates(str , 0 , new StringBuilder("") , new boolean[26]);


//     }
// }

















// friends pairing problem


// given n friends , each one can remain single or can be paired up with some other friend . each can be paired only once . find out the total number of ways in which friends can  remain single or can be paired up.


// public class recursion{

//     public static int friends_pairing(int n){

//         // base

//         if(n== 1 || n == 0){
//             return 1;
//         }
//         // choice
//         // single

//         int fnm1 = friends_pairing(n-1);



//         // pair

//         int fnm2 = friends_pairing(n-2);
//         int pairways = (n-1) * fnm2;

//         // totways 
//         int totways = fnm1 + pairways;
//         return totways;


//         //return friends_pairing(n-1) + (n-1)*friends_pairing(n-2);

//     }
//     public static void main(String args[]){

//         System.out.println(friends_pairing(3));


//     }
// }






















// Q). Binary Strings Problem.

// print all binary strings of size N without consecutive ones.



// public class recursion{

//     public static void printBinStrings(int n , int lastplace , String str){

//         // base case

//         if( n == 0){
//             System.out.println(str);
//             return;
//         }


//         //kaam

//         printBinStrings(n-1 , 0 , str + "0");

//         if(lastplace == 0){
//             printBinStrings(n-1 , 1 , str + "1");
//         }


//     }
    
//     public static void main(String args[]){


//         printBinStrings(3, 0 ,"");


//     }
// }


















