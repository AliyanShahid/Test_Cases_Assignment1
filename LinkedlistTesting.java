package Ap_Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import Ap_Assignment1.LinkedList;


public class LinkedlistTesting {
         LinkedList obj;
	@Before
	public void setUp() throws Exception {
	    obj=new LinkedList();
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void test0()
	{
		obj.pushBack(1);
		obj.pushBack(2);
		obj.pushBack(3);
		obj.pushBack(4);
		obj.pushBack(5);
		obj.pop(2);
		obj.pop(3);
		obj.pop(0);
		obj.pop(100);
		int [] exp= {2,4};
		
		
		for(int x=0;x<obj.size;x++)
		{
			Assert.assertEquals(exp[x],obj.head.key);
			obj.head=obj.head.next;
		}
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
	}
	@Test
	public void test1() {
		obj.pushBack(1);
		obj.pushBack(2);
		obj.pushBack(3);
		obj.pushBack(4);
		obj.pushBack(5);
		obj.display();
		int [] exp= {2,3,4,5};
		obj.popFront();
		
		for(int x=0;x<obj.size;x++)
		{
			Assert.assertEquals(exp[x],obj.head.key);
			obj.head=obj.head.next;
		}
		
		
	}
	@Test
	public void test2() {
		obj.pushBack(1);
		obj.pushBack(2);
		obj.pushBack(3);
		obj.pushBack(4);
		obj.pushBack(5);
		//obj.display();
		int [] exp= {1,2,3,4,5};
		//obj.popFront();
		
		for(int x=0;x<obj.size;x++)
		{
			Assert.assertEquals(exp[x],obj.head.key);
			obj.head=obj.head.next;
		}
		
		
	}
	@Test
	public void test3()
	{
		obj.pushBack(1);
		obj.pushBack(2);
		obj.pushBack(3);
		obj.pushBack(4);
		obj.pushBack(5);
		obj.display();
		int [] exp= {1,2,3,4};
		obj.popBack();
		
		for(int x=0;x<obj.size;x++)
		{
			Assert.assertEquals(exp[x],obj.head.key);
			obj.head=obj.head.next;
		}
	}
	
	

}
