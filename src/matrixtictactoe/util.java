
package matrixtictactoe;
import matrixtictactoe.board.board;
import matrixtictactoe.board.tic;

/*
 * some cool utilities to help 
 * do some simple calculations
 */
public class util{

/*  
 *     1) this should dictate if a board is won 
 *     returns the int of player that wins
 */
    public int tic_win(tic board){
        
        /* iterate through the rows 
         * check to see if a row has 3 in a row
         */
        for(int i =0;i<3;i++){
            for(int j=0;j<2;j++){
                
                /*
                 * if the current square is not equal to
                 * the next square, then clearly there is not
                 * 3 in a row
                 */
                if(board.getState(i, j) != board.getState(i,j+1)){
                    break;
                }
                
                /*
                 * if it makes it this far, then clearly 
                 * there is 3 in a row
                 */
                if(j+1 == 3){
                    return board.getState(i,j+1);
                }
                
            }
        }
        
        /* iterate thorugh the coloumns to see
         * if a column has 3 in a coloumn!
         */
        for(int i =0;i<3;i++){
            for(int j=0;j<2;j++){
                
                /*
                 * if the current square is not equal to the 
                 * square below, then clearly there is not 3
                 * in a column
                 */
                if(board.getState(j,i) != board.getState(j+1,i)){
                    break;
                }
                
                /*
                 * if it makes it this far, then clearly 
                 * there is 3 in a column
                 */
                if(j+1 == 3){
                    return board.getState(j+1,i);
                }
                
            }
        }
        
        /* 
         * check diagonals, this has to to be
         * hard coded (i think)
         */
        for(int i =0;i<2;i++){
            if(board.getState(i,i) != board.getState(i+1,i+1)){
                break;
            }
            
            if(i+1 == 2){
                return board.getState(i,i);
            }
        }
        
        
        //      0,0 | 0,1 | 0,2
        //      1,0 | 1,1 | 1,2
        //      2,0 | 2,1 | 2,2
        
        
        
        return 0;   
    }

/*  
 *     2) determins if a possible win can happen 
 *     returns int of player with possible win 
 */
    public int poss_win(tic board){
        
        
        return 0;
    }
    
 /*  
  * 3) determine if the game is over, the whole board
  */
    public int game_done(board game){
        
        /* iterate through every box in the game board */
        for(int i =0; i<3;i++){
            for(int j=0;j<3;j++){
              
               /* sets up the location array */
              int[] loc = {i,j};
              
              /* compares to see a board is won */
              if( tic_win(game.getState(loc)) >= 1 ){
                return tic_win(game.getState(loc));
              }
                
            }
        }
        
        return 0;
    }
}