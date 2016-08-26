package com.herokuapp.automatizacion.AutomationExercise;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScheduleAppointmentTest {
	@Given("^El usuario ingresa a la url and hace click en Agendar cita$")
	public void el_usuario_ingresa_a_la_url_and_hace_click_en_Agendar_cita() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^El usuario selecciona la fecha \"(.*?)\"$")
	public void el_usuario_selecciona_la_fecha(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^El usuario ingresa (\\d+) en el campo Documento de identidad del paciente$")
	public void el_usuario_ingresa_en_el_campo_Documento_de_identidad_del_paciente(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^El usuario ingresa (\\d+) en el campo Documento de identidad del doctor$")
	public void el_usuario_ingresa_en_el_campo_Documento_de_identidad_del_doctor(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^El usuario ingresa \"(.*?)\" en el campo Observaciones$")
	public void el_usuario_ingresa_en_el_campo_Observaciones(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^El usuario hace click en el boton guardar$")
	public void el_usuario_hace_click_en_el_boton_guardar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^debe mostrarse ventana con error \"(.*?)\"$")
	public void debe_mostrarse_ventana_con_error(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^existe el paciente con cedula (\\d+)$")
	public void existe_el_paciente_con_cedula(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

//	@Given("^existe el doctor con la cedula (\\d+)$")
//	public void existe_el_doctor_con_la_cedula(int arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

//	@Then("^debe mostrarse ventana con mensaje \"(.*?)\"$")
//	public void debe_mostrarse_ventana_con_mensaje(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

	@When("^existe el doctor con la cedula (\\d+)$")
	public void existe_el_doctor_con_la_cedula(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^existe el paciente con la cedula (\\d+)$")
	public void existe_el_paciente_con_la_cedula(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^debe mostrarse ventana con error HTTP ERROR (\\d+)$")
	public void debe_mostrarse_ventana_con_error_HTTP_ERROR(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^debe mostrarse ventana con mensaje \"(.*?)\"\\.$")
	public void debe_mostrarse_ventana_con_mensaje(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^debe mostrarse ventana con mensaje de error \"(.*?)\"$")
	public void debe_mostrarse_ventana_con_mensaje_de_error(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
