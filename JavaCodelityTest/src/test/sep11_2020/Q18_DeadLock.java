/*
 * 18. What is the cause of deadlock in java multithreading. 
 * Write a program to create deadlock between two threads
 * 
 * Deadlock is a condition in java multithreading where two or more threads wait for each other to release the resources or lock.
 * Since, both threads are waiting for each other to release the resources or lock, the condition is called deadlock.
 */

package test.sep11_2020;

public class Q18_DeadLock {

	 public static void main(String[] args) {  
		    final String resource1 = "Resource1";  
		    final String resource2 = "Resource2";  
		    
		    // t1 tries to lock resource1 then resource2  
		    Thread t1 = new Thread() {  
		      public void run() {  
		          synchronized (resource1) {  
		           System.out.println("Thread 1: locked resource 1");  
		  
		           try { Thread.sleep(100);} catch (Exception e) {}  
		  
		           synchronized (resource2) {  
		            System.out.println("Thread 1: locked resource 2");  
		           }  
		         }  
		      }  
		    };  
		  
		    // t2 tries to lock resource2 then resource1  
		    Thread t2 = new Thread() {  
		      public void run() {  
		        synchronized (resource2) {  
		          System.out.println("Thread 2: locked resource 2");  
		  
		          try { Thread.sleep(100);} catch (Exception e) {}  
		  
		          synchronized (resource1) {  
		            System.out.println("Thread 2: locked resource 1");  
		          }  
		        }  
		      }  
		    };  
		  
		      
		    t1.start();  
		    t2.start();  
		  }  

}
