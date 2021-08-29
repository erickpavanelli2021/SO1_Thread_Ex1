package view;

import controller.ThreadCalc;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//for (int idThread = 0; idThread < 5; idThred ++){
		    //ThreadId threadId = new ThreadId(idThread);
		    //Thread threadId = new ThreadId(idThread);
		    //threadId.start();
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo número: "));
		
		    for (int op = 0; op < 5; op++) {
		    	ThreadCalc tCalc = new ThreadCalc(a, b, op);
		    	tCalc.start();
		    }
	}

}
