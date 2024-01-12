package com.example.pg.ds_examples.src.sort;
//circular linked list exam-ple
public class LinkedListEg {

	private int ele;
	private Node n;
	
	LinkedListEg(Node node){
		node = new Node(ele);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Node{
	private int ele;
	private Node firstAddress;
	private Node lastAddress;

	Node(int ele){
		this.ele=ele;
		this.firstAddress=null;
		this.lastAddress=null;
	}
}
