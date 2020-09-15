package test.sep11_2020;

public class Q11_CreateNode {
	private Q11_CreateNode pointer;
	private int data;
	public Q11_CreateNode() {
		pointer=null;
		data=Integer.MIN_VALUE;
	}
	public Q11_CreateNode(int data) {
		this.data=data;
		this.pointer=null;
	}
	@Override
	public String toString() {
		return "CreateNode [ data=" + data + "]";
	}
	public Q11_CreateNode getPointer() {
		return pointer;
	}
	public void setPointer(Q11_CreateNode pointer) {
		this.pointer = pointer;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}


}

