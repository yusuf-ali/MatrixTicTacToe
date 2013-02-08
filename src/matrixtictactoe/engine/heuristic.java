
package matrixtictactoe.engine;

import matrixtictactoe.game;

public class heuristic {
    
        /* obtains the heuristic value of the current position */
    public double heuristic(game Game){
        
        /* if O wins the game */
        if(Game.getState() == 2){return 99;}
        
        /* X wins the game */
        if(Game.getState() == 1){return -99;}
        
        return 0;
    }
    
}
