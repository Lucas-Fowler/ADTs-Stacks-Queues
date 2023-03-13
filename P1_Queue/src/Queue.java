import java.util.ArrayList;
public class Queue<T> {
	//Implement a queue w/ stacks
	//Stack  last in first out
	//Queue first in first out
	
	
	    /* to be completed */
	    //instance variables
	    Stack<T> enqueue;
	    Stack<T> dequeue;
	    /* to be completed */
	    //constructor
	    public Queue() {
	        enqueue = new Stack<T>();
	        dequeue = new Stack<T>();
	    }
	    
	    //remove and return the element at the beginning of the list
	    public T remove(){
	    	if (enqueue.size()==0) {
	    		return null;
	    	} else {
	    		while (enqueue.size() > 0) {
	    			dequeue.push(enqueue.pop()); //push everything from enqueue to the dequeue
	    		} //if Stack is (1, 2, 3, 4, 5) after this loop dequeue is (5, 4, 3, 2, 1)
	    		T i = dequeue.pop(); //pop from the top of dequeue is the 1st element in enqueue
	    		while (dequeue.size() > 0) {  //this loop puts everything from the dequeue back into the enqueue
 	    			enqueue.push(dequeue.pop());
	    		}
	    		return i;
	    	}
	    }


	    //add element at the end of the list
	    public void add(T el){
	      /* to be completed */
	        enqueue.push(el);
	    }

	    //return a String representation of the list
	    //formatted as [el1, el2, el3, ..., elN]
	    public String toString(){
	        String str = "[";
	        if (enqueue.empty()==true) {
	        	return "[]";
	        }
	        while (enqueue.size()>0) {
	    		dequeue.push(enqueue.pop()); //push everything from enqueue to the dequeue (first element of enqueue on top of the dequeue stack)
	    	}
	        while (dequeue.size() > 1) { //loop till the last element because you can't have a ", " for the last element of the toString
	        	T el = dequeue.pop(); //make a variable for the top element of the dequeue stack 
	        	str += el + ", "; //add this variable to str
	        	enqueue.push(el); //put the top element of the dequeue stack back to the enqueue stack
	        }
	        T el = dequeue.pop(); //make a variable for the last element of the dequeue stack
        	str += el; //add the last element of the dequeue stack to str
        	enqueue.push(el); //add the last element of the dequeue stack back to the enqueue stack
	        str += "]"; //close off the toString with another "]"
	        return str;
	    }

	    public boolean empty() {
			if (enqueue.size() == 0) {
				return true;
			}
			return false;
		}
	    
	    public int size(){
	        return enqueue.size();
	    }

	}

