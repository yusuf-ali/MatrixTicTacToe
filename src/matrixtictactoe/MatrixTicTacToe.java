
package matrixtictactoe;

import matrixtictactoe.board.tic;
import matrixtictactoe.engine.engine;


public class MatrixTicTacToe {

    public static void main(String[] args) {
        util lol = new util();
        
     
        int lo0[] = {0,0,0,0};
        int lo1[] = {0,0,1,1};
        int lo2[] = {1,1,0,0};
        int lo3[] = {0,0,1,0};
        int lo4[] = {1,0,0,0};
        int lo5[] = {0,0,2,1};
        int lo6[] = {2,1,0,0};
        int lo7[] = {0,0,2,0};
        
        game newGame = new game(lo0);
        newGame.makeTurn(lo1);
        newGame.makeTurn(lo2);
        newGame.makeTurn(lo3);
        newGame.makeTurn(lo4);
        
        //newGame.makeTurn(lo5);
        //newGame.makeTurn(lo6);
        //newGame.makeTurn(lo7);
        
        engine eng = new engine(newGame);
        game[] states = eng.getBoards(newGame);
        
        //int[] j = {0,0}; int x = 3;
        //tic b = states[x].getBoard().getState(j);
        //lol.printTic(b);
        //System.out.println(states[x].getState());
        
        int[] f = eng.determinemove(newGame, 3);
        System.out.println(f[0] + "" + f[1] + "" + f[2] + "" + f[3]);
        
        //System.out.println(states[x].getTurn());
        //System.out.println(eng.heuristic(states[x]));
        
        //System.out.println(b.getState(0,1));
     
    }
    
    
    
    
    
}
