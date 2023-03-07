package Controller;

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
	
	
	
	
	
	
	
	
	
}
