package com.functional_interface.background_job_execution;

public class Task {
	
	public static void main(String[] args) {
		 // Background task
        Runnable job = () -> {
            System.out.println("Background job started");
            try {
                Thread.sleep(2000); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background job completed");
        };
        
        Runnable job2 = () -> {
            System.out.println("Background job2 started");
            try {
                Thread.sleep(3000); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background job2 completed");
        };

        // Run asynchronously
        Thread thread = new Thread(job);
        Thread thread2 = new Thread(job2);
        
        thread.start();
        thread2.start();

        System.out.println("Main thread continues...");
    
	}

}
