package com.example.pg.ds_examples.src.sort;

import java.util.HashMap;
import java.util.Map;

public class dummy {

	public static void main(String[] args) {
		// log levels - debug,info,error
		
		// log of today with their summary
		HashMap<String,String> m = new HashMap();
		m.put("DEBUG", "debug level log");
		m.put("ERROR", "error level log");
		m.put("INFO", "info level log");
		
		for(Map.Entry<String,String> entry: m.entrySet()) {
			
			if(entry.getKey() == "INFO") {
				System.out.println(entry.getValue());
			}
			else if(entry.getKey() == "ERROR") {
				System.out.println(entry.getValue());
			}
			else {
				System.out.println(entry.getValue());
			}
			
		}
		//json

	}

}