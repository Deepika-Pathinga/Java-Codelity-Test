package test.sep11_2020;

public class Q14_MyQueue {
	int size;
	int front;
	int rear;
	int items[];
	public Q14_MyQueue(int size) {
		this.size=size;
		items = new int[size];
		rear =-1;
	}
	public void enqueue(int element) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else{	
		rear++;
		items[rear]=element;
		}
	}
	public int dequeue() {
		int deletedItem=-1;
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			deletedItem=items[front];
			front++;
			
			
	}
		return deletedItem ;
		}
	public void display() {
		for(int i=front;i<=rear;i++) {
			System.out.println(items[i]);
		}
	}
	public int frontPeek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			throw new RuntimeException("Queue is empty");
		}else {
			return items[front];
		}
		
	}
	public boolean isEmpty() {
		if(rear==-1) {
			return true;
		}
		else return false;
	}
	public boolean isFull() {
		if(rear==size-1) {
			
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		
		Q14_MyQueue mq = new Q14_MyQueue(5);
mq.enqueue(10);
mq.enqueue(20);
mq.enqueue(30);
mq.enqueue(40);
mq.enqueue(50);
System.out.println("Displayed inserted items");
mq.display();
System.out.println("After deletion");
mq.dequeue();
System.out.println("displaying remaining elements in queue");
mq.display();
System.out.println("peeking the element "+mq.frontPeek());


	}

}
