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
public class OneWayTicket extends AbstractTicket {

	public OneWayTicket(Train train, Station src, Station dest) {
		super(train, src, dest);
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
		builder.append("\n\t" + (getNumberOfStations() - 1) + " Stops");
		builder.append("\n\tINR " + getFareDoubleValue());
		return builder.toString();
	}
}
