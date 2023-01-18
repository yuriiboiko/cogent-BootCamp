/**
 * A program to print date and time using API in java 8
 */
package com.cogent.day08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
/**
 * @author  : Yurii Boiko
 * @Date	: Jan 18, 2023
 *
 */
public class App01 {

	public static void main(String[] args) {
		//will return current date
		LocalDate dt = LocalDate.now();
		System.out.println(dt);
		
		//will return current time
		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		int d = dt.getDayOfMonth();
		int m = dt.getMonthValue();
		int y = dt.getYear();
		System.out.printf("%d-%d-%d\n",d,m,y);
		
		int hr = lt.getHour();
		int min = lt.getMinute();
		int sec = lt.getSecond();
		int nano = lt.getNano();
		
		System.out.printf("%d:%d:%d:%d\n",hr,min,sec,nano);
		
		
		LocalDateTime ldt = LocalDateTime.now();
		int d1 = ldt.getDayOfMonth();
		int m1 = ldt.getMonthValue();
		int y1 = ldt.getYear();
		System.out.printf("%d-%d-%d\n",d1,m1,y1);
		
		int hr1 = ldt.getHour();
		int min1 = ldt.getMinute();
		int sec1 = ldt.getSecond();
		int nano1 = ldt.getNano();
		
		System.out.printf("%d:%d:%d:%d\n",hr,min,sec,nano);
		
	
	}

}
