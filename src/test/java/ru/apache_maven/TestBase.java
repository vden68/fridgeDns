package ru.apache_maven;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

	@BeforeClass
	public void setUp() throws Exception {
		open("https://www.dns-shop.ru/");
		$("span.compare-link__lbl").click();
		openMainPage();
	}

	@AfterClass
	public void tearDown() throws Exception {
	}

	public Integer getFirstPrice() {
		String value2 = $(".product-price__current").getAttribute("innerText").replace(" ", "");
		Integer i2 = Integer.valueOf(value2);
		return i2;
	}

	public void openCatalogRefrigeratorsPage() {
		$$("a.ui-link.menu-desktop__root-title").findBy(text("Бытовая техника")).click();
		$$("span.subcategory__title").findBy(text("Товары для кухни")).click();
		$$("span.subcategory__title").findBy(text("Холодильное оборудование")).click();
		$$("span.subcategory__title").findBy(text("Холодильники")).click();
	}

	public void openMainPage() {
		$("a#header-logo.logo").click();
	}

}
