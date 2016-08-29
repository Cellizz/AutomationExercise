package com.herokuapp.automatizacion.automationExercise;

import org.junit.Before;
import org.junit.Test;

import com.herokuapp.automatizacion.pageobjectmodel.HospitalPage;
import com.herokuapp.automatizacion.pageobjectmodel.MainPage;

public class HospitalTest {

	private MainPage mainPage;
	int counterId = 20;

	@Before
	public void setUp() throws Exception {
		mainPage = new MainPage();
	}

	
	public void createGenericHospital(String idHospital, String name, String address, String telephone) {
		HospitalPage hospitalPage = mainPage.getHospitalPage();
		hospitalPage.addHospital(idHospital, name, address, telephone);
		hospitalPage.goHome();
	}


	public void createTestHospitals() {

		String name = "Hospital General";
		String address = "Carrera 15 con calle ";
		String telephone = "1234567";
		for (int i = 0; i <counterId; i++) {
			
			createGenericHospital(String.valueOf(i+1), name, address, telephone);
		}
	}
	
	@Test
	public void deleteHospital() throws InterruptedException {
		createTestHospitals();
		mainPage.getHospitalListPage();
		Thread.sleep(3000);
		
		for (int i = 0; i <counterId; i++) {
			
			mainPage.getHospital().deleteHospital(String.valueOf(i+1));
		}

	}

	
}
