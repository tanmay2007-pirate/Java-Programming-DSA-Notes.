

//ARRAYS (I).

/* 
public class Arrays {
    public static void main(String args[]){

       //creation 

        int marks [] = new int[10];

        int off [] = {1,2,3,4,5};

        String fruits[]= {"apple","mango","banana"};

    }
}
*/









/*
import java.util.*;
public class Arrays{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

        int marks [] = new int [50];

        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);


        marks [2] = 100;

        marks[1] = marks[1] + 1;

        int percentage = (marks[0] + marks[1] +marks[2])/3;



        System.out.println(marks[2]);

        System.out.println(percentage);

        System.out.println("Length of Array is:"+ marks.length);

    }
}
    */








// import java.util.*;
// public class Arrays{

//     public static void update(int marks [] , int nonchangable){

//         nonchangable  = 10 ;

//         for (int i = 0 ; i < marks.length ; i++){

//             if (marks[i] % 2 == 0 ){
//                 marks[i]= 0 ;
//             }
//         }

//     }


//     public static void main(String args[]){

//         Scanner sc = new Scanner (System.in);

//         int marks []= { 20 ,56 ,87};
        
//         int nonchangable = 5 ;

//         update(marks , nonchangable);


//         System.out.println(nonchangable);


//         //print our marks
//         for (int i = 0 ; i < marks.length ; i++){
//             System.out.print(marks[i]+" ");
//         }
//         System.out.println();


//     }
// }









// //Linear Search.
// import java.util.*;
// public class Arrays{

//     public static int find( int arr[] , int n){                         //same can  be done with string list 
                                                                            // (String arr[], String name)

        
//         for (int i = 0 ; i < arr.length ; i++){

//             if (arr[i] == n){
//                 return i;
//             }
            
//         }
//         return -1;
//     }

//     public static void main(String args[]){

//         Scanner sc = new Scanner (System.in);
     
//         int arr [] = {2,4,6,8,10,12,13,16};

//         int n = sc.nextInt();

//         System.out.println("Index of "+ n + " is " + find(arr,n));
    
//     }

// }









// //Largest number in Array.
// import java.util.*;
// public class Arrays{

//     public static int max( int arr []){

//         int largest = Integer.MIN_VALUE;                // -ve infinity.
//         int smallest = Integer.MAX_VALUE;               // +ve infinity.
//                                                         // smallest paahije tar jeva pan kontapan element motha hoil lahana update kara.
//         for (int i = 0 ; i < arr.length ; i++){         /*if (arr[i] < smallest){
//                                                                     smallest = arr[i];    
//                                                                         } */
//             if (arr[i] > largest){
//                 largest = arr[i];
//             }

//         }
//         return largest;
//     }

//     public static void main(String args[]){

//         Scanner sc = new Scanner (System.in);
    
//         int arr [] = {1,2,6,3,5};

//         System.out.println(max(arr));
    
//     }

// }











// //Binary Search.
// import java.util.*;
// public class Arrays{

//     public static int binarysearch(int arr [] , int key){
//         int start = 0;

//         int end = arr.length -1;

//         while(start <= end){
//             int mid = (int)(start + end )/2;

//             //comparisons

//             if (arr[mid] == key){
//                 return mid ;
//             }
//             if(arr[mid]>key){       //left
//                 end = mid-1;
//             }else {
//                 start = mid +1;     //right
//             }

//         }
//         return -1;

//     }

//     public static void main(String args[]){

//         Scanner sc = new Scanner (System.in);
    
//         //prerequisite - sorted array.
//         int key = sc.nextInt();

//         int arr [] = {2,4,6,8,9,10,12,14};

//         System.out.println(binarysearch(arr,key));
    
    
//     }

// }








// // reverse an array.
// import java.util.*;
// public class Arrays {

//     public static void printArray(int arr[]){
//         for (int i = 0 ; i < arr.length ; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void reverse(int arr[]){
//         int start = 0;
//         int end = arr.length-1 ;
        
//         while(start<end){
//             int t = arr[start];
//             arr[start]=arr[end];
//             arr[end] = t;
//             start++;
//             end--;
//         }
       
//     }
//     public static void main(String args[]){

//         Scanner sc = new Scanner (System.in);


//         int arr [] = {2,4,6,8,10};

//         reverse(arr);


//         printArray(arr);

//     }
// }








// //pairs in an Array.


