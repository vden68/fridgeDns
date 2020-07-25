package ru.apache_maven;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class fridgeDnsTest {

	@Before
	public void setUp() throws Exception {
		open("https://www.dns-shop.ru/");
        $("span.compare-link__lbl").click();
        $("a#header-logo.logo").click();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		$$("a.ui-link.menu-desktop__root-title").findBy(text("Бытовая техника")).click();
        $$("span.subcategory__title").findBy(text("Товары для кухни")).click();
        $$("span.subcategory__title").findBy(text("Холодильное оборудование")).click();
        $$("span.subcategory__title").findBy(text("Холодильники")).click();
        String value2 = $(".product-price__current").getAttribute("innerText").replace(" ", "");
        Integer i2 = Integer.valueOf(value2);       
        assert(10000 > i2);
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
