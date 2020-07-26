package ru.example.fw;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends HelperBase{
	
	public MainPage(ApplicationManager manager) {
		super(manager);
	}

	public void openMainPage() {
		$("a#header-logo.logo").click();
	}

}
