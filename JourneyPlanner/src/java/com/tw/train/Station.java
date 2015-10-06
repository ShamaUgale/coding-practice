/**
 * 
 */
package com.tw.train;

/**
 * @author rambasta
 *
 */
public class Station {

	private String name;

	/**
	 * @param name
	 */
	public Station(String name) {
		this.setName(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Station station = (Station) obj;

		return (this.name == station.name || (this.name != null && this.name
				.equalsIgnoreCase(station.name)));
	}

}
