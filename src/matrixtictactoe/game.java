package matrixtictactoe;

import matrixtictactoe.board.board;


/*
 * game class should manage and control the game
 * NOT THE FLOW
 */
public class game {
    
    private board newGame = new board();    /* creates board game */
    private boolean turn;                   /* 0 is X turn, 1 is O turn */
    private int state;                      /* returns winner int     */
    
    public game(){}
    
    public void makeTurn(int loc[]){
        
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
