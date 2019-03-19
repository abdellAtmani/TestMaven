package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utils.UtilsMath;

public class UtilsMathTest {
	protected UtilsMath mat;
	
	@Before
	public void setUp() throws Exception {
		mat =new UtilsMath();
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("reussi");
	}

	@Test
	public void testAddition() throws Exception {
		assertEquals(new Long(4), mat.addition(new Long(1), new Long(3)));
		
	}
	
	@Test
	public void testProduit() throws Exception {
		assertEquals(new Long(6),mat.produit(new Long(2), new Long(3)));
	}
	

}
