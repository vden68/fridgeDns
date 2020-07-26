package ru.example.fw;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Catalog extends HelperBase{
	
	public Catalog(ApplicationManager manager) {
		super(manager);
	}

	public Integer getFirstPrice() {
		String firstPriseStr = $(".product-price__current").getAttribute("innerText").replace(" ", "");
	    Integer firstPriseInt = Integer.valueOf(firstPriseStr);
		return firstPriseInt;
	}

	public void openCatalogRefrigeratorsPage() {
		$$("a.ui-link.menu-desktop__root-title").findBy(text("Бытовая техника")).click();
	    $$("span.subcategory__title").findBy(text("Товары для кухни")).click();
	    $$("span.subcategory__title").findBy(text("Холодильное оборудование")).click();
	    $$("span.subcategory__title").findBy(text("Холодильники")).click();
	}

}
