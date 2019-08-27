package com.hotels.www.task;

import com.hotels.www.userinterfaces.PaginaInicialDxhotels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		 actor.attemptsTo(Open.browserOn(new PaginaInicialDxhotels()));
	    
	}
	
	public static Abrir laPagina() {
		return Tasks.instrumented(Abrir.class);
	}

}
