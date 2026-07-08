
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
















// DIVIDE AND CONQUOR.

//  MERGE SORT.



// public class Sorting_algo{

//     public static void print_arr(int arr []){
//         for(int i = 0 ; i <  arr.length ; i++){
//             System.out.print(arr[i] +" ");
//         }
//         System.out.println();

//     }

//     public static void merge(int arr[] , int si , int mid , int ei){

//         int temp[] = new int [ei - si +1];

//         int i = si; // iterator for left part

//         int j = mid + 1; // iteratir for right part

//         int k = 0;  // iterator for temp arr


//         while( i <= mid && j <= ei){

//             if(arr[i] < arr[j]){
//                 temp[k] = arr[i];
//                 i++;
                
//             }else{
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }


//         // left part , for leftover elements.
//         while( i <= mid){
//             temp[k++] = arr[i++];
//         }

//         // right part 

//         while( j <= ei){
//             temp[k++] = arr[j++];
//         }


//         // copy temp to original arr

//         for( k = 0 ,i = si ; k < temp.length ; i++ , k++){

//             arr[i] = temp [k];
//         }


//     }
//     public static void merge_sort(int arr [] , int si , int ei){

//         if(si >= ei){
//             return;
//         }

//         // kaam 

//         int mid = si + (ei -si) / 2;

//         merge_sort(arr , si , mid); // left part

//         merge_sort(arr , mid+1 , ei); // right part

//         merge(arr , si , mid , ei);



//     }
//     public static void main(String args[]){

//         int arr [] = {6,3,9,5,2,8};

//         merge_sort(arr , 0 ,arr.length -1);

//         print_arr(arr);
//     }
// }




















// QUICK SORT.


public class Sorting_algo{


    public static void quick_sort(int arr [] , int si , int ei){



        if(si >= ei){
            return;
        }
        // last element
        int pidx = partition(arr ,si ,ei);
        
        quick_sort(arr , si , pidx -1 ); // left
        quick_sort(arr , pidx +1 , ei); // right


    }

    public static int partition(int arr[] , int si , int ei){

        int pivot = arr[ei];

        int i = si - 1 ;        //to make place for else smaller than pivot.

        for(int j = si ; j < ei ; j++){
            if(arr[j] <= pivot){
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp ;

            }
        }
        
        i++;
        int temp = pivot ;
        arr[ei] = arr[i];
        arr[i] = temp ;

        return i;


    }
    public static void main (String args[]){

        int arr[] = {6,3,9,8,2,5};

        quick_sort(arr , 0 , arr.length - 1);
        for (int i = 0 ; i < arr.length  ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
