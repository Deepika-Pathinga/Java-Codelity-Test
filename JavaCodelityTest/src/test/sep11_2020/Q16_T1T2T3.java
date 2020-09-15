/*
 * 16. Write a java program to create three threads T1, T2 and T3 
 * and ensure sequence T1,T2,T3 in java.
 */

package test.sep11_2020;

public class Q16_T1T2T3 {

	public static void main(String[] args) throws InterruptedException {
        final Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("start 1");
                System.out.println("end 1");
            }//run
        });
        
        final Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("start 2");
                System.out.println("end 2");
            }//run
        });
        final Thread t3 = new Thread(new Runnable() {
            public void run() {
                System.out.println("start 3");
                System.out.println("end 3");
            }//run
        });

        t1.start();

        t1.join(); // signals t2 to wait

        if( !t1.isAlive()) {
            t2.start();// if t1 is finished then t2 will start
        }

        t2.join();//signals t3 to wait

        if (!t2.isAlive()) {
            t3.start(); 
        }  
  
//       t1.run();
//       t2.run();
//       t3.run();

    }
}