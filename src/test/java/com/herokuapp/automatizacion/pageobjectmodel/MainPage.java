package com.herokuapp.automatizacion.pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
	private WebDriver driver;
	private String baseUrl = "http://automatizacion.herokuapp.com/yfarfan/";
	private DoctorPage doctorPage;
	private PatientPage patientPage;
	private ScheduleAppointmentPage scheduleAppointmentPage;
	private HospitalPage hospitalPage;
	private HospitalListPage hospitalListPage;

	public MainPage() {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
		

	}

	public DoctorPage getDoctorPage() {
		driver.findElement(By.linkText("Agregar Doctor")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		doctorPage = new DoctorPage(driver);
		return doctorPage;
	}

	public PatientPage getPatientPage() {
		driver.findElement(By.linkText("Agregar Paciente")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		patientPage = new PatientPage(driver);
		return patientPage;
	}

	public ScheduleAppointmentPage getScheduleAppointmentPage() {
		driver.findElement(By.linkText("Agendar Cita")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		scheduleAppointmentPage = new ScheduleAppointmentPage(driver);
		return scheduleAppointmentPage;
	}

	public void exit() {
		driver.quit();
	}

	public HospitalPage getHospitalPage() {
		driver.findElement(By.linkText("Agregar Hospital")).click();
		hospitalPage = new HospitalPage(driver);
		return hospitalPage;
	}
	
	public HospitalPage getHospital(){
		hospitalPage = new HospitalPage();
		return hospitalPage;
	}

	public HospitalListPage getHospitalListPage() {
		driver.findElement(By.linkText("Ver Hospitales")).click();
		hospitalListPage = new HospitalListPage(driver);
		return hospitalListPage;
	}

}
