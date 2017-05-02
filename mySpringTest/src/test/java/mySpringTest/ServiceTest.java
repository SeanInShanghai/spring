package mySpringTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.programcreek.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:*.xml"})
public class ServiceTest {
	@Autowired
	UserService userService;
	
	@Test
	public void userNameNumberTest(){
		int num = userService.countUserNumberByName("sean");
		System.out.println(num);
	}
	
}
