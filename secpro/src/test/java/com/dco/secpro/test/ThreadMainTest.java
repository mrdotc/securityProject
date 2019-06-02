package com.dco.secpro.test;

import java.io.InputStream;

public class ThreadMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	 
		
		

		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				String threadName = Thread.currentThread().getName();
				int count = 0;
				while (!Thread.interrupted()) {
					System.out.println(threadName+": " + count++);

				}

			}

		};
		
		Thread threadA=new Thread(r);
		
		Thread ThreadB=new Thread(r);
		
		threadA.start();
		ThreadB.start();
		
		
		try {
			threadA.sleep(3000);
			ThreadB.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		threadA.interrupt();
		//ThreadB.interrupt();
		

	}

}
