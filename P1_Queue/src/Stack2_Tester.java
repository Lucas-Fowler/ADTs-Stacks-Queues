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
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", s.toString());
		
	}
	
	@Test
	void testPop() {
		Stack2<Integer> s = new Stack2<Integer>();
		for (int i = 1; i <= 10; i++) {
			s.push(i);
		}
		s.pop();
		assertEquals(10, s.pop());
	}

}
