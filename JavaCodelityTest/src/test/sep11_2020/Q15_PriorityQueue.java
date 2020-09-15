package test.sep11_2020;

import java.util.NoSuchElementException;

public class Q15_PriorityQueue {
	private static int[] innerArray;
    private int size;
    public Q15_PriorityQueue() {
        this.innerArray = new int[10];
        size = 0;
    }
    public void enqueue(int x) {
        // If it is empty, insert in front
        if (size == 0) {
            size++;
            innerArray[0] = x;
            return;
        }
        // If full, we'll have to double the array
        if (size() == innerArray.length)
            doubleArray();
        // Looping through
        int temp = x;
        for (int i = 0; i < size; i++) {
            // If priority is higher, ie. values is lower, we shift.
            if (x <= innerArray[i]) {
                int next;
                temp = innerArray[i];
                innerArray[i] = x;
                // Shifting
                while (i < size - 1) {
                    next = innerArray[i + 1];
                    innerArray[i + 1] = temp;
                    temp = next;
                    i++;
                }
                break;
            }
        }
        // Placing, increasing size.
        innerArray[size] = temp;
        size++;
    }
    public int dequeue() {
        // NoSuchElement
        if (isEmpty())
            throw new NoSuchElementException("The queue is empty");
        // Storing first int for return
        int retValue = innerArray[0];
        // Shifting all values downwards
        for (int i = 1; i < size; i++) {
            innerArray[i - 1] = innerArray[i];
        }
        innerArray[size - 1] = 0;
        size--;
        return retValue;
    }
    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException("The queue is empty");
        return innerArray[0];
    }
    public boolean contains(int x) {
        // Check for empty.
        if (isEmpty())
            return false;
        // Looping through the positions which contains inserted values,
        // ignoring trailing default 0 values.
        for (int i = 0; i < size; i++) {
            // Comparing
            if (innerArray[i] == x)
                return true;
        }
        // None found
        return false;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    private void doubleArray() {
        int[] newArr = new int[innerArray.length * 2];
        for(int i = 0; i < innerArray.length; i++) {
            newArr[i] = innerArray[i];
        }
        innerArray = newArr;
    }
    
    public static void main(String[] args) {
    	Q15_PriorityQueue pq = new Q15_PriorityQueue();
    	pq.enqueue(6);
    	pq.enqueue(1);
    	pq.enqueue(3);
    	
    	System.out.println("Printing according to the priority");
    	for(int i=0;i<pq.size;i++) {
    	System.out.println(innerArray[i]);
    	}
    	
    	pq.dequeue();
    	System.out.println("After removing minimum id holder");
    	for(int i=0;i<pq.size;i++) {
        	System.out.println(innerArray[i]);
        	}
    	System.out.println("Peeking minimum id holder");
    	System.out.println(pq.peek());
    	
	}


}
