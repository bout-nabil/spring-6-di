package nbo.springframework.spring6di;

import nbo.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

	public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Spring6DiApplication.class, args);
        MyController myController = applicationContext.getBean(MyController.class);
        System.out.println("I'm in Main Method");
        System.out.println(myController.sayHello());
	}

}
