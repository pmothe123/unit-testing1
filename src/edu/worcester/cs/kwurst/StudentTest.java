package edu.worcester.cs.kwurst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	
private Student student1;

	@Before

	public void setUp()
	{
	    student1 = new Student("Jane", "Smith");
	}

	@Test 
	public void testCurrentEarnedCr() { 
	    int credits = 45; 
	    student1.setCurrentEarnedCr(credits); 
	    assertEquals(credits, student1.getCurrentEarnedCr()); 
	}

	@Test 
	public void testAnticipatedAdditionalCr() { 
	    int anticipatedAdditionalCr = 45; 
	    student1.setAnticipatedAdditionalCr(anticipatedAdditionalCr); 
	    assertEquals(anticipatedAdditionalCr, student1.getAnticipatedAdditionalCr()); 
	}
	
	@Test 
	public void testReadyToGraduate1() { 
	    student1.setCurrentEarnedCr(120);
	    student1.setGpa(2.0);
	    student1.setMajorComplete(true);
	    student1.setLascComplete(true);
	    assertTrue(student1.readyToGraduate());
	}
	
	@Test 
	public void testReadyToGraduate2() { 
	    student1.setCurrentEarnedCr(100);
	    student1.setGpa(2.0);
	    student1.setMajorComplete(true);
	    student1.setLascComplete(true);
	    assertFalse(student1.readyToGraduate());
	}
	
	@Test 
	public void testReadyToGraduate3() { 
	    student1.setCurrentEarnedCr(120);
	    student1.setGpa(1.5);
	    student1.setMajorComplete(true);
	    student1.setLascComplete(true);
	    assertFalse(student1.readyToGraduate());
	}
	
	@Test 
	public void testReadyToGraduate4() { 
	    student1.setCurrentEarnedCr(120);
	    student1.setGpa(2.0);
	    student1.setMajorComplete(false);
	    student1.setLascComplete(true);
	    assertFalse(student1.readyToGraduate());
	}
	
	@Test 
	public void testReadyToGraduate5() { 
	    student1.setCurrentEarnedCr(125);
	    student1.setGpa(2.0);
	    student1.setMajorComplete(true);
	    student1.setLascComplete(true);
	    assertTrue(student1.readyToGraduate());
	}
	
	@Test 
	public void testMajorComplete() { 
	    boolean majorComplete = true; 
	    student1.setMajorComplete(majorComplete); 
	    assertEquals(majorComplete, student1.getMajorComplete()); 
	}
	
}
