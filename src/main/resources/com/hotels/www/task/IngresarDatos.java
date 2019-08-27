package com.hotels.www.task;

import org.openqa.selenium.Keys;
import static com.hotels.www.userinterfaces.HotelSearch.*;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class IngresarDatos implements Task {
  
	private String location,fecha_ida,fecha_regreso;
	
	public IngresarDatos(List<List<String>> datosReserva) {
		this.location=datosReserva.get(1).get(0);
		this.fecha_ida=datosReserva.get(1).get(1);
		this.fecha_regreso=datosReserva.get(1).get(2);
	}
	
	
	private static String ciudad;
	@Override
	public <T extends Actor> void performAs(T actor) {
		setCiudad(location);
	
		actor.attemptsTo(Click.on(LOCATION_RESERVA),
				Click.on(LISTA),
				Enter.theValue(fecha_ida).into(SEL_FECHA_IDA).thenHit(Keys.ENTER),
				Enter.theValue(fecha_regreso).into(SEL_FECHA_REGRESO).thenHit(Keys.ENTER),
				Click.on(BTN_SEARCH)
				);
		}
	

	public static IngresarDatos reserva(List<List<String>> datosReserva) {
		return Tasks.instrumented(IngresarDatos.class, datosReserva);
		
	}


	public static String getCiudad() {
		return ciudad;
	}


	private static void setCiudad(String ciudad) {
		IngresarDatos.ciudad = ciudad;
	}
	


}
