/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Hau Yong Tian Ben
 * Student ID: 21045028
 * Class: W64P
 * Date/Time created: Friday 27-05-2022 11:57
 */

package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Hau Yong
 *
 */
class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
	}
	@Test
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	
	@Test
	void testAdd() {
			int a = 4321;
			int b = 1234;
				
			Calculator cal = new Calculator();
			int actual = cal.add(a, b); 
				 
			int expected = 5555;
			assertEquals (expected, actual);
			}
	
	@Test
	void testSubtract() {
			int a = 1000;
			int b = 12;
				
			Calculator cal = new Calculator();
			int actual = cal.subtract(a, b); 
				 
			int expected = 998;
			assertEquals (expected, actual);
			}
	@Test
	void testMultiple() {
			int a = 1000;
			int b = 2;
			Calculator cal = new Calculator();
			int actual = cal.multiple(a, b); 
				 
			int expected = 2000;
			assertEquals (expected, actual);
			
			}
	
	@Test
	void testDivide() {
			int a = 1000;
			int b = 2;
			if(b == 0) {
				fail("It was divided by 0");
			}else {
			Calculator cal = new Calculator();
			int actual = cal.divide(a, b); 
				 
			int expected = 500;
			assertEquals (expected, actual);
			}
		}
	

}
