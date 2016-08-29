package com.herokuapp.automatizacion.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.web.client.RestTemplate;


public class HospitalPage {
	WebDriver driver;

	public HospitalPage(WebDriver driver) {
		this.driver = driver;
	}

	public HospitalPage(){
		
	}
	
	public void addHospital(String idHospital, String name, String address, String telephone) {
		driver.findElement(By.cssSelector("input.form-control")).clear();
		driver.findElement(By.cssSelector("input.form-control")).sendKeys(idHospital);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(name);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(address);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(telephone);
		driver.findElement(By.linkText("Guardar")).click();
	}

	public void goHome() {
		driver.findElement(By.linkText("Inicio")).click();
	}

	public void deleteHospital(String id) {
		System.out.println("Eliminando id "+id);
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete("http://automatizacion.herokuapp.com/yfarfan/removeHospital?code="+id);
//		
	}
}