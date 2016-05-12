import java.util.Stack;

public class QueueUsingStacks<E> {
	private Stack<E> inbox;
	private Stack<E> outbox;
	
	public QueueUsingStacks() {
		inbox = new Stack<E>();
		outbox = new Stack<E>();
	}
	
	public void enque(E x){
		inbox.push(x);
	}
	
	public E deque() {
		if (outbox.isEmpty()) {
			for ( ; !inbox.isEmpty() ; outbox.push(inbox.pop()))
				;
		}
		
		return outbox.pop();
	}
	
	public static void main(String args[]) {
		QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();
		int i ,n = 10;
		for ( i = 0 ; i < n ; i++)
			queue.enque(i);
		
		
		System.out.print(queue.inbox);
		System.out.println(queue.outbox);
		queue.deque();
		
		System.out.print(queue.inbox);
		System.out.println(queue.outbox);
		
		queue.enque(17);
		
		System.out.print(queue.inbox);
		System.out.println(queue.outbox);
		queue.deque();
		queue.deque();
		queue.deque();
		
		System.out.print(queue.inbox);
		System.out.println(queue.outbox);
	}
}