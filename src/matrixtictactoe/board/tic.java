/* 
 * this is a smaller board
 * where the main board will contain
 * a 3x3 board of smaller boards
 * 
 */


package matrixtictactoe.board;

public class tic {
    
    /*
     * X will be represented as 1
     * O will be represented as 2
     * a 0 represents empty spot
     */
    private int [][] tic = new int[3][3];
    
    /* sets the value of the specified co-ordinate */
    public void setState(int[] loc, int value){
        tic[loc[0]][loc[1]] = value;
    }
    
    /* returns the value of the specified co-ordinate */
    public int getState(int[] loc){
        return tic[loc[0]][loc[1]];
    }
    
}
