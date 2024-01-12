package com.example.pg.DateTime;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;

public class TimeExample {

	private static final TemporalUnit TemporalUnit = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant nowTime= Instant.now();
		System.out.println(nowTime);
		
		//Java Instant now(Clock clock) method Example
		   Instant instant = Instant.now(Clock.systemUTC());  
		     System.out.println(instant);     
		     
		     Instant i = Instant.now(Clock.system(ZoneId.of("America/Chicago")));  
		        System.out.println(i);  
		 
		         long t = TemporalUnit.getDuration().toDays();
		        Instant diff= nowTime.minus(7,(TemporalUnit.diff));
	;
		

	}

}
