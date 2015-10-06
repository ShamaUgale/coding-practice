package com.tw.journey;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tw.train.Station;
import com.tw.train.Train;

public class OneWayTicketTest {

	private static OneWayTicket ticket;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Train train = new Train();
		Station src = new Station("Guindy");
		Station dest = new Station("Chennai Fort");
		ticket = new OneWayTicket(train, src, dest);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBookTicket() {
		assertEquals(15.0, ticket.getFareDoubleValue(), 0.0);
	}

}
