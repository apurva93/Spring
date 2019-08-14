package com.apurva;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Car c = new Car();
			//c.drive();
		//Vehicle obj = new Car();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Vehicle obj = (Vehicle) context.getBean("Vehicle1");
		//Vehicle obj = (Vehicle) context.getBean("bike");
		//obj.drive();
		//Car c = (Car) context.getBean("Vehicle1");
		System.out.println(obj);
	}

}
