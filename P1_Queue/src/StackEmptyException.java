
public class StackEmptyException extends Exception {
	public String getMessage() {
		return "you can't pop from an empty stack";
	}
}
