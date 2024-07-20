import java.util.*;

class Solution {
   public boolean isSafe(int row, int col, char[][] board) {
       // horizontal
       for(int j = 0; j < board.length; j++) {
           if(board[row][j] == 'Q') {
               return false;
           }
       }
      
       // vertical
       for(int i = 0; i < board.length; i++) {
           if(board[i][col] == 'Q') {
               return false;
           }
       }
      
       // upper left
       for(int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       // upper right
       for(int r = row, c = col; r >= 0 && c < board.length; r--, c++) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       // lower left
       for(int r = row, c = col; r < board.length && c >= 0; r++, c--) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       // lower right
       for(int r = row, c = col; r < board.length && c < board.length; r++, c++) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       return true;
   }
  
   public void saveBoard(char[][] board, List<List<String>> allBoards) {
       List<String> newBoard = new ArrayList<>();
       for(int i = 0; i < board.length; i++) {
           StringBuilder row = new StringBuilder();
           for(int j = 0; j < board[0].length; j++) {
               row.append(board[i][j]);
           }
           newBoard.add(row.toString());
       }
       allBoards.add(newBoard);
   }
  
   public void helper(char[][] board, List<List<String>> allBoards, int col) {
       if(col == board.length) {
           saveBoard(board, allBoards);
           return;
       }
      
       for(int row = 0; row < board.length; row++) {
           if(isSafe(row, col, board)) {
               board[row][col] = 'Q';
               helper(board, allBoards, col + 1);
               board[row][col] = '.';
           }
       }
   }
  
   public List<List<String>> solveNQueens(int n) {
       List<List<String>> allBoards = new ArrayList<>();
       char[][] board = new char[n][n];
       for(int i = 0; i < n; i++) {
           Arrays.fill(board[i], '.');
       }
       helper(board, allBoards, 0);
       return allBoards;
   }
   
  
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4; // Change n to the desired board size
        List<List<String>> solutions = solution.solveNQueens(n);
        
        // Print the solutions
        for (List<String> solutionBoard : solutions) {
            for (String row : solutionBoard) {
                System.out.println(row);
            }
            System.out.println();
        }
    
}
}
