package spring_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//component is responsible for creating object like bean tag in xml
@Component

public class Mobile {
	//@value is used for value injection
@Value("Oneplus")
String brand;
@Value("8")
int ram;
@Value("35000")
double price;

//to inj value in xml we used ref of dep inj now we use @Autowired annotation in annotations- it will go to respective class and  get the obj
@Autowired

Sim sim;//sim is ref var of airtel class 



@Override
public String toString() {
	return "Mobile [brand=" + brand + ", ram=" + ram + ", price=" + price + ", sim=" + sim + "]";
}




	
	
	
}
