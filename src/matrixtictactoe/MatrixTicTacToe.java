
package matrixtictactoe;

import matrixtictactoe.engine.engine;


public class MatrixTicTacToe {

    public static void main(String[] args) {
        util lol = new util();
        
     
        int lo0[] = {0,0,0,0};
        int lo1[] = {0,0,1,1};
        int lo2[] = {1,1,0,0};
        int lo3[] = {0,0,1,0};
        int lo4[] = {1,0,0,0};
        int lo5[] = {0,0,1,2};
        
        game newGame = new game(lo0);
       // newGame.makeTurn(lo1);
       // newGame.makeTurn(lo2);
       // newGame.makeTurn(lo3);
       // newGame.makeTurn(lo4);
        
        engine eng = new engine();
        int[] f = eng.determinemove(newGame, 8);
        System.out.println(f[0] + "" + f[1] + "" + f[2] + "" + f[3]);
        
        //newGame.makeTurn(lo5);
        //System.out.println();
        
    }
    
}
