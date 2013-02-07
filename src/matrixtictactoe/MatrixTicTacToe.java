
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
        
        int[] j = eng.determinemove(newGame,4);
        
        System.out.println(newGame.getState() + "\n");
        System.out.println(j[0] + "" + j[1] + "" + j[2] + "" + j[3]);
     
    }
}
