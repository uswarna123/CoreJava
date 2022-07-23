package com.practice.corejava;

public class MultiThread extends Thread {

	 public void run() 
	 {
		 for(int i=0; i<3;i++) {
		
			 System.out.println("Thread started running :"+i);
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("After Thread sleep");
	 }
	public static void main(String[] args) 
	{
		
		MultiThread obj=new MultiThread();
		obj.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MultiThread obj1=new MultiThread();
		obj1.start();
		
	} 

}
