package Ap_Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Ap_Assignment1.QueuewithArray;

public class QueueWithArrayTest {
       QueuewithArray obj;
	@Before
	public void setUp() throws Exception {
	obj = new QueuewithArray(5);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		obj.enqueue(5);
		obj.display();
		obj.dequeue();
		obj.dequeue();
		int [] exp= {1,2,3};
		
	}
	@Test
	public void test1()
	{
		obj.display();
		
	}

}