// import java.util.*;
// public class Arrays {

//    public static void printpairs(int arr[] ){

//         for (int i = 0 ; i< arr.length ; i++){
//             int curr = arr[i];
//             for (int j = i+1 ; j< arr.length ; j++){
//                 System.out.print("(" + curr + "," + arr[j]+ ")");
//             }
//             System.out.println();
//         }

//    }

//     public static void main(String args[]){

//         Scanner sc = new Scanner (System.in);


//         int arr [] = {2,4,6,8,10};

//         printpairs(arr);

//     }
// }












// //sub Arrays.
// import java.util.*;
// public class Arrays_practise {

//     public static void subarray(int arr []){
//         int totalsubarrays = 0;
//         for (int i = 0 ; i < arr.length ; i++){
//             int start = i;
//             System.out.println(arr[i]);

//             for (int j = i+1 ; j < arr.length ; j++){
//                 int end = j;
//                 for (int k = start ; k <= end ; k++){
                    
//                     System.out.print(arr[k]+" ");           //subarrays.
                    
//                 }
//                 totalsubarrays++;
//                 System.out.println();
//             }
            
//         }
//         System.out.println(totalsubarrays+arr.length);
//     }

//     public static void main(String args[]){

//         Scanner sc = new Scanner (System.in);


//         int arr [] = {2,4,6,8,10};

//         subarray(arr);

//     }
// }









// //maximum and minimum sum of subarrays by me myself.(it was for sorted array.)

// import java.util.*;
// public class Arrays{

//     public static void printsubarrays(int arr[]){
//                 int sum  ;
                
//                 int largest = Integer.MIN_VALUE;
//                 int smallest = Integer.MAX_VALUE;

//         for (int i = 0 ; i < arr.length ; i++){
//             int curr = i ;
//             if (smallest > arr[i]){
//                 smallest = arr[i];
//             }
//             System.out.println(arr[i]);
//             for (int j = i+1 ; j < arr.length ; j++){
//                 int end = j;
//                 sum = 0;
//                 for (int k = curr ; k <= end ; k++ ){
//                     System.out.print(arr[k]);
//                     sum += arr[k];
                    
//                 }

//                 if (largest < sum){
//                     largest = sum ; 
//                 }
                

//                 System.out.println();
//             }
            
//         }
//         System.out.println("Smallest sum is :"+ smallest);
//         System.out.println("Largest sum is :"+ largest);    

//     }
//     public static void main(String args[]){

//         Scanner sc = new Scanner (System.in);

//         int arr[] = {2,4,6,8,10};

//         printsubarrays(arr);

//     }
// }













//maximum  sum of subarrays by apna collage.
// for any ordered array.
// PREFIX SUM.


// public class Arrays_practise {

//      public static void maxArray(int arr []){
//         int largest = Integer.MIN_VALUE;

//         int prefix[]= new int [arr.length];

//         //prefix array
//         prefix[0] = arr[0];
//         for (int i = 1 ; i < arr.length ; i++){
//             prefix[i] = prefix[i-1] + arr[i] ;
//         }
//         int sum ;

//         for (int i = 0 ; i < arr.length ; i++){
            
//             int start = i;
//             for(int j = i+1 ; j < arr.length ; j++ ){
//                 int end = j;

//                 sum = (start==0) ? prefix[end] : prefix[end]-prefix[start-1];

//                 if (largest < sum ){
//                     largest = sum;
//                 }

//             }
            
//         }

//         System.out.println("MAX SUM IS:" + largest);



//      }



//     public static void main(String args[]){

//         int arr []  = {1,-2,6,-1,3};

//         maxArray(arr);

//     }
// }









// // max subarray sum 

// // by KADANS ALGORITHM


// import java.util.*;
// public class Arrays_practise{

//     public static void print_maxsum_subarrays(int arr[]){

//         int ms = Integer.MIN_VALUE;
//         int cs = 0 ;

//         for (int i = 0 ; i < arr.length ; i++){

//             cs = cs + arr[i];
//             if (cs < 0){
//                 cs = 0;
//             }
//             ms = Math.max(cs,ms);
//         }

//         System.out.println("MAX SUM IS:" + ms);
                
//     }
//     public static void main(String args[]){

//         Scanner sc = new Scanner (System.in);

//         int arr[] = {-2,-3,4,-1,-2,1,5,-3};

//         print_maxsum_subarrays(arr);

