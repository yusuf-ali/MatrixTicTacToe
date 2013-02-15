package matrixtictactoe.engine;

import matrixtictactoe.board.board;
import matrixtictactoe.board.tic;
import matrixtictactoe.game;

/*
 * this is the main engine class that
 * will use alpha beta pruning to 
 * determine the optimal move
 * http://en.wikipedia.org/wiki/Alpha–beta_pruning
 */
public class engine extends heuristic {

    private int[] bestMove = new int[4];
    private int dph = 0;
    
    public engine(){
    }
    
    public int[] determinemove(game Game,int depth){
        /* call the alpha beta pruning methods */
        make_descision(new game(Game),depth,-999,999);
        
        // save the depth into the int 
        dph = depth;
        
        /* return the best move */
        return bestMove;
        
    }
    
    /* returns all the possible board states */
    public game[] getBoards(game Game){
        board b = Game.getBoard();
        int loc[] = Game.getLast();
        tic t = b.getState(loc);
        
        /* 
         * the amount of possible board states will be the amount of 0's
         * in the specific "smaller" board
         */
        int n = t.getspots();
        game[] list = new game[n];
        
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                /* find the empty spots */
                if(t.getState(i, j) != 0){ continue; }
                    
                /* make game if it is 0 */
                    /* formulate location array */
                int[] f = {loc[0],loc[1],i,j};
                
                /* store the node into array */
                list[n-1] = new game(Game);
                list[--n].makeTurn(f);
                
                /* speed check... */
                if(list[0] != null) {return list;}                
            }
        }
        
        return list;
    }
    
    public double make_descision(game Game,int depth,double floor,double ceiling){
        
        /* 
         * if terminal node, returns the heuristic 
         * value of the board
         */
        if(depth <= 0 || Game.getState() > 0){ 
            return heuristic(Game);
        }
        
        /*
         * get all the possible board states
         */
        game[] states = getBoards(Game);       
        
        if (Game.getTurn() == true){   /* this is O's turn */
            
            /* O wants to maximize the heuristic value */
            
            for(int i =0;i<states.length;i++){
             
                if(states[i] == null){continue;}    /* skips empty states */
                
                /* obtain the heuristic 'best move' X can make */
                double heuristic = make_descision(states[i],depth-1,floor,ceiling);
                
                /* 
                 * figure out which move is best for O
                 * this will be the maximum move (worst senario for X)
                 */
                if (heuristic > floor){
                    floor = heuristic; 
                    
                    // make sure the node analysis is the right one
                    if(depth == dph){
                    int move[] = states[i].getLast();
                    
                    bestMove[0] = move[2]; bestMove[1] = move[3];
                    bestMove[2] = move[0]; bestMove[3] = move[1];
                    
                    }
                    
                }
                
                /*
                 * not sure if this works?
                 */
                //if (ceiling <= floor){
                //    break;
                //}
                
            }
            
            return floor;
            
        }else{              /* this is X's turn */            
            
            /* X wants to minimize the heuristic value */
            for(int i=0;i<states.length;i++){
                
                if(states[i] == null){continue;} /* skips empty states */
                
                /* obtain the heuristic 'best move O can make */
                double heuristic = make_descision(states[i],depth-1,floor,ceiling);
                
                /*
                 * figure out which move is best for X
                 * this will be the minimum move (worst senario for O)
                 */
                if( heuristic <= ceiling){
                    ceiling = heuristic; 
                    
                    // make sure the node analysis is the right one
                    if(depth == dph){
                    int move[] = states[i].getLast();
                    
                    bestMove[0] = move[2]; bestMove[1] = move[3];
                    bestMove[2] = move[0]; bestMove[3] = move[1];
                    
                    }
                    
                }
                
                /*
                 * not sure that this works?
                 */
                //if(floor <= ceiling){
                //    break;
                //}
                
            }
            
            return ceiling;
        }
        
    }
   
}
