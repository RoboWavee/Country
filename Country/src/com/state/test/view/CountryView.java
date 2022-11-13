package com.state.test.view;

import com.state.test.bean.Country;

import com.state.test.bean.State;

public class CountryView {

	public void printCountry(Country country, double sq) {

		System.out.print("\nCOUNTRY: " + country.getName() + "\nCAPITAL: " + country.getCountryCapital()
				+ "\nCOUNTRY SQUARE: " + sq + "\n");

		System.out.print("\nNUMBER OF STATES: " + country.countStates());
		for (State i : country.getCountryStates()) {
			System.out.println("\nSTATE: " + i.getStateName() + "\nSTATE CAPITAL " + i.getStateCapital());
		}
	}

	public void printSquare(Double sq) {
		System.out.println("\nSTATE SQUARE: " + sq);
	}
}
