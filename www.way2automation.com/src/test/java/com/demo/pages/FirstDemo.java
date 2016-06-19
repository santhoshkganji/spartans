package com.demo.pages;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstDemo {
	
	FirefoxDriver firefoxBrowser;
	
	FirstDemo(){
		this.firefoxBrowser = new FirefoxDriver();
	}

	public static void main(String[] args) {
		FirstDemo demo = new FirstDemo();
		demo.firefoxBrowser.get("http://www.way2automation.com/demo.html");
		demo.firefoxBrowser.close();
	}

}
