package com.state.test.logic;

import com.state.test.bean.Country;
import com.state.test.bean.District;
import com.state.test.bean.State;

public class CountryLogic {

	public double squareCountry(Country country) {

		double squareCountry = 0.0;
		for (State state : country.getCountryStates()) {
			for (District dist : state.getStateDistrics()) {
				squareCountry = squareCountry + dist.getDistrictSquare();
			}
		}
		return squareCountry;
	}
	public double squareState(State st) {

		double stateSquare = 0.0;
		for (District i : st.getStateDistrics()) {
			stateSquare = stateSquare + i.getDistrictSquare();
		}

		return stateSquare;
	}


}

