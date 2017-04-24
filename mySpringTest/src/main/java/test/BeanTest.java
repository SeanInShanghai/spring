package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.programcreek.bean.HelloWorld;

public class BeanTest {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorld hello = (HelloWorld)context.getBean("helloworld");
		hello.setMessage("hello china");
		System.out.println(hello.getMessage());
	}

}
