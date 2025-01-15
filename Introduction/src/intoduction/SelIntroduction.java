package intoduction;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelIntroduction {
	public static void main(String[] args) {
		ChromeOptions chromeoption=new ChromeOptions();
		  chromeoption.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeoption);
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
