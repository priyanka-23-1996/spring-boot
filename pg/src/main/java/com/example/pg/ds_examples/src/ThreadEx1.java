package com.example.pg.ds_examples.src;

public class ThreadEx1 extends Thread{
	static int count=0;
	public void run(){
		count++;
		System.out.println(count +" thread is running...");
		}
		public static void main(String[] args) {
			ThreadEx1 t1=new ThreadEx1();
			t1.start();
		}
}