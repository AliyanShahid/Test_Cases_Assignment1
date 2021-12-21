package Ap_Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Ap_Assignment1.LinkedListImplementation;

public class LinkedListImplementationTest {
           LinkedListImplementation obj;
	@Before
	public void setUp() throws Exception {
	       obj=new LinkedListImplementation();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		obj.add(1);
		obj.add(5);
	}
	@Test
	public void tes1t() {
		obj.display();
		obj.pushFront(1);
		obj.pushFront(2);
		obj.pushFront(3);
		obj.pushFront(5);
		obj.pushFront(6);
	}
	@Test
	public void test2() throws Exception
	{
		obj.topFront();
		obj.popFront();
	}
	@Test
	public void test3() throws Exception{
		obj.pushBack(1);
		obj.pushBack(2);
		obj.pushBack(3);
		obj.pushBack(4);
		obj.pushBack(5);
		obj.display();
		int [] exp= {2,3,4,5};
		//obj.popFront();
		
		obj.topBack();
		
		
	}
}
