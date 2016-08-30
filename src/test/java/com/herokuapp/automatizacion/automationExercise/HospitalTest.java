package com.herokuapp.automatizacion.automationExercise;

import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.herokuapp.automatizacion.pageobjectmodel.HospitalListPage;
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


	private void createTestHospitals() {

		String name = "Hospital General";
		String address = "Carrera 15 con calle ";
		String telephone = "1234567";
		for (int i = 0; i <counterId; i++) {
			
			createGenericHospital(String.valueOf(new Random().nextInt(100)), name, address, telephone);
		}
	}
	
	@Test
	public void deleteHospital() throws InterruptedException {
		createTestHospitals();
		HospitalListPage hospitalListPage = mainPage.getHospitalListPage();
		Thread.sleep(3000);
		List<String> ids = hospitalListPage.listHospitals();
		hospitalListPage.goHome();
		for (String hospitalId : ids) {
			mainPage.getHospital().deleteHospital(String.valueOf(hospitalId));
		}	
		hospitalListPage = mainPage.getHospitalListPage();
		Assert.assertEquals(0, hospitalListPage.countHospitals());
		
	}

	@After
	public void tearDown() throws Exception {
		mainPage.exit();
	}
	
}
