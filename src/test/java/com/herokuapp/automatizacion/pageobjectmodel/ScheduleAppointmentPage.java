package com.herokuapp.automatizacion.pageobjectmodel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScheduleAppointmentPage {

	WebDriver driver;

	public ScheduleAppointmentPage(WebDriver driver) {
		this.driver = driver;
	}

	public void scheduleAppointment(String doctorId, String patientId, String date, String message) throws InterruptedException {
		if (date != null) {
			driver.findElement(By.id("datepicker")).clear();
			driver.findElement(By.id("datepicker")).sendKeys(date);
		}
		if (patientId != null) {
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(patientId);

		}
		if (doctorId != null) {
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(doctorId);

		}

		if (message != null) {
			driver.findElement(By.cssSelector("textarea.form-control")).clear();
			driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Cita de medicina general");

		}
		driver.findElement(By.linkText("Guardar")).click();
		Thread.sleep(2000);
	}

	public List<String> getErrorMessages() {
		List<String> messages;
		try {
			WebElement errorMessage = driver.findElement(By.className("panel-danger"));
			List<WebElement> errorTextList = errorMessage.findElements(By.className("text-danger"));
			messages = new ArrayList<>();
			for (WebElement webElement : errorTextList) {
				messages.add(webElement.getText());
			}
		} catch (NoSuchElementException e) {
			messages = null;
		}
		return messages;
	}

	public boolean isSuccesfull() {
		WebElement successMessage = null;
		try {
			successMessage = driver.findElement(By.className("panel-success"));
		} catch (NoSuchElementException e) {
			successMessage = null;
		}
		return successMessage != null;
	}
}
