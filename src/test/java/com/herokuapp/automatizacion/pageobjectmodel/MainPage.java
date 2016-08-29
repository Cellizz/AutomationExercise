package com.herokuapp.automatizacion.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
	private WebDriver driver;
	private String baseUrl = "http://automatizacion.herokuapp.com/yfarfan/";
	private DoctorPage doctorPage;
	private PatientPage patientPage;
	private ScheduleAppointmentPage scheduleAppointmentPage;

	public MainPage() {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);

	}

	public DoctorPage getDoctorPage() {
		driver.findElement(By.linkText("Agregar Doctor")).click();
		doctorPage = new DoctorPage(driver);
		return doctorPage;
	}

	public PatientPage getPatientPage() {
		driver.findElement(By.linkText("Agregar Paciente")).click();
		patientPage = new PatientPage(driver);
		return patientPage;
	}

	public ScheduleAppointmentPage getScheduleAppointmentPage() {
		driver.findElement(By.linkText("Agendar Cita")).click();
		scheduleAppointmentPage = new ScheduleAppointmentPage(driver);
		return scheduleAppointmentPage;
	}

	public void exit() {
		driver.quit();
	}

}
