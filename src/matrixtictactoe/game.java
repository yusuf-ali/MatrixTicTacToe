package matrixtictactoe;

import matrixtictactoe.board.board;


/*
 * game class should manage and control the game
 * NOT THE FLOW OF THE GAME
 */
public class game {
    
    private util Util = new util();
    private board newGame = new board();    /* creates board game */
    private boolean turn;                   /* false is X turn, true is O turn */
    private int state;                      /* returns winner int     */
    private int[] lastmove;                 /* co-ordinates of the last move */
    
    public game(int[] firstmove){
        /* initilizes the game states */
        lastmove = new int[4];
        
        state = 0;
        
        newGame.setState(firstmove,1);
        
        lastmove[0] = firstmove[2];
        lastmove[1] = firstmove[3];
        lastmove[2] = firstmove[0];
        lastmove[3] = firstmove[1];
        
        turn = true;
    }
    
    /* 
     * copy constructor
     * allows object to be copied without
     * copying the reference 
     */
    public game(game dummy){
        lastmove = new int[4];
        
        int[] l = dummy.getLast();
        
        this.newGame = new board(dummy.getBoard());
        this.turn = dummy.getTurn();
        this.state = dummy.getState();
      
        this.lastmove[0] = l[0];
        this.lastmove[1] = l[1];
        this.lastmove[2] = l[2];
        this.lastmove[3] = l[3];
        
    }
    
    /* allows the player to make their turn */
    public int makeTurn(int loc[]){
        /* ensures the game isn't done */
        if(state > 0){return 0;}
        
        int fturn;
        
        /* quick reference to who's turn it is */
        if (turn == false){ fturn = 1; }
        else{ fturn = 2; }
        
        /* check if the move is legal 
         * or in other words, the first 2 elements of 
         * loc, are equal to the 2 elements of lastmove
         */
        if (loc[0] != lastmove[0] || loc[1] != lastmove[1]){
            return 0;
        }
        
        /* checks to make sure that the square is empty 
         * or in other words, value == 0
         */
        int value = newGame.getState(loc).getState(loc[2], loc[3]);
        if (value > 0){return 0;} 
        
        /* if it is empty, make the move */
        newGame.setState(loc,fturn);
        
        /* change the turn setting */
        turn = !turn;
        
        /* update the last move array */
        lastmove[0] = loc[2];
        lastmove[1] = loc[3];
        lastmove[2] = loc[0];
        lastmove[3] = loc[1];
        
        /* determine if the game is over */
        if (Util.game_done(newGame) >= 1){
            state = Util.game_done(newGame);
        }
        
       return 1; 
    }
    
    public int[] getLast(){
        return lastmove;
    }
    public int getState(){
        return state;
    }
    public boolean getTurn(){
        return turn;
    }
    public board getBoard(){
        return newGame;
    }
    
}
