package test.sep11_2020;

import java.util.PriorityQueue;
//import java.util.Scanner;

public class Q15Priority {

	public static void main(String[] args) {
		
        PriorityQueue<Q15Student> priorityQueue = new PriorityQueue<>();

        // Add items to the Priority Queue
        priorityQueue.add(new Q15Student("Rajeev", 10l));
        priorityQueue.add(new Q15Student("Chris", 1l));
        priorityQueue.add(new Q15Student("Andrea", 3l));
        priorityQueue.add(new Q15Student("Alex", 5l));
        
        System.out.println("Peeking "+priorityQueue.peek());
        System.out.println("Dequeuing");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
        
      
        
        
        
	  }  
} 

	
