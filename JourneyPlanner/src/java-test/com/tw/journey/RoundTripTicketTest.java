/**
 * 
 */
package com.tw.journey;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tw.train.Station;
import com.tw.train.Train;

/**
 * @author rambasta
 *
 */
public class RoundTripTicketTest {

	private static RoundTripTicket ticket;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Train train = new Train();
		Station src = new Station("Kodambakkam");
		Station dest = new Station("Guindy");
		ticket = new RoundTripTicket(train, src, dest);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.tw.journey.AbstractTicket#bookTicket()}.
	 */
	@Test
	public void testBookTicket() {
		assertEquals(17.5, ticket.getFareDoubleValue(), 0.0);
	}

}
