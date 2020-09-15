package test.sep11_2020;

import java.util.Arrays;
import java.util.Comparator;

public class Q15_PQ {
	private class StudentComparator implements Comparator<Q15_Stu> {
		@Override
		public int compare(Q15_Stu o1, Q15_Stu o2) {
			if (o1 == null || o2 == null) {
				return 0;
			} else {
				return o1.getStudentRegNo() - o2.getStudentRegNo();
			}
				
		}

	}

	private Q15_Stu[] items;
	private Comparator<Q15_Stu>comparator;
	private int size;
	private int front, rear;
	
	public Q15_PQ(int size) {
		this.size = size;
		items = new Q15_Stu[size];
		comparator = new StudentComparator();
		front = 0;
		rear = -1;
	}
	
	public void enQueue(Q15_Stu item) {
		if (rear == size-1) {
			System.out.println("Queue is full");
		} else {
			rear++;
			items[rear] = item;
			Arrays.sort(items, comparator);
		}
	}
	
	public Q15_Stu deQueue() {
		if (front > rear) {
			System.out.println("Queue is empty");
			return null;
		} else {
			Q15_Stu item = items[front];
			front++;
			return item;
		}
	}
	
	public Q15_Stu minPeek() {
		if (front > rear) {
			System.out.println("Queue is empty");
			return null;
		} else {
			Q15_Stu item = items[front];
			return item;
		}
	}
	
	public void display() {
		for (int i=front; i<=rear; i++) {
			System.out.println(items[i]);
		}
	}
	
	public static void main(String[] args) {
		Q15_PQ minQueue = new Q15_PQ(10);
		minQueue.enQueue(new Q15_Stu("Amit",12));
		minQueue.enQueue(new Q15_Stu("Bala",11)); 
		minQueue.enQueue(new Q15_Stu("Lilly",13));  
		minQueue.enQueue(new Q15_Stu("Mahesh",14));
		minQueue.enQueue(new Q15_Stu("Shanthi",15));
		System.out.println("***** After Enqueue");
		minQueue.display();
		System.out.println("***** MinPeek");
		System.out.println(minQueue.minPeek());
		minQueue.deQueue();
		System.out.println("***** After Dequeue");
		minQueue.display();
	}

}
