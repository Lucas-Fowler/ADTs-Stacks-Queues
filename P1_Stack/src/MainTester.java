import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTester {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	
	@Test
	void testSize() {
		//fail("Not yet implemented");
		Stack<Integer> temp = new Stack<Integer>();
		
		//assertEquals(expected, actual)
		assertEquals(0, temp.size());
	}

	
	@Test
	void testPush() {
		Stack<Integer> temp = new Stack<Integer>();
		temp.push(2);
		temp.push(5);
		
		assertEquals(5, temp.pop());
	}
	
	
	@Test
	void testPop() {
		Stack<Integer> temp = new Stack<Integer>();
		// test when the Stack is empty
		assertEquals(null, temp.pop());
		
		temp.push(2);
		temp.push(3);
		//test when there are elements in Stack
		assertEquals(3, temp.pop());	
	}
	
	
	@Test
	void testEmpty() {
		Stack<Integer> temp = new Stack<Integer>();
		
		assertEquals(true, temp.empty());
	}
	
	
	@Test
	void testPeek() {
		Stack<Integer> temp = new Stack<Integer>();
		temp.push(2);
		temp.push(7);
		temp.push(6);
		temp.push(1);
		temp.push(23);
		assertEquals(23, temp.peek());
	}
	
}
