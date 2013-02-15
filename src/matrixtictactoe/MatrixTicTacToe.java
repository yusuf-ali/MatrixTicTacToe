
package matrixtictactoe;

import matrixtictactoe.engine.engine;


public class MatrixTicTacToe {

    public static void main(String[] args) {
        
       // graphics g = new graphics();
       // g.run();
        
        int p1[] = {0,0,0,0};
        
        game nG = new game(p1);
        engine eng = new engine();
        
        int move[] = eng.determinemove(nG, 3);
        String g = move[0] + "" + move[1] + "" + move[2] + "" + move[3];
        System.out.println(g);
        
    }   
}
