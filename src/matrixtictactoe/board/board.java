
package matrixtictactoe.board;

public class board {    
    
    /*
     * the board will be basically a
     * 3x3 array of smaller 3x3 boards
     * creating the "matrix effect"
     */
    private tic[][] b = new tic[3][3];
    
    public board(){
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j] = new tic();
            }
        }
    }
    
    public void setState(int[] loc, int value){
       b[loc[0]][loc[1]].setState(loc[2],loc[3], value);
    }
    
    public tic getState(int[] loc){
        return b[loc[0]][loc[1]];
    }
    
    /*
     * can't think of anything else to add
     * to this file.....yea...
     */
    
}
