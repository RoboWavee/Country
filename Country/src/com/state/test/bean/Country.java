package com.state.test.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {

	private String name;
	private List<State> countryStates = new ArrayList<State>();
	private String countryCapital;

	public Country() {
		super();

	}

	public Country(String name, List<State> countryStates, String countryCapital) {
		this.name = name;
		this.countryStates = countryStates;
		this.countryCapital = countryCapital;

	}

	public void addState(State state) {
		countryStates.add(state);

	}

	public int countStates() {
		return countryStates.size();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<State> getCountryStates() {
		return countryStates;
	}

	public void setCountryStates(List<State> countryStates) {
		this.countryStates = countryStates;
	}

	public String getCountryCapital() {
		return countryCapital;
	}

	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", countryStates=" + countryStates + ", countryCapital=" + countryCapital
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(countryCapital, countryStates, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(countryCapital, other.countryCapital)
				&& Objects.equals(countryStates, other.countryStates) && Objects.equals(name, other.name);
	}

}