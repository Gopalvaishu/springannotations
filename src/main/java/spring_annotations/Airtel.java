package spring_annotations;




// when we have more than one implementation class like jio and airtel we can give primary annot  first it will come as output

public class Airtel implements Sim{

	@Override
	public String toString() {
		return " This is a Airtel Sim ";
	}

}
