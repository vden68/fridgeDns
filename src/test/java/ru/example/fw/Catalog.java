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

	public void openRefrigerators() {
		$$("a.ui-link.menu-desktop__root-title").findBy(text("Бытовая техника")).click();
	    $$("span.subcategory__title").findBy(text("Товары для кухни")).click();
	    $$("span.subcategory__title").findBy(text("Холодильное оборудование")).click();
	    $$("span.subcategory__title").findBy(text("Холодильники")).click();
	}

	public void sort(String typeSort) {
		String typeSortDns = $(".top-filter__selected").getAttribute("innerText");
		if (!typeSort.toLowerCase().equals(typeSortDns)) {
			$(".top-filter__selected").click();
			$$("span.ui-radio__content").findBy(text(typeSort)).click();
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
