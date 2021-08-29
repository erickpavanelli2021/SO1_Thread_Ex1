package controller;

import javax.swing.JOptionPane;

//      extends Thread
//      Parametros sao passados pelo construtor
//      metodo run()

public class ThreadId extends Thread {

	private int idThread;
	
	public ThreadId(int idThread) {
		
		this.idThread = idThread;
	}
	
//    Atalho é so escrever ru CTRL+espaço enter
    @Override
        public void run() {
          //So se executa o que esta aqui dentro
    	
    	System.out.println(idThread);
    	JOptionPane.showMessageDialog(null, idThread);
    }
}
