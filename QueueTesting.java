package Ap_Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Ap_Assignment1.Queue;

public class QueueTesting {
    Queue obj;
	@Before
	public void setUp() throws Exception {
	obj =new Queue(10);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception{
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		obj.enqueue(5);
		obj.enqueue(6);
		obj.enqueue(7);
		obj.enqueue(8);
		obj.enqueue(9);
		obj.enqueue(10);
		int [] res=obj.out();
		int [] exp = {1,2,3,4,5,6,7,8,9,10};
		for(int x=0;x<obj.size();x++)
		{
		assertEquals(exp[x],res[x]);
	    }
		obj.display();

}
	@Test
	public void test1() throws Exception
	{
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		obj.enqueue(5);
		obj.enqueue(6);
		obj.enqueue(7);
		obj.enqueue(8);
		obj.enqueue(9);
		obj.enqueue(10);
		obj.remove();
		obj.dequeue();
		obj.dequeue();
		obj.empty();
		int [] res=obj.out();
		int [] exp= {1,2,3,4,5,6,7,8,9};
		for(int x=0;x<obj.size();x++)
		{
		assertEquals(exp[x],res[x]);
	    }
		
	}
	@Test
	public void test3() throws Exception
	{
		
		obj.empty();
		obj.display();
		
	}
	
	
}
