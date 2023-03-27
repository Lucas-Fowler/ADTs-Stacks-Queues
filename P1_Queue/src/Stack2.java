import java.util.ArrayList;

public class Stack2<T> {
	Queue<T> q1;
	Queue<T> q2;
	
	public Stack2() {
		q1 = new Queue<T>();
		q2 = new Queue<T>();
	}
	
	public void push(T t) {
		q1.add(t); //add to the end of the queue
	}
	
	public T pop() {
		if (q1.size()==0) {
			return null;
		} else {
			while (q1.size() > 1) {
				q2.add(q1.remove());  //remove the bottom element from q1 and add it to q2 except for the last element in q1 (shows up in q2 in the same order) 
			}
			T t = q1.remove(); //make a variable for the last element in q1 and remove it
			while (q2.size() > 0) { 
				q1.add(q2.remove()); //remove everything from q2 and add it back to q1
			} 
			return t; //return what is being popped
		}
	}
	
	public T peek() {
		if (q1.size()==0) {
			return null;
		} else {
			while (q1.size() > 1) {
				q2.add(q1.remove());  //remove the bottom element from q1 and add it to q2 except for the last element in q1 (shows up in q2 in the same order) 
			}
			T t = q1.remove();
			q2.add(t);
			while (q2.size() > 0) { 
				q1.add(q2.remove()); //remove everything from q2 and add it back to q1
			}
			return t;
		}
	}
	
	public int size() {
		return q1.size();
	}
	
	
}