//     }
// }










 







// buy and sell stocks 

// MAx PROFIT WE can get.


// public class Arrays_practise {

    
//     public static int  max_profit(int arr[]){

//         int buyprice = Integer.MAX_VALUE;
//         int maxprofit = 0;

//         for(int i = 0 ; i < arr.length ; i++){

//             if (buyprice < arr[i]){             //profit
//                 int profit = arr[i]- buyprice;  // today's profit
//                 maxprofit = Math.max( maxprofit, profit) ;  

//             }else {
//                 buyprice = arr[i];
//             }
//         }
        
//         return maxprofit;

//     }
//     public static void main(String args[]){


//         int arr [] = {7,1,5,3,6,4};

//         System.out.println(max_profit(arr));


//     }
// }













//TRAPPING RAINWATER

// public class Arrays_practise{

//     public static int rain_trap(int height []){

//         // calculate leftmax bouundry. - array
//         int n = height.length ; 

//         int leftmax[] = new int [n];

//         leftmax[0] = height[0];

//         for(int i = 1 ; i < n ; i++){
//             leftmax[i] = Math.max(height[i]  , leftmax[i -1]);
//         }

//         // calculate rightmax boundry - array

//         int rightmax[] = new int [n];
//         rightmax[n-1]= height[n-1];
//         for(int i = n-2 ; i >= 0 ; i-- ){
//             rightmax[i] = Math.max(height[i], rightmax[i+1]);
//         }

//         //loop
//         int trappedwater = 0; 

//         for(int i = 0 ; i < n ; i++ ){
//             //waterlevel = min(leftmax, rightmax)
//             int waterlevel = Math.min(leftmax[i] , rightmax[i]);
            

//             // trapped water = waterlevel - height[i]
//             trappedwater += waterlevel - height[i];
//         }


//         return trappedwater;

//     }

//     public static void main(String args[]){


//         int height [ ] = {4,2,0,6,3,2,5};


//         System.out.println(rain_trap(height));


//     }
// }











//return true if any value appears at least twice in the array, and return false if every element is distinct.


// public class Arrays {

//     public static boolean check_duplicates(int arr []){

         

//         for (int i = 0 ; i <arr.length ; i++){

//             int key = arr[i];
            
//             for(int j = i+1 ; j < arr.length ; j++){

//                 if((arr[j] == key)&&(i != j)){

//                     return  true;

//                 }

//             }
    
//         }

//         return false ;

//     }
//     public static void main(String args []){


//         int arr [] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        
//         System.out.println(check_duplicates(arr));

//     }
// }










//ps_02

//Searching the target index by binary search for an rotated array.about an index.


// import java.util.*;
// public class Arrays_practise{

//     public static int search( int arr [] , int key){

//         int left = 0;

//         int right = arr.length -1;
        

//         while (left <= right){

//             int mid = left + (int)(right-left)/2;

//             if(key == arr[mid]){
//                 return mid;
//             }
            

//             // for left sorted array
//            if (arr[left] <= arr[mid] ){

//             if(key < arr[mid] && key >= arr[left]){

//                 right = mid-1;

//             }else{
//                 left = mid+1;
//             }

//             // for right sorted array

//            }else{

//             if(key > arr[mid] && key <= arr[right]){

//                 left = mid +1;
//             }else{
//                 right = mid -1 ;
//             }

//            }
            

//         }

//         return -1;

//     }



//     public static void main(String args[]){
    
//         Scanner sc = new Scanner (System.in);

//         int arr [] = {4,5,6,7,0,1,2};

//         int key = sc.nextInt();

//         System.out.println(search(arr , key));
    

//     }
// }
















// 2D ARRAYS.       2D ARRAYS       2D ARRAYS       2D ARRAYS       2D ARRAYS       2D ARRAYS       2D ARRAYS       2D ARRAYS       2D ARRAYS




// //SEARCH IN 2D ARRAY.
// import java.util.*;
// public class Arrays_practise{

//     public static boolean search(int  matrix[][] , int key){
        
//         for(int i = 0 ; i < matrix.length ; i++){
//             for(int j = 0 ; j < matrix[0].length ; j++){

//                 if(key == matrix[i][j]){
//                     System.out.print("found at cell (" + i +"," +j +")" );
//                     return true;
//                 }
//             }
//         }
//         System.out.println("Key not found");
//         return false;
//     }

