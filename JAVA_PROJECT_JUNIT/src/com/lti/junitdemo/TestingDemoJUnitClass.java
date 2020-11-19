package com.lti.junitdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

public class TestingDemoJUnitClass {
	
	@Test
	public void testCompanyName() {
		fail("Not implemented");
	}
	@Test
    public void testEmptyArrayList() 
    {
       ArrayList<Integer> al = new ArrayList<Integer>();              
       assertEquals (0,al.size());
       assertTrue(al.isEmpty());  // assertTrue Method
       //assertFalse(al.isEmpty());
       }
    @Test
    public void testIntArrayList()
    {
       ArrayList<Integer> myary = new ArrayList<Integer>();
       myary.add(5);
       myary.add(-14);
       myary.add(29);
       assertEquals("Cheking size",3,myary.size());
     //  assertEquals(5,myary.get(0));
    //  assertEquals((Integer)5,myary.get(0));
    ///   assertEquals((Integer)(-14),myary.get(1));
     //  assertFalse(myary.isEmpty());
           }

}
