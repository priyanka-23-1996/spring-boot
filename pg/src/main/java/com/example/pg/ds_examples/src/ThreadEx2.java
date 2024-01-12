package com.example.pg.ds_examples.src;

public class ThreadEx2 implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		ThreadEx2 t= new ThreadEx2();
		Thread t1 = new Thread(t);
		t1.start();
		Thread.sleep(5000); 

	}

	@Override
	public void run() {
		System.out.println("THread is running");
		
	}

}
