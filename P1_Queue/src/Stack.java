import java.util.ArrayList;

public class Stack<T> {
	//use an arrayList as the backend structure
	//1) ------------- instance vars
	
	ArrayList<T> data;
	public Stack() {
		//2) What should the constructor do?
		data = new ArrayList<T>();
	}
	
	
	//Add to the Stack
	public void push(T t) {
		data.add(t);
	}
	
	
	//Pop from the stack if not empty
	public T pop() {
		if (data.size() == 0) {
			return null;
		} else {
			T t = data.remove(data.size()-1);
			return t;
		}
	}
	
	
	//return the # of elements in the stack
	public int size() {
		return data.size();
	}
	
	
	public boolean empty() {
		if (data.size() == 0) {
			return true;
		}
		return false;
	}
	
	public T peek() {
		T i = data.get(data.size()-1);
		return i;
	}
	
}
