package Ap_Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Ap_Assignment1.ArrayInsertion;

public class ArrayInsertionTest {
   private ArrayInsertion obj;
	@Before
	public void setUp() throws Exception {
		obj = new ArrayInsertion();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	

	@Test
	public void test() {
		int [] array1= {1,2,3,4};
		
	
		int[] expected_ar= {1,2,2,4};
		
		Assert.assertArrayEquals(expected_ar, obj.insert(array1, 2, 2));
		obj.display(array1);
	}
	
	@Test
	public void test1() {
		int [] array2= {1,2,3,4,5,6,7};
		
        obj.set(10);	
		int[] expected_ar1= {1,2,3,4,5,6,7};
		
		Assert.assertArrayEquals(expected_ar1, obj.insert(array2,8,6));
	}

	  @Test 
	  public void test2()
	  {
		  obj.set(0);
		  int [] aray3= {2,3,4,5,6,7,8,9};
		  int [] expected = {1,2,4,5,6,7,8,9};
		  Assert.assertArrayEquals(expected,obj.insert(aray3, 1, 0));
	  }
	
}
