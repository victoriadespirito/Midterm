package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.*;


public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		ArrayList<Staff> staffTest= new ArrayList<Staff>();
		
		Staff a = new Staff(null);
		a.setSalary(95000);
		staffTest.add(a);
		
		Staff b = new Staff(null);
		b.setSalary(90000);
		staffTest.add(b);

		Staff c = new Staff(null);
		c.setSalary(85000);
		staffTest.add(c);
		
		Staff d = new Staff(null);
		d.setSalary(75000);
		staffTest.add(d);
		
		Staff e = new Staff(null);
		e.setSalary(70000);
		staffTest.add(e);
		
		double average = ((a.getSalary() + b.getSalary() + c.getSalary() + d.getSalary() + e.getSalary()) / 5);
		double actual = 83000;
				
				
		assertEquals(actual, average, .000000000001);
	}	

	@Test(expected=PersonException.class)
	public void testBadPhoneNumber() throws PersonException {

		String ex = "111111";
		
		Staff member1 = new Staff(null);
		member1.setPhone(ex);
		
		
}
	@Test
	public void testPhoneNumber() {

		String correct = "111 111 1111";
		
		Staff member1 = new Staff(null);
		try {
			member1.setPhone(correct);
			
			String strActualPhone = member1.getPhone();
			
			assertEquals(correct,strActualPhone);
			
		} catch (PersonException e) {
			fail("Exception Thrown");
		}
		
		
}	

	@Test
	public void testDOB() {

		
		boolean caught = false;
		try {
			setDOB(1931, 4, 06);
		} catch (Exception e) {
			caught = true;
		}
		
		assertTrue(caught);
		
		
}

	private void setDOB(int i, int j, int k) {
		// Auto-generated method stub
		
	}
}