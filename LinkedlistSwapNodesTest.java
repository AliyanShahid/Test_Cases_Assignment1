package Ap_Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Ap_Assignment1.LinkedListSwapNodes;
public class LinkedlistSwapNodesTest {
       LinkedListSwapNodes obj;
	@Before
	public void setUp() throws Exception {
	obj = new LinkedListSwapNodes();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		obj.pushFront(1);
		obj.pushFront(2);
		obj.pushFront(3);
		obj.pushFront(5);
		obj.pushFront(6);
		
		int [] exp = {6,5,3,2,1};
		for(int x=0;x<obj.size;x++)
		{
			Assert.assertEquals(exp[x],obj.head.key);
			obj.head=obj.head.next;
		}
         obj.display();
	}
	@Test
	public void test2()
	{
		obj.display();
		obj.pushFront(1);
		obj.pushFront(2);
		obj.pushFront(3);
		obj.pushFront(5);
		obj.pushFront(6);
		obj.swap();
	}

	 
}
