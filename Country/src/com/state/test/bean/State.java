package com.state.test.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {

	private String stateName;
	private List<District> stateDistrics = new ArrayList<District>();
	private String stateCapital;

	public State() {
		super();

	}

	public State(String stateName, List<District> stateDistrics, String stateCapital) {
		this.stateName = stateName;
		this.stateDistrics = stateDistrics;
		this.stateCapital = stateCapital;

	}

	public void addDistrict(District district) {
		stateDistrics.add(district);

	}

	public double squareState(State st) {

		double stateSquare = 0.0;
		for (District i : st.getStateDistrics()) {
			stateSquare = stateSquare + i.getDistrictSquare();
		}

		return stateSquare;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<District> getStateDistrics() {
		return stateDistrics;
	}

	public void setStateDistrics(List<District> stateDistrics) {
		this.stateDistrics = stateDistrics;
	}

	public String getStateCapital() {
		return stateCapital;
	}

	public void setStateCapital(String stateCapital) {
		this.stateCapital = stateCapital;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", stateDistrics=" + stateDistrics + ", stateCapital=" + stateCapital
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(stateCapital, stateDistrics, stateName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(stateCapital, other.stateCapital) && Objects.equals(stateDistrics, other.stateDistrics)
				&& Objects.equals(stateName, other.stateName);
	}

}
