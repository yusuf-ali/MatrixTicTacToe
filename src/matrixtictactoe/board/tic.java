/* 
 * this is a smaller board
 * where the main board will contain
 * a 3x3 board of smaller boards
 */


package matrixtictactoe.board;

public class tic {
    
     /*
     * X will be represented as 1
     * O will be represented as 2
     * a 0 represents empty spot
     */
    
    private int[][] t = new int[3][3];
    private int spots = 9;  /* number of empty spots */
    
    public tic(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                t[i][j] = 0;
            }
        }
    }
    
    /* 
     * copy constructor
     * allows tic to be copied 
     * without copying reference
     */
    public tic(tic dummy){
        this.spots = dummy.getspots();
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){        
                this.t[i][j] = dummy.getState(i, j);
            }
        }
    }
    
    /* sets the value of the specified co-ordinate */
    public void setState(int x,int y, int value){
        t[x][y] = value;
        if(value != 0){spots--;}
        else{spots++;}
    }
    
    /* returns the value of the specified co-ordinate */
    public int getState(int x, int y){
        return t[x][y];
    }
    
    public int getspots(){
        return spots;
    }
    
}
