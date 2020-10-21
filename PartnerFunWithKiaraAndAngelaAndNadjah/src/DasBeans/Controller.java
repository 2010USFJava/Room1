package DasBeans;

public class Controller {
	private String color;
	private String version;
	
	
	//constructors
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Controller(String color, String version) {
		super();
		this.color = color;
		this.version = version;
	}


	//getters and setters
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	@Override
	public String toString() {
		return "Controller [color=" + color + ", version=" + version + "]";
	}
	
	
}
