
package matrixtictactoe.GUI;

import javax.swing.JFrame;




public class graphics extends JFrame{
    
    public graphics(){
        
        setTitle("My Empty Frame");
	setSize(300,200); // default size is 0,0
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public void run(){
	this.show();
    }
}
