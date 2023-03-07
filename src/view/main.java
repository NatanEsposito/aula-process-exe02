package view;
import javax.swing.JOptionPane;

import Controller.KillController;
public class main {

    public static void main (String[] args) {
      int opc;
      opc=0;
      while(opc!=9) {
    
      opc=Integer.parseInt(JOptionPane.showInputDialog("9 - encerra"));
        KillController KController = new KillController();

        String os= KController.os();
      
        

	switch(opc) {
	
        case 1:
        System.out.println(os);
        break;

}
        }
        }

}
Nąțałヅ