package concurrent;

import java.util.concurrent.TimeUnit;

class Task implements Runnable {
	
   @Override
   public void run()
   {
	  System.out.printf("Starting...\n");
      try {
         TimeUnit.SECONDS.sleep(3);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      System.out.printf("Finishing...\n");
   }
}