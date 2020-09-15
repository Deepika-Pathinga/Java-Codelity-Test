package test.sep11_2020;

public class Q17_Ticket_Reservation_Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Q17_TicketBooking obj=new Q17_TicketBooking();
        
        Thread thread1=new Thread(obj,"Passenger1 Thread");
        Thread thread2=new Thread(obj,"Passenger2 Thread");
        Thread thread3=new Thread(obj,"Passenger3 Thread");
        Thread thread4=new Thread(obj,"Passenger4 Thread");
        
//        thread1.start();
//        thread1.join(); // signals t2 to wait
//
//        if( !thread1.isAlive()) {
//        	thread2.start();// if t1 is finished then t2 will start
//        }
//
//        thread2.join();//signals t3 to wait
//
//        if (!thread2.isAlive()) {
//        	thread3.start(); 
//        }  
//        thread3.join();//signals t4 to wait
//
//        if (!thread3.isAlive()) {
//        	thread4.start(); 
//        }  
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
   

	}

}
