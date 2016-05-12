import java.util.LinkedList;

public class StackUsingQueues<E> {
	private LinkedList<E> inbox;
	private LinkedList<E> outbox;
	
	StackUsingQueues() {
		inbox = new LinkedList<E>();
		outbox = new LinkedList<E>();
	}
	
	void push(E x){
		inbox.add(x);
	}
	
	E pop(){
		for( ; !inbox.isEmpty() ; outbox.addFirst(inbox.remove()))
			;
		return outbox.remove();
	}	
	
	public static void main(String args[]) {
		StackUsingQueues<Integer> stack = new StackUsingQueues<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		System.out.print(stack.inbox);
		System.out.println(stack.outbox);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.pop();
		System.out.print(stack.inbox);
		System.out.println(stack.outbox);
	}
}