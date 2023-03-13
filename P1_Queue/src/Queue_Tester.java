import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Queue_Tester {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testRemove() {
		Queue<Integer> q = new Queue<Integer>();
		for (int i = 1; i <= 5; i++) {
			q.add(i);
			System.out.println(i);
		}
		assertEquals(1, q.remove());
	}
	
	@Test
	void testAdd() {
		Queue<Integer> q = new Queue<Integer>();
		q.add(11);
		assertEquals(11, q.remove());
	}
	
	@Test
	void testToString() {
		Queue<Integer> q = new Queue<Integer>();
		for (int i = 1; i <= 10; i++) {
			q.add(i);
		}
		System.out.println(q);
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", q.toString());
	}
	
	@Test
	void testSize() {
		Queue<Integer> q = new Queue<Integer>();
		for (int i = 0; i < 10; i++) {
			q.add((int)(Math.random() * 20));
		}
		assertEquals(10, q.size());
	}
	
}
