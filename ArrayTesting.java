package Ap_Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Ap_Assignment1.Array;

public class ArrayTesting {

	Array obj2;
	@Before
	public void setUp() throws Exception {
	  obj2 = new Array();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		obj2.set(6);
		int [] array1= {1,2,3,4,5,6};
		int [] expected= {1,2,3,4,5};
	    obj2.delete(6);
	}
	@Test
 public void test1()
 {
		obj2.set(5);
		int [] array1= {1,2,3,4,5};
		obj2.delete(3);
		obj2.display();
 }
	@Test
	public void test3()
	{
		int [] array1= {4,8,6,1,3,2};
		obj2.setlinear(array1,6);
		Assert.assertEquals(true,obj2.linearSearch(2));
		Assert.assertEquals(false,obj2.linearSearch(5));
	     obj2.bubbleSort();
	}
	@Test
	public void test4()
	{
		int [] array2= {1,2,3,4,5,6,7,8,9,10};
		obj2.setlinear(array2, 10);
		Assert.assertEquals(true,obj2.binarySearch(9, 8, 10));
		Assert.assertEquals(false, obj2.binarySearch(1, 5, 0));
		Assert.assertEquals(true,obj2.binarySearch(10, 0, 10));
	}
	@Test
	public void test5()
	{
		int [] aray3= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		obj2.get();
		obj2.set(20);
	     obj2.setarray(aray3,20);
	     obj2.insert(10,1);
	     int [] exp = {1,10,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
	    		 ,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	     int [] arr1 = obj2.get();
	     
	     for(int i=0;i<100;i++)
	     {
	    	 System.out.print(arr1[i] + " ");
	     }
	     Assert.assertArrayEquals(exp,arr1);
	     }
	
		
	}

