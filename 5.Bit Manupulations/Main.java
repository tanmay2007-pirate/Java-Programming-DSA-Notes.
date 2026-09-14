







// get the i th bit

// setting ith bit means setting it to 1.

// clear ith bit 

// clear last ith bits

public class Main{

    public static int  clearBit(int n , int pos){
        int bitmask = ~(1 << pos);

        return n & bitmask;
    }

    public static int setBit(int n , int pos){
        int bitmask = 1 << pos;

        return n | bitmask;
    }

    public static void updateBit(int n , int pos , int newBit){

       int bitmask = clearBit(n,pos);
       int something = newBit << pos;
       System.out.println( something | bitmask);

    }

    public static boolean pow(int n){

        if( (n & n-1 ) == 0){
            return true;
        }else{
            return false;
        }

    }

    public static void clearRange(int n , int start , int end){

        int a = (~0) << end + 1 ;
        int b = (1 << start) - 1;

        int bitmask = a | b;

        System.out.println(n & bitmask);

    }

    public static void countSet(int n){

        int count = 0;

        while(n != 0){
            
            if((n & 1) == 1){
                count++;
            }
            
            n >>= 1;
        }

        System.out.println(count);
    }


    public static void fastExpo(int n , int pow){

        int ans = 1;

        while( pow > 0){

            if( (pow & 1) != 0){
                ans *= n;
            }

            n = n*n;

            pow >>= 1;
        }
        System.out.println(ans);

    }

    public static void modularExpo(int n , int pow , int x){

        int ans = 1;

        while(pow >0 ){

            if( (pow & 1) != 0){
                ans *= n%x;
            }

            n = n*n;
            pow >>= 1;
        }
        System.out.println(ans);

    }
    
    public static void main(String args[]){

       modularExpo(2,3 ,3);
      
    }
}