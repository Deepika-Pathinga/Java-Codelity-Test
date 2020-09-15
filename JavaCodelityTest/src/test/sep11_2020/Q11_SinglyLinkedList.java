package test.sep11_2020;

public class Q11_SinglyLinkedList {
	private Q11_CreateNode head;
	private int size;
	
	
	public void add(int element) {
		if(head==null) {
			head= new Q11_CreateNode(element);
		}else
		{
			Q11_CreateNode next=head;
			while(next.getPointer()!=null ) {
				next= next.getPointer();
			}
			next.setPointer(new Q11_CreateNode(element));
		}
		size++;
		}
	
	public void delete(int element) {
		if(head==null) {
		System.out.println("No Elements to delete");	
		}else 
		{
			size--;
			if(head.getData()==element ) {
				head=head.getPointer();
			}else
			{
				Q11_CreateNode next=head;
				Q11_CreateNode previous=head;
				while(next != null && next.getData()!=element) {
					previous = next;
					next= next.getPointer();
				}
				if (next != null && next.getData()==element) {
					previous.setPointer(next.getPointer());
				} else {
					System.out.println("element " + element + " not found in list");
				}
			}
			
		}
	}
	public void display() {
		Q11_CreateNode next=head;
		while(next !=null ) {
			System.out.print(next.getData() + " -> ");
			next= next.getPointer();
		}
		System.out.println();
	}
	
	public void printSize() {
		System.out.println(size);
	}
	 
	public static void main(String[] args) {
		Q11_SinglyLinkedList list = new Q11_SinglyLinkedList();
		list.add(29);
		list.add(16);
		list.add(94);
		list.add(63);
		list.add(74);
		list.display();
		list.delete(29);
		list.display();
		list.delete(83);
		list.display();
		list.delete(94);
		list.display();
		
	}


}
