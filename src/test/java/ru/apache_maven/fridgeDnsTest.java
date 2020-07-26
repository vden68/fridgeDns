package ru.apache_maven;

import org.testng.annotations.Test;


public class fridgeDnsTest extends TestBase{

	@Test
	public void test() {
		app.mainPage.openMainPage();
		app.catalog.openCatalogRefrigeratorsPage();
		Integer firstPrise = app.catalog.getFirstPrice();
		assert(10000 > firstPrise);
		try {
			Thread.sleep(10000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
