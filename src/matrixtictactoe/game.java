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
    
    public game(){
        /* initilizes the game states */
        state = 0;
        turn = false;
    }
    
    /* allows the player to make their turn */
    public int makeTurn(int loc[]){
        int fturn;
        
        /* quick reference to who's turn it is */
        if (turn == false){ fturn = 1; }
        else{ fturn = 2; }
        
        /* checks to make sure that the square is empty 
         * or in other words, value == 0
         */
        int value = newGame.getState(loc).getState(loc[3], loc[4]);
        if (value > 0){return 0;} 
        
        /* if it is empty, make the move */
        newGame.setState(loc,fturn);
        
        /* change the turn setting */
        turn = !turn;
        
        /* determine if the game is over */
        if (Util.game_done(newGame) >= 1){
            state = Util.game_done(newGame);
        }
        
       return 1; 
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
