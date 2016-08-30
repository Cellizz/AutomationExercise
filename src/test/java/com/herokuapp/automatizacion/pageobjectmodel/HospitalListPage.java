package com.herokuapp.automatizacion.pageobjectmodel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HospitalListPage {
	WebDriver driver;

	public HospitalListPage(WebDriver driver) {
		this.driver = driver;
	}

	public int countHospitals() {
		WebElement tbody = driver.findElement(By.tagName("tbody"));

		List<WebElement> list = tbody.findElements(By.tagName("tr"));
		return list.size();
	}

	public List<String> listHospitals() {
		WebElement tbody = driver.findElement(By.tagName("tbody"));

		List<WebElement> list = tbody.findElements(By.tagName("tr"));
		List<String> ids = new ArrayList<>();
		for (WebElement webElement : list) {
			ids.add(webElement.findElements(By.tagName("td")).get(0).getText());
		}
		return ids;
	}

	public void goHome() {
		driver.findElement(By.linkText("Inicio")).click();
	}
}