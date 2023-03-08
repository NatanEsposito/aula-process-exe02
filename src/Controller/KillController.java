package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KillController {

	public KillController() {
		super();
		}
	
	public String os (){
		String os = System.getProperty("os.name");
		String arch = System.getProperty("os.arch");
		String version = System.getProperty("os.version");
		
		return os+ "-v."+version+"- arch."+ arch ;
		
	}

	public  void ListaProcessos(String process) {
		
		try{
			Process p = Runtime.getRuntime().exec(process);
		InputStream fluxo = p.getInputStream();
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer=new BufferedReader(leitor);
		String linha = buffer.readLine();
		while(linha!=null) {
		System.out.println(linha);	
		linha = buffer.readLine();
		}
		buffer.close();
		leitor.close();
		fluxo.close();
		}catch(IOException e) {
			e.printStackTrace();
	}
}
	public void mataProcess(String param) {
		String cmdPid = "TASKKILL/PID";
		String cmdNome = "TASKKILL/im";
		int pid = 0;
		StringBuffer buffer = new StringBuffer();
		try {
		pid = Integer.parseInt(param);
		buffer.append(cmdPid);
		buffer.append(" ");
		buffer.append(pid);
	}catch(NumberFormatException e) {
		buffer.append(cmdNome);
		buffer.append(" ");
		buffer.append(param);
		try {
			Runtime.getRuntime().exec(buffer.toString());
			
		}catch(IOException e1){
			e1.printStackTrace();
		}
		}
	
		

	

}
	
	
	
	
	
	
}
