package com.herokuapp.automatizacion.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HospitalListPage {
	WebDriver driver;

	public HospitalListPage(WebDriver driver) {
		this.driver = driver;
	}

	public void listHospitals() {
		driver.findElement(By.linkText("Ver Hospitales")).click();
	}

	public void goHome() {
		driver.findElement(By.linkText("Inicio")).click();
	}
}