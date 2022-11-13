package com.state.test.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {

	private String disrictName;
	private List<City> districtCities = new ArrayList<City>();
	private double districtSquare;

	public District() {
		super();

	}

	public District(String disrictName, List<City> districtCities, double districtSquare) {
		this.disrictName = disrictName;
		this.districtCities = districtCities;
		this.districtSquare = districtSquare;
	}

	public String getDisrictName() {
		return disrictName;
	}

	public void setDisrictName(String disrictName) {
		this.disrictName = disrictName;
	}

	public List<City> getDistrictCities() {
		return districtCities;
	}

	public void setDistrictCities(List<City> districtCities) {
		this.districtCities = districtCities;
	}

	public double getDistrictSquare() {
		return districtSquare;
	}

	public void setDistrictSquare(double districtSquare) {
		this.districtSquare = districtSquare;
	}

	public void addCity(City city) {
		districtCities.add(city);
	}

	@Override
	public String toString() {
		return "District [disrictName=" + disrictName + ", districtCities=" + districtCities + ", districtSquare="
				+ districtSquare + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(disrictName, districtCities, districtSquare);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(disrictName, other.disrictName) && Objects.equals(districtCities, other.districtCities)
				&& Double.doubleToLongBits(districtSquare) == Double.doubleToLongBits(other.districtSquare);
	}

}
