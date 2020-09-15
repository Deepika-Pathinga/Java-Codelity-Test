package test.sep11_2020;

import java.util.Arrays;

public class Q07_MyArrayList {
	private Object[] myStore;
    private int actSize = 0;
     
    public Q07_MyArrayList(){
        myStore = new Object[10];
    }
     
    public Object get(int index){
        if(index < actSize){
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
     
    public void add(Object obj){
        if(myStore.length-actSize <= 5){
            increaseListSize();
        }
        myStore[actSize++] = obj;
    }
     
    public Object remove(int index){
        if(index < actSize){
            Object obj = myStore[index];
            myStore[index] = null;
            int tmp = index;
            while(tmp < actSize){
                myStore[tmp] = myStore[tmp+1];
                myStore[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
         
    }
     
    public int size(){
        return actSize;
    }
     
    private void increaseListSize(){
        myStore = Arrays.copyOf(myStore, myStore.length*2);
       // System.out.println("\nNew length: "+myStore.length);
    }
     
    public static void main(String a[]){
        Q07_MyArrayList students = new Q07_MyArrayList();
        students.add(new Q07_Student(1, "Student1", (long) 400));
        students.add(new Q07_Student(2, "Student2", (long) 420));
        students.add(new Q07_Student(3, "Student3", (long) 410));
        students.add(new Q07_Student(4, "Student4", (long) 390));
        students.add(new Q07_Student(5, "Student5", (long) 329));
       
        for(int i=0;i<students.size();i++){
            System.out.print(students.get(i)+" ");
            System.out.println();
        }
       
        System.out.println();
       System.out.println("Element at Index 1: "+students.get(1));
       System.out.println("Array List size: "+students.size());
        System.out.println("Removing element at index 2: "+students.remove(2));
        System.out.println();
       for(int i=0;i<students.size();i++){
            System.out.print(students.get(i)+" ");
            System.out.println();
       }
    }
}
