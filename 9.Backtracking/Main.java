
// Backtracking on Arrays.


public class Main{

    public static void printArr(int arr []){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void printBoard(char[][] board){

        System.out.println("-----------chessboard-------------");
        for(int i = 0 ; i< board.length ; i++){
            for (int j = 0 ; j < board.length ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }



    // BACKTRACKING ON ARRAY;

    public static void changeArr(int arr [] , int i , int val){

        //base

        if(i == arr.length){
            
            printArr(arr);
            return;
        }


        // kaam
        arr[i] = val;

        changeArr(arr , i+1 , val+1);

        arr[i] = arr[i] - 2 ;       // backtracking step (which is after function call .)


    }



    // Subsets Code 

    public static void findsubset(String str ,  String ans , int i){

        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }



        // recursion
        //yes choice
        findsubset(str , ans+str.charAt(i) , i+1);

        //No Choice (backtracking step)
        findsubset(str , ans , i+1);


    }



    // 3. Find Permutations.

    public static void permutations(String str , String ans){

        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recursion

        for(int i = 0 ; i < str.length() ; i++){
            char curr = str.charAt(i);
            
            //"abcde" = "ab" +"de" = "abde".

            String newstr = str.substring(0 ,i)+str.substring(i+1);
            
            permutations(newstr , ans+curr);
        }


    }



    // 4. N-Queens (all ways)

    public static boolean is_safe(char board [][] ,int row , int col){

        // vertical up
        for(int i = row-1 ; i >= 0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // diagonal left up
        for(int i = row -1 , j= col - 1 ; i >= 0 && j>=0 ; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // diagonal right up
        for(int i = row -1 , j= col+1 ; i >= 0 && j < board.length ; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;

    }

    static int count = 0;

    public static void queens_all_way(char board[][], int row){

        // base
        if(row == board.length){
            count++;
            printBoard(board);
            return;
        }
        

        // column loop
        for(int j = 0 ; j < board.length ; j++){

            if(is_safe(board,row,j)){

                board[row][j] = 'Q';
                queens_all_way(board , row+1);  // function call
                board[row][j] = '.';    // backtracking step
            }
        }

    }

    public static boolean queens_one_solution(char board[][], int row){

        // base
        if(row == board.length){
            return true;
        }
        

        // column loop
        for(int j = 0 ; j < board.length ; j++){

            if(is_safe(board,row,j)){

                board[row][j] = 'Q';
                if(queens_one_solution(board , row+1)){
                    return true;
                };  // function call
                board[row][j] = '.';    // backtracking step
            }
        }

        return false;
    }








    // 5. Gris Ways.

    public static int Grid_ways(int i ,int j, int n , int m){

        // base case

        if(i == n-1 && j == m-1){   // last cell
            return 1;
        }else if(i == n || j == n){
            return 0;            // boundry cross condition
        }


        // kaam.
        int w1 = Grid_ways(i+1 , j , n , m );
        int w2 = Grid_ways(i , j+1 , n , m );

        return w1 + w2 ;
    }







    // Sudoku Code


    public static boolean isSafe(int [][]sudoku , int row , int col , int digit){


        // column

        for(int i = 0 ; i <= 8 ; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        //row
        for(int j = 0 ; j <= 8 ; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }

        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for(int i = sr ; i < sr +3 ; i++){
            for(int j = sc ; j < sc+3  ; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }


        return true ;

    }

    public static boolean sudokuSolver(int sudoku[][] , int row , int col){

        // base case
        if(row == 9 && col == 0){
            return true ;
        }


        // recursion
        int nextrow = row , nextcol = col+1;
        if(col+1 == 9){
            nextrow = row+1;
            nextcol = 0;
        }

        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku , nextrow , nextcol);
        }
        for(int digit = 1 ; digit <= 9 ; digit++){
            if(isSafe(sudoku , row ,col , digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku , nextrow, nextcol)){
                    return true;
                }

                sudoku[row][col] = 0 ;
            }
        } 
        return false;

    }

    public static void printsudoku(int sudoku[][]){
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                System.out.print(sudoku[i][j]+ " ");
            } 
            System.out.println();
        }
    }

    
    public static void main(String args[]){

        // 1. Backtracking on an Array

        // int arr [] = new int [5];
         
        // changeArr(arr , 0, 1);

        // printArr(arr);






        // 2. finding subsets (we used String try to form with Stringbuilder.)

        // String str = "abc";

        // findsubset(str , "" ,0); 






        //3.Find Permutations

        // String str = "abc";

        // permutations(str,"");





        
        // 4. N-Queens (all way)

        // int n = 4;

        // char board[][] = new char[n][n];
        // //initialize
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = 0 ; j < n ; j++){

        //         board[i][j] ='.';

        //     }
        // }

        // queens_all_way(board ,0);
        // System.out.println(count);

        // N-queens (check if solution exists and print one.)


        // if(queens_one_solution( board , 0)){
        //     System.out.println("Solution exists");
        //     printBoard(board);
        // }else{
        //     System.out.println("solution is not possible");
        // }









        // 5. Grid Ways.

        // int n = 3 , m = 3 ;
        
        // System.out.println(Grid_ways(0 , 0, n , m));







        // 6. Sudoku Solver

        int sudoku [] [] = {{0,0,8,0,0,0,0,0,0},
                            {4,9,0,1,5,7,0,0,2},
                            {0,0,3,0,0,4,1,9,0},
                            {1,8,5,0,6,0,0,2,0},
                            {0,0,0,0,2,0,0,6,0},
                            {9,6,0,4,0,5,3,0,0},
                            {0,3,0,0,7,2,0,0,4},
                            {0,4,9,0,3,0,0,5,7},
                            {8,2,7,0,0,9,0,1,3}};

        
        if(sudokuSolver(sudoku , 0 , 0)){
            System.out.println("Solution exists");
            printsudoku(sudoku);
        }else{
            System.out.println("Solution does not exist");
        }

    }
}