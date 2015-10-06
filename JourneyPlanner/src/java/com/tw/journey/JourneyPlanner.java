/**
 * 
 */
package com.tw.journey;

import com.tw.train.Station;
import com.tw.train.Train;

/**
 * @author rambasta
 *
 */
public class JourneyPlanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		bookTicket1();
		bookTicket2();
		bookTicket3();
		bookTicket4();

	}

	private static void bookTicket1() {
		Train train = new Train();
		Station src = new Station("Guindy");
		Station dest = new Station("Chennai Fort");
		Ticket ticket = new OneWayTicket(train, src, dest);
		System.out.println(ticket.print());
	}
	
	private static void bookTicket2() {
		Train train = new Train();
		Station src = new Station("Guindy");
		Station dest = new Station("Chennai Fort");
		Ticket ticket = new RoundTripTicket(train, src, dest);
		System.out.println(ticket.print());
	}
	
	private static void bookTicket3() {
		Train train = new Train();
		Station src = new Station("Kodambakkam");
		Station dest = new Station("Guindy");
		Ticket ticket = new OneWayTicket(train, src, dest);
		System.out.println(ticket.print());
	}
	
	private static void bookTicket4() {
		Train train = new Train();
		Station src = new Station("Kodambakkam");
		Station dest = new Station("Guindy");
		Ticket ticket = new RoundTripTicket(train, src, dest);
		System.out.println(ticket.print());
	}

}
