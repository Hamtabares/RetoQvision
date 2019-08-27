package com.hotels.www.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import com.hotels.www.task.Abrir;
import com.hotels.www.task.Comprar;
import com.hotels.www.task.IngresarDatos;
import com.hotels.www.task.Total;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class HotelsStepDefinitions {

	@Managed(driver = "chrome", options = "--start-maximized")

	WebDriver browser;

	Actor fabio = Actor.named("fabio");

	@Given("^que el usuario se encuentre en el portal de reserva dxhotels$")
	public void que_el_usuario_se_encuentre_en_el_portal_de_reserva_dxhotels() {

		fabio.can(BrowseTheWeb.with(browser));
		fabio.wasAbleTo(Abrir.laPagina());
	}

	@When("^el usuario ingresa sus datos para reserva$")
	public void el_usuario_ingresa_sus_datos_para_reserva(List<List<String>> datosReserva) {
		fabio.attemptsTo(IngresarDatos.reserva(datosReserva));
	}

	@When("^selecciono precio mas economico$")
	public void selecciono_precio_mas_economico() {
		fabio.wasAbleTo(Comprar.tiquetes());

	}

	@Then("^el debera visualizar el valor total pagado correcto$")
	public void el_debera_visualizar_el_valor_total_pagado_correcto() {
		fabio.wasAbleTo(Total.pagar());
	
	}
}