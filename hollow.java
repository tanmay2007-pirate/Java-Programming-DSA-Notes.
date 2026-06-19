






// Selection sort.
public class hollow{

    public static void selection_sort(int arr[]){

        int n = arr.length;

        for(int i = 0 ; i < n-1  ; i++){

            int minpos = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr[minpos]> arr[j]){
                    minpos = j;
                }
            }
            int t = arr[i];
            arr[i]= arr[minpos];
            arr[minpos] = t;
        }

        for(int i = 0 ; i <  arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){

        

        int arr[]= {7,5,2,9,3,1,0,5,3,0,10};

        selection_sort(arr);
        

    }
}


