package Ap_Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Ap_Assignment1.ArrayDeletion;

public class ArrayDeletionTest {

	private ArrayDeletion ar;
	
	@Before
	public void setUp() throws Exception {
		ar = new ArrayDeletion();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		int [] arr = {1,2,3};
		int [] re = ar.delete(arr, 0);
		int [] exop = {2,3,-1};
		
		Assert.assertArrayEquals(re, exop);
	}
	@Test
	public void test1() {
		
		int [] arr1 = {1,2,3,4,5};
		int [] re1 = ar.delete(arr1, -5);
		int [] exop1 = {1,2,3,4,5};
		
		Assert.assertArrayEquals(re1, exop1);
		ar.display(re1);
	}
	

}
