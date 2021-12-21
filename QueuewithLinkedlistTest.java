package Ap_Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Ap_Assignment1.QueuewithLinkedlist;

public class QueuewithLinkedlistTest {
    QueuewithLinkedlist obj1;
	@Before
	public void setUp() throws Exception {
	obj1 = new QueuewithLinkedlist();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		obj1.enqueue(1);
		obj1.enqueue(2);
		obj1.enqueue(3);
		obj1.enqueue(4);
		obj1.enqueue(5);
		obj1.enqueue(6);
		obj1.dequeue();
		obj1.dequeue();
		obj1.dequeue();
		obj1.display();
		/*
		 * int [] exp= {1,2,3}; Assert.assertEquals(exp[1],obj1.head.key);
		 * obj1.head=obj1.head.next;
		 */
	}
	@Test
	public void test1()
	{
		obj1.display();
		Assert.assertEquals(-1,obj1.dequeue());
	}

}
