package com.state.test.main;


import com.state.test.bean.City;
import com.state.test.bean.Country;
import com.state.test.bean.District;
import com.state.test.bean.State;
import com.state.test.logic.CountryLogic;
import com.state.test.view.CountryView;

public class Main {

	public static void main(String[] args) {
		
		CountryView view = new CountryView();
		CountryLogic logic = new CountryLogic();
		
		City c1 = new City("A1");
		City c2 = new City("A2");

		City c3 = new City("B1");
		City c4 = new City("B2");

		City c5 = new City("C1");
		City c6 = new City("C2");

		City c7 = new City("D1");
		City c8 = new City("D2");

		District districtA = new District();

		districtA.setDisrictName("Pervyj");
		districtA.addCity(c1);
		districtA.addCity(c2);
		districtA.setDistrictSquare(250.5);

		District districtB = new District();

		districtB.setDisrictName("Vtoroj");
		districtB.addCity(c3);
		districtB.addCity(c4);
		districtB.setDistrictSquare(600.8);

		District districtC = new District();

		districtC.setDisrictName("Tretij");
		districtC.addCity(c5);
		districtC.addCity(c6);
		districtC.setDistrictSquare(140.6);

		District districtD = new District();

		districtD.setDisrictName("Chetvertyj");
		districtD.addCity(c7);
		districtD.addCity(c8);
		districtD.setDistrictSquare(222.6);

		State stateAB = new State();
		
		stateAB.setStateName("State AB");
		stateAB.setStateCapital(c1.getCityName());
		stateAB.addDistrict(districtA);
		stateAB.addDistrict(districtB);
		logic.squareState(stateAB);
		
		
		State stateCD = new State();
		
		stateCD.setStateName("State CD");
		stateCD.setStateCapital(c8.getCityName());
		stateCD.addDistrict(districtC);
		stateCD.addDistrict(districtD);
		logic.squareState(stateCD);
		
		Country countryABCD = new Country();

		countryABCD.setName("Vejshnoria");
		countryABCD.setCountryCapital(c1.getCityName());
		countryABCD.addState(stateAB);
		countryABCD.addState(stateCD);
		countryABCD.countStates();
		logic.squareCountry(countryABCD);
		
		
		view.printCountry(countryABCD, logic.squareCountry(countryABCD));
		view.printSquare(logic.squareState(stateAB));
		view.printSquare(logic.squareState(stateCD));
		
		
	}

}
