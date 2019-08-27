package com.hotels.www.userinterfaces;

import com.hotels.www.task.IngresarDatos;
import net.serenitybdd.screenplay.targets.Target;
public class HotelSearch {


	public static final Target LOCATION_RESERVA = Target.the("seleccionar lugar").locatedBy("//input[contains(@id,'location')]");
	public static final Target LISTA = Target.the("lista ciudades").locatedBy("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'"+IngresarDatos.getCiudad() +"')]");
	public static final Target SEL_FECHA_IDA =Target.the("Seleccionar fecha ida").locatedBy("//input[contains(@id,'checkIn')]");
	public static final Target SEL_FECHA_REGRESO = Target.the("Seleccionar fecha regreso").locatedBy("//input[contains(@id,'checkOut')]"); 
	public static final Target BTN_SEARCH = Target.the("Presionar buscar").locatedBy("//span[contains(text(),'SEARCH')]");

}

