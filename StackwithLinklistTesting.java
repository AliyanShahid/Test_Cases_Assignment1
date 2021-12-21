package Ap_Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import Ap_Assignment1.StackwithLinklist;
//import junit.framework.Assert;

public class StackwithLinklistTesting {
    StackwithLinklist obj;
	@Before
	public void setUp() throws Exception {
	    obj=new StackwithLinklist();
	}

	@After
	public void tearDown() throws Exception {
	}
   
	@Test
	public void test0()
	{
	   	int siz=obj.getSize();
	   	obj.push(10);
	   	obj.push(20);
	   	obj.push(30);
	   	obj.display();
	   	Assert.assertEquals(30,obj.pop());
	   	Assert.assertEquals(20,obj.pop());
	   	Assert.assertEquals(10,obj.top());
	}
	@Test
	public void test() {
		Assert.assertEquals(-1,obj.top());
	}
	@Test
	public void test1() {
		Assert.assertEquals(-1,obj.pop());
		obj.display();
	}

}
