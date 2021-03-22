
public class Computer implements ComputerOperations {
	
	private String className = " ";
	
	public Computer() {
		this.className = "Computer";
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassName() {
		return this.className;
	}
	public void turnon() {
		System.out.println(getClassName() + "Is now turned on");
	}
	
	public void turnoff() {
		System.out.println(getClassName() + "Is now turned off");
		
	}
	public void performDownload() {
		System.out.println(getClassName() + "Is now downloading a file");
		
		
	}
	public void performUpload() {
		System.out.println(getClassName() + "Is now uploading a file");
		
		
	}
	public void playVideo() {
		System.out.println(getClassName() + " Is now playing a video");
		
	}
	public void playMusic() {
		System.out.println(getClassName() + "Is now playing music");
		
		
	}
	
}
	
