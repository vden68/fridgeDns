package ru.apache_maven;

import org.testng.annotations.Test;


public class fridgeDnsTest extends TestBase{

	@Test
	public void test() {
		app.openMainPage();
		app.openCatalogRefrigeratorsPage();
		Integer i2 = app.getFirstPrice();
		assert(10000 > i2);
		try {
			Thread.sleep(10000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
