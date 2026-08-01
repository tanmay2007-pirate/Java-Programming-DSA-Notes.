

// Odd or even by bit manupulation.

// import java.util.*;
// public class bit_manupulations {

//     public static void oddoreven (int n){

//         int bitmask = 1;

//         if( (n & bitmask) == 0){
//             System.out.print("even");
//         }else{
//             System.out.print("Odd");
//         }
//     }
    

//     public static void main(String args[]){

//         Scanner sc = new Scanner (System.in);

//         int n = sc.nextInt();

//         oddoreven(n);


//     }
// }





//get i th bit

// public class bit_manupulations{

//     public static void get_ith_bit(int n , int i){

//         int bitmask = 1 << i;

//         if((n & bitmask) == 0){
//             System.out.print("0");
//         }else{
//             System.out.print("1");
//         }
//     }
//     public static void main(String args[]){


//         get_ith_bit(10 , 2);


//     }
// }










//set i th  bit

// public class bit_manupulations{

//     public static void set_ith_bit(int n , int i){

//         int bit_mask = 1<<i;

//         System.out.print(n|bit_mask);
        
//     }
//     public static void main(String args[]){


//         set_ith_bit(10 , 2);


//     }
// }













//clear i th bit

// public class bit_manupulations{

//     public static void clear_ith_bit(int n , int i){

//         int bitmask = ~(1<<i);

//         System.out.print(n & bitmask);

//     }
//     public static void main(String args[]){


//         clear_ith_bit(10 , 1);


//     }
// }












// Clear last i bits.

// public class bit_manupulations{

//     public static void clear_last_i_bits(int n , int i){

//         int bitmask = ~0 << i;

//         System.out.print(n & bitmask);
        
        
//     }
//     public static void main(String args[]){


//         clear_last_i_bits(15, 2);

//     }
// }















// update i th bit.


// public class bit_manupulations{

//     public static void set_ith_bit(int n , int i){

//         int bit_mask = 1<<i;

//         System.out.print(n|bit_mask);
        
//     }
//     public static void clear_ith_bit(int n , int i){

//         int bitmask = ~(1<<i);

//         System.out.print(n & bitmask);

//     }
    
//     public static void  update(int n , int i , int newbit){

//         // if(newbit == 0 ){
//         //      clear_ith_bit(n , i);
//         // }else{
//         //     set_ith_bit(n , i);
//         // }
        


//         // // more detailed 

//         // clear_ith_bit(n , i);
//         // int bitmask = newbit << i;
//         // return n | bitmask;
        
//     }
//     public static void main(String args[]){

//         update(10 , 2 , 0);
       
//     }
// }
















// Check if a number is power of 2 or not.

// import java.util.*;
// public class bit_manupulations{

//     public static void power_of_2(int n){

//         if((n & (n-1)) == 0){
//             System.out.print("true");
//         }else{
//             System.out.print("false");
//         }
//     }
    
//     public static void main(String args []){

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         power_of_2(n);

//     }
// }














// Clear range of bits.

// import java.util.*;
// public class bit_manupulations{

//     public static void clear_range(int n , int i , int j){

//         int a = (~0) << (j+1);
//         int b = (1<<i) - 1;

//         int bitmask = a|b;

//         System.out.print(n & bitmask);
//     }

    
    
//     public static void main(String args []){

//         Scanner sc = new Scanner(System.in);

//         clear_range(10 , 2 , 4);

        
//     }
// }
















// Count set bits in a number.


// import java.util.*;
// public class bit_manupulations{

//     public static void count_sets(int n ){

//         int count = 0 ; 
        
//         while(n > 0 ){
//             if((n & 1) != 0){
//                 count++;
//             }
//             n=  n >> 1;
//         }
//         System.out.print(count);
//     }

    
    
//     public static void main(String args []){

//         Scanner sc = new Scanner(System.in);

//         count_sets(10 );

        
//     }
// }

















// Fast Exponention

// import java.util.*;
// public class bit_manupulations{

//     public static int fastexpo(int a , int n){

//         int ans = 1;

//         while(n > 0){
//             if((n&1) != 0){
//                 ans = ans *a;
//             }
//             a = a*a;
//             n = n>>1;
//         }
//         return ans;
//     }
    
    
//     public static void main(String args []){

//         Scanner sc = new Scanner(System.in);

        
//         System.out.print(fastexpo(3 , 5));
        
//     }
// }
















// Modular Exponention.
// suppose no is     3^13 % 7

// public class bit_manupulations{

//     public static long modexp(int  a , int n , int m){

//         int ans = 1 ;
//         while(n > 0){
//             if((n & 1) != 0){
//                 ans = (a * ans ) % m;

//             }
//             a = (a * a)% m;
//             n =n >> 1 ;
//         }

//         return ans;

//     }
//     public static void main(String args[]){

//         System.out.print(modexp(3,13,7));



//     }
// }