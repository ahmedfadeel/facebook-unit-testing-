package test.com;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

import model.Demo;
public class UserTest {

	@Test
	public void testFirstFeature() {
		Demo demo=new Demo();
		assertTrue("hello , heello success" , demo.compareString("hello", "heloo"));
	}
	
	

}
