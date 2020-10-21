package DasBeans;

public class Playstation {
	private String version;
	private String color;
	private enum Style {
		NEW,
		OLD,
		PRO
	}
	Controller dualshock;
	private int ports;
	
	
	// constructors
	public Playstation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Playstation(String version, String color, Controller dualshock, int ports) {
		super();
		this.version = version;
		this.color = color;
		this.dualshock = dualshock;
		this.ports = ports;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Controller getDualshock() {
		return dualshock;
	}


	public void setDualshock(Controller dualshock) {
		this.dualshock = dualshock;
	}


	public int getPorts() {
		return ports;
	}


	public void setPorts(int ports) {
		this.ports = ports;
	}


	@Override
	public String toString() {
//		return "Playstation [version=" + version + ", color=" + color + ", dualshock=" + dualshock + ", ports=" + ports
//				+ "]";
		return "Nadjah's branch says PS5 INCOMING";
		
	}
	
	//getters and setters
	
}
