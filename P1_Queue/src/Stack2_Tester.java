import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Stack2_Tester {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testPush() {
		Stack2<Integer> s = new Stack2<Integer>();
		for (int i = 1; i <= 10; i++) {
			s.push(i);
		}
		assertEquals(10, s.size());
	}
	
	@Test
	void testPop() {
		Stack2<Integer> s = new Stack2<Integer>();
		for (int i = 1; i <= 10; i++) {
			s.push(i);
		}
		assertEquals(10, s.pop());
	}
	
	
	@Test
	void testSize() {
		Stack2<Integer> s = new Stack2<Integer>();
		for (int i = 1; i <= 10; i++) {
			s.push(i);
		}
		assertEquals(10, s.size());
	}
	
	@Test
	void testPeek() {
		Stack2<Integer> s = new Stack2<Integer>();
		for (int i = 1; i <= 6; i++) {
			s.push(i);
		}
		s.pop();
		assertEquals(5, s.peek());
	}

}
