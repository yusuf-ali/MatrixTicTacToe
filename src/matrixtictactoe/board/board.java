
package matrixtictactoe.board;

public class board {
    
    public board(){}
    
    
    /*
     * the board will be basically a
     * 3x3 array of smaller 3x3 boards
     * creating the "matrix effect"
     */
    tic[][] board = new tic[3][3];
    
    public void setState(int[] loc, int value){
        board[loc[0]][loc[1]].setState(loc[3],loc[4],value);
    }
    
    public tic getState(int[] loc){
        return board[loc[0]][loc[1]];
    }
    
    /*
     * can't think of anything else to add
     * to this file.....yea...
     */
    
}
