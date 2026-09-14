import java.util.*;
public class hollow{


    public static int binarysearch(int arr[] , int n ){
        
        int lp = 0;
        int rp = arr.length;
        while(lp<=rp){

            int mid = (int)(lp + (rp - lp) / 2 );

            if(arr[mid] == n){
                return mid;
            }
            else if(arr[mid] > n){
                rp = mid -1;
            }else{
                lp = mid + 1;
            }
        }

        return -1;

    }


    public static void reverse(int arr []){

        int lp = 0;
        int rp = arr.length-1;
        while(lp < rp){
            int temp = arr[lp];
            arr[lp] = arr[rp];
            arr[rp] = temp;
            lp++;
            rp--;
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }




    public static void pairs(int arr[] ){

        for(int i = 0 ; i < arr.length ; i++){
            
            for(int j = i+1 ; j< arr.length ; j++ ){

                System.out.print("("+arr[i]+","+arr[j]+")");

            }
            System.out.println();

        }



    }

    public static void subarrays(int arr []){

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
            for(int j = i+1 ; j < arr.length ; j++){
                for(int k = i ; k <= j ; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }


    }


    public static void maxSubarraySum(int arr[]){

        int maxsum = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                int sum = 0;
                for(int k = i ; k <= j ; k++ ){
                    sum += arr[k];
                }
                maxsum = Math.max(maxsum , sum);
            }
        }

        System.out.println(maxsum);


    }


    // now maximum subarray sum by prefix sum
    public static void prefixsum(int arr[]){

        int max = Integer.MIN_VALUE;

        int prefixsum[] = new int[arr.length];

        prefixsum[0]=arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            prefixsum[i] = prefixsum[i-1]+arr[i];
        }


        for(int i = 0 ; i < arr.length ; i++){

            int start = i;
            for(int j = i; j < arr.length ; j++){
                int end = j;

                int sum = (start == 0)? prefixsum[end] : prefixsum[end]-prefixsum[start - 1];

                if(max < sum){
                    max = sum;
                }
            }
        }
        System.out.println(max);

    }




    // kadans algorithm

    public static void kadans(int arr []){

        int max = Integer.MIN_VALUE;

        int currsum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(currsum >= 0){
                currsum += arr[i];
            }else{
                currsum = 0;
            }

            max = Math.max(currsum , max);
        }
        System.out.println(max);

    }



    // best time to buy and sell stocks
    public static void btbss(int arr []){
        int maxprofit = Integer.MIN_VALUE;
        int buy = arr[0];
        for(int i=1;i<arr.length;i++){
            if(buy < arr[i]){
                maxprofit = Math.max(arr[i] - buy , maxprofit);
            }else{
                buy = arr[i];
            }
        }
        System.out.println(maxprofit);

    }

    //trapping rainwater
    public static void trapwater(int arr[]){

        // max from left
        int left[] = new int [arr.length];
        left[0]=arr[0];
        for(int i = 1 ; i< arr.length ; i++){
            left[i] = Math.max(left[i-1] , arr[i]);
        }

        // max from right
        int right[] = new int [arr.length];
        right[arr.length -1] = arr[arr.length -1];
        for(int i = arr.length -2 ; i >= 0 ; i--){
            right[i] = Math.max(right[i+1] , arr[i] );
        }

        //finding trapped water 

        int trappedwater = 0;

        for(int i = 0 ; i < arr.length ; i++){
            int waterlevel = Math.min(left[i] , right[i]);
            trappedwater += waterlevel - arr[i];
        }

        System.out.println(trappedwater);
    }


    // Binary search in Rotated Array

    public static int search (int arr[],int target){

        int min = minsearch(arr);

        if(arr[min] <= target  && target <= arr[arr.length - 1] ){
            return search(arr , min , arr.length-1,target);
        }else{
            return search(arr, 0 , min ,target);
        }
    }

    public static int search (int arr[] , int left , int right , int target){

        while(left <= right){
            int mid = (int)(left + (right - left)/2);

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                right = mid -1;
            }else{
                left = mid + 1;
            }

        }
        return -1;
   
    }
    public static int minsearch(int arr[] ){

        int l = 0;
        int r = arr.length -1;

        while(l <= r){
            int mid = (int)(l + (r-1)/2);

            if(mid >0 && arr[mid-1] > arr[mid]){
                return mid;
            }
            else if(arr[mid] > arr[r] && arr[mid] > arr[l]){
                l = mid +1;
            }else{
                r = mid - 1;
            }
        }

        return l;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        int arr [] = {4,  5, 6, 7, 0, 1, 2};

        // System.out.println(binarysearch(arr , n));

        // reverse(arr);

        //

        // pairs(arr);

        // subarrays(arr);

        // maxSubarraySum(arr);
        // int sum = 0 ;
        // for(int i = 0 ; i < arr.length ; i++){
        //     sum += arr[i];
        // }
        // System.out.println(sum);

        // prefixsum(arr);

        // kadans(arr);

        // btbss(arr);

        // trapwater(arr);

        // System.out.println(search(arr,3));


    }
}