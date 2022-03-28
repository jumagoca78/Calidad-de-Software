/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 *//* */

import org.junit.Test;
import static org.junit.Assert.*;


public class DemoTest {
	
	//first we test a triangle that is a triangle
		@Test
		public void orderTest1_isTriangle () {
			assertTrue (Triangle.isTriangle(15, 5, 11));	
		}
		
	//Permute values to check if a triangle with these values is always ok
		@Test
		public void orderTest2_isTriangle () {
			assertTrue (Triangle.isTriangle(15, 11,5));	
		}
		@Test
		public void orderTest3_isTriangle () {
			assertTrue (Triangle.isTriangle(11, 15, 5));	
		}
		
		@Test
		public void orderTest4_isTriangle () {
			assertTrue (Triangle.isTriangle(11, 5, 15));	
		}
		
		@Test
		public void orderTest5_isTriangle () {
			assertTrue (Triangle.isTriangle(5, 11, 15));	
		}
		
		@Test
		public void orderTest6_isTriangle () {
			assertTrue (Triangle.isTriangle(5, 15, 11));	
		}
		
		//After running these values it always work so no problem 
		
		@Test
		public void orderTest1_isNotTriangle () {
			assertFalse (Triangle.isTriangle(8,2,1));	
		}
		
		@Test
		public void orderTest2_isNotTriangle () {
			assertFalse (Triangle.isTriangle(8,1,2));	
		}
		@Test
		public void orderTest3_isNotTriangle () {
			assertFalse (Triangle.isTriangle(2,8,1));	
		}
		@Test
		public void orderTest4_isNotTriangle () {
			assertFalse (Triangle.isTriangle(2,1,8));	
		}
		@Test
		public void orderTest5_isNotTriangle () {
			assertFalse (Triangle.isTriangle(1,2,8));	
		}
		@Test
		public void orderTest6_isNotTriangle () {
			assertFalse (Triangle.isTriangle(1,8,2));	
		}
		
		//Test para probar que un triangulo es equilatero
		
		@Test
		public void testEquilateral () {
			assertTrue (Triangle.isEquilateral(1, 1, 1));
		}
		
		//Test para probar que un triangulo es escaleno
		
		
		@Test
		public void testScalane1 () {
			assertTrue (Triangle.isEscalane(11, 5, 15));
		}
		
		@Test
		public void testScalane2 () {
			assertTrue (Triangle.isEscalane(11, 15,5));
		}
		@Test
		public void testScalane3 () {
			assertTrue (Triangle.isEscalane(5, 15,11));
		}
		@Test
		public void testScalane4 () {
			assertTrue (Triangle.isEscalane(5, 11, 15));
		}
		@Test
		public void testScalane5 () {
			assertTrue (Triangle.isEscalane(15, 5, 11));
		}
		@Test
		public void testScalane6 () {
			assertTrue (Triangle.isEscalane(15, 11, 5));
		}
		
		//Test para probar que un triangulo es isosceles
		
		
		@Test
		public void testIsosceles1 () {
			assertTrue (Triangle.isIsoceles(3, 3, 1));
		}
				
		@Test
		public void testIsosceles2 () {
			assertFalse (Triangle.isIsoceles(3, 1,3));
		}
		
		@Test
		public void testIsosceles3 () {
			assertTrue (Triangle.isIsoceles(1, 3,3));
		}
				
		
		
		//probar con negativos
		@Test
		public void testNegativos () {
			assertFalse (Triangle.isEquilateral(-1, -1, -1)); 
		}
		
		//probar con ceros
		@Test
		public void testCeros () {
			assertFalse (Triangle.isEquilateral(0, 0, 0)); 
		}
		
		
		
		
		


}
