package com.metrope.www.stepdefinitions;

import org.openqa.selenium.WebDriver;
import com.metrope.www.task.Abrir;
import com.metrope.www.task.Comprar;
import com.metrope.www.task.Notificacion;
import com.metrope.www.task.Ver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class MetroStepDefinitions {

	@Managed(driver = "chrome", options = "--start-maximized")

	WebDriver browser;

	Actor fabio = Actor.named("fabio");

	@Given("^yo me encuentro en el home de la tienda metrope$")
	public void yoMeEncuentroEnElHomeDeLaTiendaMetrope() {
		fabio.can(BrowseTheWeb.with(browser));
		fabio.wasAbleTo(Abrir.laPagina());
	}

	@When("^yo compro una silla para bebe Krea Baby Silla de Comer Rosa$")
	public void yoComproUnaSillaParaBebeKreaBabySillaDeComerRosa() {
		// Write code here that turns the phrase above into concrete actions
		fabio.wasAbleTo(Notificacion.nogracias());
		fabio.wasAbleTo(Comprar.articulo());
	}

	@When("^lo agrego a mi carrito$")
	public void loAgregoAMiCarrito() {
		fabio.wasAbleTo(Ver.carrito());
	}

	@Then("^yo visualizo el producto registrado con exito$")
	public void yoVisualizoElProductoRegistradoConExito() {

		
	}
}