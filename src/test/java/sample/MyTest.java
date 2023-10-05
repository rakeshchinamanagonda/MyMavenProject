package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void test1()
	{
		MyLogin l = new MyLogin(); 
		Assert.assertEquals(0,l.CheckLogin("abc", "pqr"));
	}
	@Test
	public void test2()
	{
		MyLogin l = new MyLogin(); 
		Assert.assertEquals(1,l.CheckLogin("rak", "abc"));	
	}
	@Test
	public void test3()
	{
		MyLogin l = new MyLogin(); 
		Assert.assertEquals(0,l.CheckLogin("ra", "abc"));	
	}
}
