package com.hotels.www.task;

import static org.junit.Assert.assertEquals;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static com.hotels.www.userinterfaces.Pagar.*;

public class Total implements Task {
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
			assertEquals("$1210.00", PAY.resolveFor(actor).getTextValue());
		
	}
	public static Total pagar () {
		return Tasks.instrumented(Total.class);
	}	
}
