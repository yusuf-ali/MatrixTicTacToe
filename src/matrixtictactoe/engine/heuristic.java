
package matrixtictactoe.engine;

import matrixtictactoe.game;

public class heuristic {
    
        /* obtains the heuristic value of the current position */
    public double heuristic(game Game){
        /* get multiplier */
        int h = 1;
        if(Game.getTurn() == true){h = -1;}
        
        if(Game.getState() == 1){return h * 99;}
        
        return 0;
    }
    
}
