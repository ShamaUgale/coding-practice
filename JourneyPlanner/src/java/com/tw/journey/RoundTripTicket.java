/**
 * 
 */
package com.tw.journey;

import java.math.BigDecimal;

import com.tw.train.Station;
import com.tw.train.Train;

/**
 * @author rambasta
 *
 */
public class RoundTripTicket extends AbstractTicket {
	
	protected static BigDecimal ROUND_TRIP_FACTOR = new BigDecimal(1.75); 

	public RoundTripTicket(Train train, Station src, Station dest) {
		super(train, src, dest);
	}

	/* (non-Javadoc)
	 * @see com.tw.journey.AbstractJourney#calculateFare()
	 */
	@Override
	public void calculateFare() {
		super.calculateFare();
		fare = fare.multiply(ROUND_TRIP_FACTOR);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getPurchaseDate().toString());
		builder.append("\n\t" + getSrc().getName());
		builder.append("\n\t" + getDest().getName());
		builder.append("\n\t" + getSrc().getName());
		builder.append("\n\t" + (getNumberOfStations() - 1) * 2 + " Stops");
		builder.append("\n\tINR " + getFareDoubleValue());
		return builder.toString();
	}

}
