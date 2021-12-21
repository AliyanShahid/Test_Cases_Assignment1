package Ap_Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import Ap_Assignment1.StackwithArray;
//import junit.framework.Assert;

public class StackwithArayTesting {
     StackwithArray obj;
	@Before
	public void setUp() throws Exception {
	     obj = new StackwithArray();
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
	       
	       obj.push(10);
	       obj.push(20);
	       obj.push(30);
	       obj.push(40);
	       
	       int [] arr=obj.output();
	       int [] arr_1= {10,20,30,40};
	       for(int x=0;x<obj.output_size();x++)
	       {
	    	   Assert.assertEquals(arr_1[x], arr[x]);
	       }
	       
	}

	@Test
	public void test1() {
	       
	      obj.push(10);
	      obj.push(333);
	      int exp=333;
	      int res=obj.pop();
	      
	      Assert.assertEquals(exp,res);
	      
	}
	@Test
	public void test2() {
	       
	      Assert.assertEquals(-1,obj.pop());
	     // negative
	      obj.display();
	      obj.push(10);
	      //obj.push(20);
	      obj.push(20);
	      obj.push(30);
	      obj.push(40);
	     obj.display();
	      int [] res=obj.output();
	      int [] exp= {10,20,30,40};
	      for(int x=0;x<obj.output_size();x++)
	      {
	    	Assert.assertEquals(exp[x], res[x]);  
	      }
	}
	@Test
	public void test3()
	{
		obj.push(11);
		obj.setpoint(111);
		int [] exp= {0};
		int [] res=obj.output();
		obj.setpoint(505);
		obj.push(5);
		
		
}
}
