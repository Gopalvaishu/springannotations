package spring_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//configuration means u are writing bean tag and definitions and component scan will specify the package
@Configuration
@ComponentScan("spring_annotations")
public class MyConfig {
	//whatever we did in xml the same thing we need to do here and deleting xml file and by using @Congiguration annotation
	//@Bean 
	//method name getSim and sim is return type 
	@Bean
	public Sim getSim() {
		return new Jio();
	}

}
