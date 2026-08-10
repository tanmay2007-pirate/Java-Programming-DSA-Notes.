
//         // String , Boolean, Float (classes)

//         ArrayList<Integer> list = new ArrayList<>();

//         ArrayList<String>  list2 = new ArrayList<>();

//         ArrayList<Boolean> list3 = new ArrayList<>();



//         // Adding an Element

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         list.add(1,9);      //O(n)

//         System.out.println(list);

//         // Getting an Element

//         int element = list.get(2);
//         System.out.println(element);


//         // removing an element

//         list.remove(2);
//         System.out.println(list);

//         // setting an element at index

//         list.set(2,10);
//         System.out.println(list);

//         // contains Element

//         System.out.println(list.contains(1));
//         System.out.println(list.contains(11));
        
        
        
//         //for accessing element
//         //list.get()

//         // Size of ArrayList
//         System.out.println(list.size());

//         for(int i= 0; i < list.size() ; i++){
//             System.out.print(list.get(i)+" ");
//         }
//         System.out.println();
//     }
       
// }











// reverse an ArrayList 

// public class Main{
//     public static void main(String args[]){

//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         // T.c = O(n)
//         for(int i = list.size() - 1 ; i >= 0 ; i--){
//             System.out.print(list.get(i) +" ");
//         } 



//     }
// }












// Max Number.
// import java.util.ArrayList;

// public class Main{
//     public static void main(String args[]){

//         ArrayList<Integer> list = new ArrayList<>();

//             list.add(1);
//             list.add(2);
//             list.add(3);
//             list.add(4);
//             list.add(5);
        
//         int max = Integer.MIN_VALUE;

//         for(int i = 0 ; i < list.size() ; i++){
//             // if(list.get(i)> max){
//             //     max = list.get(i);
//             // }

//             max = Math.max(max , list.get(i));
//         }
//         System.out.println(max);

//     }
// }

















// // Swap 2 NUmbers.
// import java.util.ArrayList;
// public class Main{

//     public static void swap(ArrayList<Integer> list , int idx1 ,int idx2){

//         int temp = list.get(idx1);

//         list.set(idx1, list.get(idx2));

//         list.set(idx2 , temp);

//     }
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         int idx1 = 1 , idx2 = 3;
//         swap(list , idx1 , idx2);
//         System.out.println(list);

//     }
// }












// Sorting Inbuilt.

// import java.util.ArrayList;
// import java.util.Collections;
// public class Main{
//     public static void main(String args[]){

//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(5);
//         list.add(2);
//         list.add(67);
//         list.add(1);
//         list.add(85);

//         System.out.println(list);
//         Collections.sort(list);         // Ascending
//         System.out.println(list);


//         // Descending
//         Collections.sort(list , Collections.reverseOrder());
//         // Comparator - function Sorting logic
//         System.out.println(list);

//     }
// }













// list1 = 1 2 3 4 5
// list2 = 2 4 6 8 10
// list3 = 3 6 9 12 15

// Multidimensional ArrayList
// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1); list.add(2);
//         mainlist.add(list);


//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(3); list2.add(4);


//         mainlist.add(list2);



//         for(int i = 0 ; i < mainlist.size() ; i++){
//             ArrayList<Integer> currlist = mainlist.get(i);

//             for(int j = 0 ; j < currlist.size() ; j++){
//                 System.out.print(currlist.get(j)+" ");
//             }
//             System.out.println();
//         }

//         System.out.println(mainlist);
//     }
// }

















// Container with most water brute force.       O(n square);

// import java.util.*;
// public class Main{

//     public static int storeWater(ArrayList<Integer> height ){
//         int maxwater = 0;

//         for(int i = 0 ; i < height.size() ; i++){
//             for(int j = i +1 ; j < height.size() ; j++){
//                 int ht = Math.min(height.get(i) , height.get(j));

//                 int width = j -i;

//                 int currwater = ht * width;

//                 maxwater = Math.max(maxwater , currwater);
//             }
//         }

//         return maxwater;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> height = new ArrayList<>();

//             height.add(1);
//             height.add(8);
//             height.add(6);
//             height.add(2);
//             height.add(5);
//             height.add(4);
//             height.add(8);
//             height.add(3);
//             height.add(7);

//             System.out.println(storeWater(height));
//     }
// }














// Container with most water OPtimised (using two pointers)
// T.c = O(n).

// import java.util.*;
// public class Main{

//     public static int storeWater(ArrayList<Integer> height ){
        
//         int maxwater = 0;
//         int lp = 0;
//         int rp = height.size() -1;

//         while(lp<rp){
//             // calculate water area
//             int ht = Math.min(height.get(lp),height.get(rp));
//             int width = rp-lp;
//             int currwater = ht*width;
//             maxwater = Math.max(currwater , maxwater);

//             // update ptr
//             if(lp < rp){
//                 lp++;

//             }else{
//                 rp--;
//             }
//         }

//         return maxwater;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> height = new ArrayList<>();

//             height.add(1);
//             height.add(8);
//             height.add(6);
//             height.add(2);
//             height.add(5);
//             height.add(4);
//             height.add(8);
//             height.add(3);
//             height.add(7);

//             System.out.println(storeWater(height));
//     }
// }


















// Pair sum 1 (Brute force - 1)


// import java.util.*;
// public class Main{

//     public static boolean pairsum1(ArrayList<Integer> list , int target){

//         for(int i = 0 ; i < list.size() ; i++){
//             for(int j = i +1 ; j < list.size() ; j++){
//                 if(list.get(i)+ list.get(j)== target){
//                     return true;
//                 }
//             }
//         }

//         return false;
//     }

    
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();

//             list.add(1);
//             list.add(2);
//             list.add(3);
//             list.add(4);
//             list.add(5);
//             list.add(6);
            
//         int target = 5;
            
//         System.out.println(pairsum1(list,target));
//     }
// }

















// Pair Sum -1 (two pointer.)   // tc = O(n)

// import java.util.*;
// public class Main{

//     public static boolean pairsum1(ArrayList<Integer> list , int target){

//         int lp = 0 ; 
//         int rp = list.size() -1;

//         while(lp < rp){
//             if(list.get(lp) + list.get(rp) == target ){
//                 return true;
//             }else if(list.get(lp) + list.get(rp) < target){
//                 lp++;
//             }else{
//                 rp--;
//             }
//         }
//         return false;
//     }

    
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();

//             list.add(1);
//             list.add(2);
//             list.add(3);
//             list.add(4);
//             list.add(5);
//             list.add(6);
            
//         int target = 5;
            
//         System.out.println(pairsum1(list,target));
//     }
// }


















// Pair sum 2 - ( Sorted & rotated Array ) 
// Tc =  O(n).

import java.util.*;
public class Main{

    public static boolean pairsum2(ArrayList<Integer> list , int target){

        int n = list.size();
        int bp = -1;
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }

        }

        int lp = bp+1;
        int rp = bp;

        while(lp != rp){
            // case1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp=(lp+1) % n;
            }else{
                //case3
                rp = (n+rp-1) % n ;
            }
        }
        
        return false;
    }

    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

            list.add(11);
            list.add(15);
            list.add(6);
            list.add(8);
            list.add(9);
            list.add(10);
            
        int target = 16;
            
        System.out.println(pairsum2(list,target));
    }
}










