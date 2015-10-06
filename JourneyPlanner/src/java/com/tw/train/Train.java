/**
 * 
 */
package com.tw.train;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rambasta
 *
 */
public class Train {
	
	public static final BigDecimal MIN_FARE = new BigDecimal(10);
	public static final BigDecimal MAX_FARE = new BigDecimal(20);
	public static List<Station> route = new ArrayList<Station>();
	
	static {
	route.add(new Station("Chennai Beach"));
	route.add(new Station("Chennai Fort"));
	route.add(new Station("Chennai Park"));
	route.add(new Station("Chennai Egmore"));
	route.add(new Station("Chetpet"));
	route.add(new Station("Nungambakkam"));
	route.add(new Station("Kodambakkam"));
	route.add(new Station("Mambalam"));
	route.add(new Station("Saidapet"));
	route.add(new Station("Guindy"));
	route.add(new Station("St. Thomas Mount"));
	route.add(new Station("Pazhavanthangal"));
	route.add(new Station("Meenambakkam"));
	route.add(new Station("Trisulum"));
	route.add(new Station("Pallavaram"));
	route.add(new Station("Chromepet"));
	route.add(new Station("Tambaram Sanatorium"));
	route.add(new Station("Tambaram"));
	
	}

	public void validateStations(Station src, Station dest) {
		int srcIndex = route.indexOf(src);
		if (srcIndex == -1) {
			throw new IllegalArgumentException("Source Station does not exist");
		}
		int destIndex = route.indexOf(dest);
		if (destIndex == -1) {
			throw new IllegalArgumentException(
					"Destination Station does not exist");
		}

	}

	public int getNumberOfStations(Station src, Station dest) {
		int numberOfStations = Math.abs(route.indexOf(src) - route.indexOf(dest)) + 1;
		return numberOfStations;
	}

	public List<Station> getRoute() {
		return route;

	}

}
