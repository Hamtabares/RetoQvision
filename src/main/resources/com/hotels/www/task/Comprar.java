package com.hotels.www.task;

import static com.hotels.www.userinterfaces.Tiquete.*;
import java.util.Comparator;
import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Comprar implements Task{
private String menor;


 	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> precioList= PRICE.resolveAllFor(actor);
		WebElementFacade menor  = precioList.stream().min(Comparator.comparing(WebElementFacade::getTextValue)).get();
		
		int index = 0;
		for (int i = 0; i < precioList.size(); i++) {
			if(precioList.get(i).equals(menor)) {
				index = i + 1;
			}
		}
		
		actor.attemptsTo(
				
				Click.on("//div[2]/div[2]/div/div[2]/div["+index+"]/div/div[2]/div[3]/div")
				
				 );
		
	}
	
	public static Comprar tiquetes() {
		return Tasks.instrumented(Comprar.class);
		
	}

	public String getMenor() {
		return menor;
	}

	public void setMenor(String menor) {
		this.menor = menor;
	}

}
