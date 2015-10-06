/**
 * 
 */
package com.tw.journey;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.tw.train.Station;
import com.tw.train.Train;

/**
 * @author rambasta
 *
 */
public abstract class AbstractTicket implements Ticket {
	
	protected Train train;
	protected Station src;
	protected Station dest;
	protected int numberOfStations;
	protected BigDecimal fare;
	protected Date purchaseDate;
	
	protected static int MIN_STATIONS = 5;
	protected static BigDecimal FACTOR = new BigDecimal(5); 

	/**
	 * @param src
	 * @param dest
	 */
	public AbstractTicket(Train train, Station src, Station dest) {
		this.train = train;
		train.validateStations(src, dest);
		this.src = src;
		this.dest = dest;
		numberOfStations = train.getNumberOfStations(src, dest);
		calculateFare();
		purchaseDate = new Date();
	}
	
	@Override
	public String print() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n-------------------------------\n");
		builder.append(toString());
		builder.append("\n-------------------------------\n");
		return builder.toString();	
	}
	
	public void calculateFare() {
		List<Station> route = train.getRoute();
		if (numberOfStations == route.size()) {
			fare = Train.MAX_FARE;
		} else if (numberOfStations < MIN_STATIONS) {
			fare = Train.MIN_FARE;
		} else {
			BigDecimal extraStations = new BigDecimal(numberOfStations - MIN_STATIONS);
			BigDecimal[] extraCostArray = extraStations.divideAndRemainder(FACTOR);
			BigDecimal extraCost = extraCostArray[0].multiply(FACTOR);
			if (extraCostArray[1].intValue() > 0) {
				extraCost = extraCost.add(FACTOR);
			}
			fare = Train.MIN_FARE.add(extraCost);
		}
	}

	/**
	 * @return the src
	 */
	public Station getSrc() {
		return src;
	}

	/**
	 * @param src the src to set
	 */
	public void setSrc(Station src) {
		this.src = src;
	}

	/**
	 * @return the dest
	 */
	public Station getDest() {
		return dest;
	}

	/**
	 * @param dest the dest to set
	 */
	public void setDest(Station dest) {
		this.dest = dest;
	}

	/**
	 * @return the numberOfStations
	 */
	public int getNumberOfStations() {
		return numberOfStations;
	}

	/**
	 * @param numberOfStations the numberOfStations to set
	 */
	public void setNumberOfStations(int numberOfStations) {
		this.numberOfStations = numberOfStations;
	}

	/**
	 * @return the purchaseDate
	 */
	public Date getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	/**
	 * @param fare the fare to set
	 */
	public void setFare(BigDecimal fare) {
		this.fare = fare;
	}
	
	/**
	 * @return the fare
	 */
	public BigDecimal getFare() {
		return fare;
	}
	
	public double getFareDoubleValue() {
		return fare.setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
	}

}
