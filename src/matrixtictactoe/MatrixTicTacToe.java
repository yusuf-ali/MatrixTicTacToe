
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
        
        game newGame = new game(lo0);
        newGame.makeTurn(lo1);
        newGame.makeTurn(lo2);
        newGame.makeTurn(lo3);
        newGame.makeTurn(lo4);
        
        engine eng = new engine(newGame);
        int[] f = eng.determinemove(newGame, 2);
        System.out.println(f[0] + "" + f[1] + "" + f[2] + "" + f[3]);
    }
    
}
