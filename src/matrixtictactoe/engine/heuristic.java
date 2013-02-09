
package matrixtictactoe.engine;

import matrixtictactoe.game;

public class heuristic {
    
        /* obtains the heuristic value of the current position */
    public double heuristic(game Game){
      //  int l[] = {0,1};
       // board b = Game.getBoard();
       // tic smallBoard = b.getState(l);        
        
        /* if O wins the game */
        if(Game.getState() == 2){return 99;}
        
        /* X wins the game */
        if(Game.getState() == 1){return -99;}
        
        return 0;
    }
    
}
