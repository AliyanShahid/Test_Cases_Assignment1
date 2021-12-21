package Ap_Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Ap_Assignment1.MyStack;

public class MyStackTesting {
     MyStack obj;
	@Before
	public void setUp() throws Exception {
		obj = new MyStack(5);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception  {
		obj.push(1);
		int ecp=1;
		int out=obj.top();
	Assert.assertEquals(ecp,out);
	
	}
	@Test
	public void test1() throws Exception
	{
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
	    obj.displayStack();
		
	}
	@Test
	public void test2() throws Exception
	{
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
	 //   obj.displayStack();
		try
		{
			obj.push(60);
		}
		catch(Exception e)
		{
			System.out.println("Cannot push,Stack is full.");
			e.printStackTrace();
		}
		int res=obj.top();
		int e=50;
		Assert.assertEquals(e, res);
	}
	@Test
	public void test3() throws Exception
	{
		int s=obj.size();
		
		
		try {
			obj.pop();
			
		}
		catch(Exception e)
		{
	System.out.println("Cannot pop,Stack is empty.");
	         e.printStackTrace();
		}
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		obj.pop();
		int e=40;
		int res=obj.pop();
		Assert.assertEquals(e, res);
	}
	@Test
	public void test4() throws Exception
	{
		try {
			obj.top();
			
		}
		catch(Exception e)
		{
	System.out.println("Stack is empty.");
	         e.printStackTrace();
		}
	}
	}
       

