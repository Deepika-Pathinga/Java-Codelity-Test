/*
 * Write a java program to implement your own stack data structure to store 
 * any number of items. And implement the following operations 
 * 1.push 2. pop 3. peek 4.display stack content
 * 
 */
package test.sep11_2020;
public class Q10_Dynamic_Stack {

	private int stackSize;
 private int[] stackArr;
 private int top;

 /**
  * constructor to create stack with size
  * @param size
  */
 public Q10_Dynamic_Stack(int size) {
     this.stackSize = size;
     this.stackArr = new int[stackSize];
     this.top = -1;
 }

 /**
  * This method adds new entry to the top 
  * of the stack
  * @param entry
  * @throws Exception 
  */
 public void push(int entry){
     if(this.isStackFull()){
         System.out.println(("Stack is full. Increasing the capacity."));
         this.increaseStackCapacity();
     }
     System.out.println("Adding: "+entry);
     this.stackArr[++top] = entry;
 }

 /**
  * This method removes an entry from the 
  * top of the stack.
  * @return
  * @throws Exception 
  */
 public int pop() throws Exception {
     if(this.isStackEmpty()){
         throw new Exception("Stack is empty. Can not remove element.");
     }
     int entry = this.stackArr[top--];
     System.out.println("Removed entry: "+entry);
     return entry;
 }
  
 /**
  * This method returns top of the stack
  * without removing it.
  * @return
  */
 public long peek() {
 	System.out.println("Stack peeking:");
     return stackArr[top];
 }

 private void increaseStackCapacity(){
      
     int[] newStack = new int[this.stackSize*2];
     for(int i=0;i<stackSize;i++){
         newStack[i] = this.stackArr[i];
     }
     this.stackArr = newStack;
     this.stackSize = this.stackSize*2;
 }
  
 /**
  * This method returns true if the stack is 
  * empty
  * @return
  */
 public boolean isStackEmpty() {
     return (top == -1);
 }

 /**
  * This method returns true if the stack is full
  * @return
  */
 public boolean isStackFull() {
     return (top == stackSize - 1);
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q10_Dynamic_Stack stack = new Q10_Dynamic_Stack(2);
     for(int i=1;i<=10;i++){
         stack.push(i);
     }   
        
   
    System.out.println(stack.peek());
    // System.out.println("Stack Size"+stack.stackSize);
     for(int i=1;i<4;i++){
         try {
             stack.pop();
         } catch (Exception e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
     }
     System.out.println("Stack Display");
     for(int i=stack.top;i>=0;i--) {
     	System.out.println(stack.stackArr[i]);
     }
 }


}

