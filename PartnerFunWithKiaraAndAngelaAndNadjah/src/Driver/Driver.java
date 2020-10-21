package Driver;

import DasBeans.Controller;
import DasBeans.Playstation;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Controller ds5 = new Controller("black", "2");
			Playstation mine = new Playstation("ps5","white",ds5,5); 
			Playstation yours = new Playstation();
			System.out.println(yours);
			System.out.println(mine);
	}

}
