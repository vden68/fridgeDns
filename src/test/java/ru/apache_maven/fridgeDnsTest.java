package ru.apache_maven;

import org.testng.annotations.Test;


public class fridgeDnsTest extends TestBase{

	@Test
	public void fridgeMinimumPriceTest() {
		app.mainPage.openMainPage();
		app.catalog.openRefrigerators();
		app.catalog.sort("По возрастанию цены");
		Integer firstPrise = app.catalog.getFirstPrice();
		assert(10000 > firstPrise);
	}
	
	@Test
	public void fridgeMaximumPriceTest() {
		app.mainPage.openMainPage();
		app.catalog.openRefrigerators();
		app.catalog.sort("По убыванию цены");
		Integer firstPrise = app.catalog.getFirstPrice();
		assert(100000 < firstPrise);
	}
}
