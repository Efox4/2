


import javax.swing.JOptionPane;


public class LLQueueTest {
	public static void main(String[] args) {
		// Create a Queue
		Queue q = new LLQueue();
		Queue r = new ArrayQueue(5);
		
		// Put some strings onto the queue. Put large amount of objects in queue
		JOptionPane.showMessageDialog(null, "About to enqueue words onto queue: \nThe end is nigh!");
		for(int x = 0; x<5; x++) {
		q.enqueue("The");
		q.enqueue("end");
		q.enqueue("is");
		q.enqueue("nigh!");}

		// Now dequeue them from the queue
		JOptionPane.showMessageDialog(null, "About to dequeue the words ...");
		while(! q.isEmpty()) {
			String word = (String) q.dequeue(); // Note: have to cast Objects popped to String
			
		}
		
		//test to deque while queue is empty
		 //empty queue
		JOptionPane.showMessageDialog(null, "About to dequeue the words ...");
		
			q.dequeue(); // Note: have to cast Objects popped to String
			
		
		
		//Equeueing only null values
		q.enqueue(null);
		q.enqueue(null);
		q.enqueue(null);
		q.enqueue(null);
		q.enqueue("dhdh");
		
	
		
		//Dequeueing null values
		JOptionPane.showMessageDialog(null, "About to dequeue the words ...");
		while(! q.isEmpty()) {
			 q.dequeue(); // Note: have to cast Objects popped to String
			
		}
		
		//enqueueing extreme values
		q.enqueue(1000000000);
		q.dequeue();
		q.enqueue(-1000000000);
		q.dequeue();
		q.enqueue("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhh!!!!!!!");
		while(! q.isEmpty()) {
			 q.dequeue(); 
			
		} 
		
		//enqueue same items on to arrayQueue and LLQueue and compare result when items are popped.
		r.enqueue("The");
		r.enqueue("end");
		r.enqueue("is");
		r.enqueue("not");
		r.enqueue("here");
		q.enqueue("The");
		q.enqueue("end");
		q.enqueue("is");
		q.enqueue("not");
		q.enqueue("here");
		r.dequeue();
		r.dequeue();
		r.dequeue();
		r.dequeue();
		r.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		
		System.exit(0);
	}

}