//     public static void main(String args[]){

//         int matrix [] [] = new int [3][3];

//         int n = matrix.length , m = matrix[0].length;
//         //int n = 3 , m =3 ;

//         Scanner sc = new Scanner (System.in);
        
//         for(int i = 0 ; i< n ; i++){
//             for(int j = 0 ; j <m; j++){

//                 matrix[i][j] = sc.nextInt();
//             }
//         }
        
//         search(matrix,7);

        
        
//         System.out.println();
        
        
//         //output
//         for(int i = 0 ; i < n ; i++){
//             for(int j = 0 ; j < m ; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }


//     }

// }













// SPIRAL 2D array.


// public class Arrays_practise{

//     public static void printspiral(int matrix[][]){

//         int startrow = 0;
//         int startcol = 0 ;
//         int endrow = matrix.length -1;
//         int endcol = matrix[0].length - 1 ;

//         while (startrow <= endrow && startcol <= endcol){

//             //top
//             for(int j = startcol ; j <= endcol ; j++){
//                 System.out.print(matrix[startrow][j] + " ");
//             }

//             //right
            
//             for(int i = startrow+1 ; i <= endrow ; i++ ){
//                 System.out.print(matrix[i][endcol] + " ");

//             }

//             //bottom
//             for(int j = endcol -1 ; j >= startcol ; j--){

//                 if(startcol == endcol){
//                     break;
//                 }
//                 System.out.print(matrix[endrow][j]+" ");
//             }

//             //left
//             for(int i = endrow-1 ; i >= startrow+1 ; i--){
//                 System.out.print(matrix[i][startcol]+" ");
//             }

//             startcol++;
//             startrow++;
//             endcol--;
//             endrow--;

//         }


//     }

//     public static void main(String args[]){

//         int matrix[][]={{1,2,3,4},
//                         {5,6,7,8},
//                         {9,10,11,12},
//                         {13,14,15,16}};


//         printspiral( matrix);


//     }
// }

















// DIAGONAL SUM
//diagonal always for n = m in (nXn)



// public class Arrays_practise{

//     public static void diagonalsum(int matrix[][]){

//         int sum =0 ;

//         //BRUTE FORCE.

//         // for(int i = 0 ; i < matrix.length ; i++){
//         //     for(int j = 0 ; j < matrix[0].length ; j++){
//         //         if(i == j){
//         //             sum += matrix[i][j];
//         //         }
//         //         else if((i + j == matrix.length -1)){

//         //             sum += matrix[i][j]; 

//         //         }
//         //     }
//         // }

//         // System.out.print("SUM OS DIAGONALS BY BRUTE FORCE IS "+ sum);


//         for(int i = 0 ; i < matrix.length ; i++){
//             //pd
//             sum += matrix[i][i];

//             //sd
//             if(i != matrix.length - 1 - i){
//                 sum += matrix[i][matrix.length-1-i];
//             }
//         }


//         System.out.print("SUM OF DIAGONALS BY OPTIMAL APPROACH : " + sum);



//     }

//     public static void main(String args[]){


//         int matrix[][] ={{1,2,3,4},
//                         {5,6,7,8},
//                         {9,10,11,12},
//                         {13,14,15,16}};

//         diagonalsum(matrix);

//     }
// }














// //SEARCH IN SORTED MATRIX.
// //STAIRCASE SEARCH.
// import java.util.*;
// public class Arrays_practise{

//     public static boolean staircase_search(int matrix [][] , int key ){

//         int row = 0 ;
//         int col = matrix[0].length - 1 ;

//         while(row < matrix.length && col >= 0){

//             if(matrix[row][col] == key){
//                 System.out.println("found at (" + row + "," +col+")");
//                 return true;
//             }
//             else if(key < matrix[row][col]){
//                 col--;
//             }
//             else{
//                 row++;
//             }
//         }
//         System.out.println("Key not Found");

//         return false;

//     }

//     public static void main(String args[]){

//         Scanner sc = new Scanner (System.in);

//         int matrix [][] = {{10,20,30,40},
//                             {15,25,35,45},
//                             {27,29,37,48},
//                             {32,33,39,50}};


//         int key = sc.nextInt();


//         staircase_search(matrix,key);


//     }

// }












// 2D Array madhe largest and smallest no la print karaychay
//staircase search madhe aapan top-right use kela aata bottom left cha use karayacha.