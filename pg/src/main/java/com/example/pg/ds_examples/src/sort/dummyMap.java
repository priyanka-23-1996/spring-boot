package com.example.pg.ds_examples.src.sort;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class dummyMap {

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,3,4,5,5};
		HashMap<Integer,Integer> map = new HashMap();
		int count=0;
        for(int ele:arr) {
        	if(map.containsKey(ele)) {
        	 count=	map.get(ele);
        	 map.put(ele, count+1);
        	}
        	else
        		map.put(ele, 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	System.out.println("ele is = " +entry.getKey() +" count is = " +entry.getValue());
        }
        
        //linkedlist
        
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        
        
		

	}

}
