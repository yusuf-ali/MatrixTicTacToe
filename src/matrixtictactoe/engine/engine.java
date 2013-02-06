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
    private game best_move;
    
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
    
    public double make_descision(game Game,int depth,double floor,double ceiling){
        
        /* if terminal node, returns the heuristic 
         * value of the board
         */
        if(depth <= 0){ return heuristic(Game);}
        
        /*
         * get all the possible board states
         */
        game[] states = getBoards(Game);
        game bestGame;  /* this will be the "best game" */      
        
        if (Game.getTurn() == true){   /* this is O's turn */
            
            /* O wants to maximize the heuristic value */
            
            for(int i =0;i<9;i++){
             
                if(states[i] == null){continue;}    /* skips empty states */
                
                /* obtain the heuristic 'best move' X can make */
                double heuristic = make_descision(states[i],depth-1,floor,ceiling);
                
                /* figure out which move is best for O
                 * this will be the maximum move (worst senario for X)
                 */
                if (heuristic >= floor){
                    floor = heuristic; bestGame = states[i];
                    best_move = states[i];
                }
                
                /*
                 * not sure if this works?
                 */
                if (ceiling <= floor){
                    break;
                }
                
            }
            
            return floor;
            
        }else{              /* this is X's turn */            
            
            /* X wants to minimize the heuristic value */
            for(int i=0;i<9;i++){
                
                if(states[i] == null){continue;} /* skips empty states */
                
                /* obtain the heuristic 'best move O can make */
                double heuristic = make_descision(states[i],depth-1,floor,ceiling);
                
                /*
                 * figure out which move is best for X
                 * this will be the minimum move (worst senario for O)
                 */
                if( heuristic <= ceiling){
                    ceiling = heuristic; bestGame = states[i];
                    best_move = states[i];
                }
                
                /*
                 * not sure that this works?
                 */
                if(floor <= ceiling){
                    break;
                }
                
            }
            
            return ceiling;
        }
        
    }
    
    public game getbest(){
        return best_move;
    }
}
