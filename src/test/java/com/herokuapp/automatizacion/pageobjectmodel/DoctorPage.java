package com.herokuapp.automatizacion.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DoctorPage {
	WebDriver driver;

	public DoctorPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addDoctor(String name, String lastName, String telephone, String typeId, String id) throws InterruptedException {
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("last_name")).clear();
		driver.findElement(By.id("last_name")).sendKeys(lastName);
		driver.findElement(By.id("telephone")).clear();
		driver.findElement(By.id("telephone")).sendKeys(telephone);
		new Select(driver.findElement(By.id("identification_type"))).selectByVisibleText(typeId);
		driver.findElement(By.id("identification")).clear();
		driver.findElement(By.id("identification")).sendKeys(id);
		driver.findElement(By.linkText("Guardar")).click();
		Thread.sleep(2000);
	}

	public void goHome() {
		driver.findElement(By.linkText("Inicio")).click();
	}
}