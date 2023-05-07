package spring_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		
		
		//if no calling obj,the object created bcz it eager (application context)
		
//if it is @Lazy write context.getbean("mobile); bcz even though it is Applicationcontext we are telling to create object late by using @Lazy anno 
		//By default the lazy is false
		Mobile mobile=(Mobile)context.getBean("mobile");
		System.out.println(mobile);
	}

}
