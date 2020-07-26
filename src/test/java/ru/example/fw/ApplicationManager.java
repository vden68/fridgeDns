package ru.example.fw;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ApplicationManager {
	
	public MainPage mainPage;
	public Catalog catalog;
	
	public ApplicationManager() {
		open("https://www.dns-shop.ru/");
	    $("span.compare-link__lbl").click();
	    
	    mainPage = new MainPage(this);
	    catalog = new Catalog(this);
	}

}
