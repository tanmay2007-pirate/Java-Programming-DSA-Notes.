
// BASIC SORTING ALGORITHMS.(BUBBLE, SELECTION, INSERTION, COUNTING, IN-BUILT)

//BUBBLE SORT

// public class Sorting_algo {

//     public static void bubblesort(int arr []){

//         for (int turn = 0 ; turn < arr.length -1 ; turn++){

//                 boolean swap = false ;


//             for (int j = 0 ; j < arr.length -1 -turn ; j++){

//                 if(arr[j] > arr[j+1]){
//                     int t = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = t;
//                 }

//                 swap = true;
                
//             }

//             if( !swap){
//                     break;
//                 }
//         } 
//         for (int i =0 ; i < arr.length ; i++){
//             System.out.print(arr[i]+" ");
//         }

//     }
//     public static void main(String args[]){

//         int arr [] = {6,8,9,3,4,1};

        
//         bubblesort(arr);

//     }
    
// }













// SELECTION SORT .


// public class Sorting_algo{

//     public static void selection_sort(int arr []){

//         for(int i = 0 ; i < arr.length - 1 ; i++ ){
//             int minpos = i ;
//             for(int  j= i+1 ; j< arr.length  ; j++){

//                 if(arr[minpos] > arr[j]){
//                     minpos = j;
//                 }
//             }

//             //swap
//             int t = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i]=t;
//         }


//         for(int i = 0 ; i< arr.length ; i++){
//             System.out.print(arr[i] + " ");
//         }


//     }
//     public static void main(String args[]){

//         int arr [] = {6,5,8,9,1,3,2,4};

//         selection_sort(arr);

//     }
// }













// // INSERTION SORT

// public class Sorting_algo{

//     public static void Insertion_sort(int arr[]){

//         for(int i = 1 ; i <arr.length  ; i++){

//             int curr = arr[i];
//             int prev = i - 1;

//             while(prev >= 0 && arr[prev] > curr){
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             //insertion
//             arr[prev+1] = curr;
//         }


//         //print
//         for (int i = 0 ; i < arr.length ; i++ ){
//             System.out.print(arr[i]+" ");
//         }

//     }
//     public static void main(String args[]){


//         int arr [ ] = {5,4,1,3,2};

//         Insertion_sort(arr);



//     }
// }














//INBUILT SORTING ALGORITHMS.
// import java.util.*;                 // instead of star we can write Arrays , * imports everything.
// public class Sorting_algo{
//     public static void main(String args[]){

//         int arr [] =  {1,2,6,8,9,3,1,2};

//         Integer bhai [] = {7,5,2,9,1,3};

//         Arrays.sort(arr);

//         for(int i = 0 ; i < arr.length ; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//         Arrays.sort(arr , 0 , 5);

//         for(int i = 0 ; i < arr.length ; i++){
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println();

//         Arrays.sort(bhai , 0, 3, Collections.reverseOrder() );

//         for(int i = 0 ; i < bhai.length ; i++){
//             System.out.print(bhai[i] + " ");
//         }


//     }
// }













//COUNTING SORT             //used where numbers are not that big.

// public class Sorting_algo{

//     public static void counting_sort(int arr[]){

//         int largest = Integer.MIN_VALUE ;

//         for(int i = 0 ; i < arr.length ; i++){
//             largest = Math.max(largest,arr[i]);
//         }


//         int count[] = new int[largest+1];
//         for(int i = 0; i <arr.length ;i++){
//             count[arr[i]]++;
//         }

//         //sorting
//         int j = 0; 
//         for(int i = 0 ; i < count.length ; i++){
//             while(count [i] > 0 ){
//                 arr[j] = i ;
//                 j++;
//                 count[i]--;
//             }
//         }


//         //print 
//         for(int i = 0 ;i <arr.length ; i++){

//             System.out.print(arr[i]+" ");
//         }


//     }
//     public static void main(String args[]){

//         int arr[] = {1,4,1,3,2,4,3,7};

//         counting_sort(arr);
//     }
// }

















