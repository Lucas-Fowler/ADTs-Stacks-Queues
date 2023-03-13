import java.util.ArrayList;

public class Stack2<T> {
	Queue<T> q1;
	Queue<T> q2;
	
	public Stack2() {
		q1 = new Queue<T>();
		q2 = new Queue<T>();
	}
	
	public void push(T t) {
		q1.add(t);
	}
	
	public T pop() {
		if (q1.size()==0) {
			return null;
		} else { 
			for (int i = q1.size(); i > 0; i--) {
				q2.add(q1.remove());
			}
			T t = q1.remove();
			for (int i = q2.size(); i >= 0; i--) {
				q1.add(q2.remove());
			}
			return t;
		}
	}
	
	
}
