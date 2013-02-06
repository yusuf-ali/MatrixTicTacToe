package matrixtictactoe.engine;

import matrixtictactoe.game;

/*
 * this is the main engine class that
 * will use alpha beta pruning to 
 * determine the optimal move
 * http://en.wikipedia.org/wiki/Alpha–beta_pruning
 */
public class engine {

    private game master;    
    
    public engine(game Game){
        master = Game;
    }
    
    /* obtains the heuristic value of the current position */
    private double heuristic(game Game){
        return 0;
    }
    
    /* returns all the possible board states */
    private game[] getBoards(game Game){
        game[] list = new game[3];
        
        
        return list;
    }
    
    public double make_descision(game Game,int depth,int floor,int ceiling,int player){
        
        /* if terminal node, returns the heuristic 
         * value of the board
         */
        if(depth <= 0){ return heuristic(Game);}
        
        /*
         * get all the possible board states
         */
        game[] states = getBoards(Game);
        
        if (player == 2){   /* this is for O */
            
            for(int i =0;i<9;i++){
             
                if(states[i] == null){continue;}    /* skips empty states */
                
                
                
                if (ceiling <= floor){ /*break */ }
            }
            
            return floor;
            
        }else{              /* this is for X */
            
            
            if (floor <= ceiling){/* break */ }
            
            return ceiling;
        }
        
    }
    
    
}
