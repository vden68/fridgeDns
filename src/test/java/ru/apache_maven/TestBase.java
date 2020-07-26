package ru.apache_maven;

import org.testng.annotations.BeforeSuite;

import ru.example.fw.ApplicationManager;

public class TestBase {
	
	protected ApplicationManager app;

	@BeforeSuite
	public void setUp() throws Exception {
		app =  new ApplicationManager();
	}

}
