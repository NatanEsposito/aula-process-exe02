package view;
import java.awt.Component;

import javax.swing.JOptionPane;

import Controller.KillController;

public class main {
	KillController KController = new KillController();

    public static void main(String[] args) {
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
        
        case 2:
        	
        if(os().contains("windows")) {
        String process = "TASKLIST/ FO TABLE";
        KController.ListaProcessos(process);
       
        }
        if(os().contains("linux")) {
        	 String process = "ps - ef ";
             KController.ListaProcessos(process);
        }
         break;
         
        case 3:
        	
        break;
}
      }
    }
}
        

	
