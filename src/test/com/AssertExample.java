package test.com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AssertExample {
   
	int num;
	String temp,str;
	
	@Before
	public  void setUpClass() {
		num=5;
		temp=null;
		str="welcom to junit";
	} 
	@Test
	public void test() {
		assertEquals("welcom to junit", str);
	//	assertNotNull(temp);
		assertNull(temp);
		assertTrue("welcom to junit".equalsIgnoreCase(str));
	}

}
