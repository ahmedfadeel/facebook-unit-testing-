package test.com;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Demo;

public class DemoTest {
	
	
	@Before
	public void setUp() {
		
		System.out.println("i am running before any method ");
		
	}
	@BeforeClass
	public static void setUpClass() {
		System.out.println("iam running once before class ");
	}
	
	@Test
	public void testcompareString() {
		Demo demo=new Demo();
		assertTrue(demo.compareString("hello", "hello"));
	}
	
	@Test
	public void testConcatString() {
		Demo demo=new Demo();
		// assertEquals(" concatString feature works ", "helloworld", demo.concatString("hello"));
	}
	
	
	
	

}
