package com.springbean;
	
		import org.springframework.context.ApplicationContext;
		import org.springframework.context.support.ClassPathXmlApplicationContext;

		public class Mainapp {
		   public static void main(String[] args) {
		      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		      Hello objA = (Hello) context.getBean("hello");

		      objA.setMessage("spring bean example");
		      objA.getMessage();

		      Hello1 objB = (Hello1) context.getBean("helloworld");
		      objB.setName("kavya");
		      objB.getName();
		   }

	}


