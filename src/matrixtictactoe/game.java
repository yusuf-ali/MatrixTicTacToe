package matrixtictactoe;

import matrixtictactoe.board.board;


/*
 * game class should manage and control the game
 * NOT THE FLOW OF THE GAME
 */
public class game {
    
    private util Util = new util();
    private board newGame = new board();    /* creates board game */
    private boolean turn;                   /* 0 is X turn, 1 is O turn */
    private int state;                      /* returns winner int     */
    private int[] lastmove;                 /* co-ordinates of the last move */
    
    public game(int[] firstmove){
        /* initilizes the game states */
        lastmove = new int[3];
        
        state = 0;
        
        newGame.setState(firstmove,1);
        
        lastmove[0] = firstmove[2];
        lastmove[1] = firstmove[3];
        
        turn = true;
    }
    
    /* 
     * copy constructor
     * allows object to be copied without
     * copying the reference 
     */
    public game(game dummy){
        this.newGame = dummy.getBoard();
        this.turn = dummy.getTurn();
        this.state = dummy.getState();
        this.lastmove = dummy.getLast();
    }
    
    /* allows the player to make their turn */
    public int makeTurn(int loc[]){
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
