package intoduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowActivites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeoption=new ChromeOptions();
		  chromeoption.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeoption);
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.navigate().to("https://facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
