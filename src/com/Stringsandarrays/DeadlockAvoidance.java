package com.Stringsandarrays;

public class DeadlockAvoidance {
	
	private static final Object R1 = new Object();
    private static final Object R2 = new Object();
	
	public static void main(String []args) {
		
		Thread thread1 = new Thread(() -> {
            synchronized (R1) {
                System.out.println("Thread1: Acquired resource R1");
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread1: Trying to acquire resource R2");
                synchronized (R2) {
                    System.out.println("Thread1: Acquired resource R2");
                    // Perform some actions with R1 and R2
                }
            }
        });
		
		Thread thread2 = new Thread(() -> {
            synchronized (R2) {
                System.out.println("Thread2: Acquired resource R2");
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread2: Trying to acquire resource R1");
                synchronized (R1) {
                    System.out.println("Thread2: Acquired resource R1");
                    // Perform some actions with R1 and R2
                }
            }
        });
		
		thread1.start();
        thread2.start();
	}

}
