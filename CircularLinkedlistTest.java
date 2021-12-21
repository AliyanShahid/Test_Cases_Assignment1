package Ap_Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Ap_Assignment1.CircularLinkedList;

public class CircularLinkedlistTest {
   CircularLinkedList obj1;
	@Before
	public void setUp() throws Exception {
	obj1=new  CircularLinkedList();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		obj1.pushBack(1);
		obj1.pushBack(2);
		obj1.pushBack(3);
		obj1.pushBack(4);
		obj1.pushBack(5);
		obj1.display();
		
	}
	@Test
	public void test1() {
		obj1.pushFront(1);
		obj1.pushFront(2);
		obj1.pushFront(3);
		obj1.pushFront(5);
		obj1.pushFront(6);
	}
	@Test
	public void test2() {
		obj1.pushFront(1);
		obj1.pushFront(2);
		obj1.pushFront(3);
		obj1.pushFront(5);
		obj1.pushFront(6);
		obj1.popBack();
		obj1.popBack();
		obj1.popFront();
	}
	@Test
	public void test3()
	{
		obj1.popBack();
		obj1.popFront();
	}
}
