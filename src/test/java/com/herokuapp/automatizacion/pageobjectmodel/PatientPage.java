package com.herokuapp.automatizacion.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PatientPage {

	WebDriver driver;

	public PatientPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addPatient(String id, String name, String lastName, String telephone, String idType,
			boolean isPrepaid) {
		if (name != null) {
			driver.findElement(By.name("name")).clear();
			driver.findElement(By.name("name")).sendKeys(name);

		}
		if (lastName != null) {
			driver.findElement(By.name("last_name")).clear();
			driver.findElement(By.name("last_name")).sendKeys(lastName);

		}
		if (telephone != null) {
			driver.findElement(By.name("telephone")).clear();
			driver.findElement(By.name("telephone")).sendKeys(telephone);

		}
		if (idType != null) {
			new Select(driver.findElement(By.name("identification_type"))).selectByVisibleText(idType);

		}

		if (id != null) {
			driver.findElement(By.name("identification")).clear();
			driver.findElement(By.name("identification")).sendKeys(id);

		}
		if (isPrepaid)
			driver.findElement(By.name("prepaid")).click();
		driver.findElement(By.linkText("Guardar")).click();
	}

	public void goHome() {
		driver.findElement(By.linkText("Inicio")).click();
	}
}
