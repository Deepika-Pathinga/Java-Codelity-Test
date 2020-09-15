package test.sep11_2020;

public class Q17_TicketBooking implements Runnable{
int ticketsAvailable=10;
    
    @SuppressWarnings("deprecation")
	public void run(){
           
           System.out.println("Waiting to book ticket for : "+Thread.currentThread().getName());
           for (int i = 0; i < 10; i++) {
               if(i >= 6 && Thread.currentThread().getName().equals("Passenger1 Thread")){
                   Thread.currentThread().stop();
               }
               if(i >= 3 && Thread.currentThread().getName().equals("Passenger2 Thread")){
                   Thread.currentThread().stop();
               }
               if(i >= 4 && Thread.currentThread().getName().equals("Passenger3 Thread")){
                   Thread.currentThread().stop();
               }
               if(i >= 1 && Thread.currentThread().getName().equals("Passenger4 Thread")){
                   Thread.currentThread().stop();
               }
               
               synchronized (this) {
                   if(ticketsAvailable>0){
                         System.out.println("Booking ticket for : "+Thread.currentThread().getName());
                         
                         //Let's say system takes some time in booking ticket (here we have taken 1 second time)
                         try{
                                Thread.sleep(1000); 
                         }catch(Exception e){}
                           
                         ticketsAvailable--;
                         System.out.println("Ticket BOOKED for : "+ Thread.currentThread().getName());
                         System.out.println("currently ticketsAvailable = "+ticketsAvailable);
                   }
                   else{
                         System.out.println("Ticket NOT BOOKED for : "+ 
                                   Thread.currentThread().getName());
                   }
                   
            }//End synchronization block
           }
           
           
           
    }

}
