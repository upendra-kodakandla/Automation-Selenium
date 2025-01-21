package Waits;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ekart {
	//Sample test1

	public static void main(String[] args) {
		String[] veggies = { "Cucumber", "Carrot", "Beans", "Capsicum", "Strawberry" };
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeoption);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		additemsToCart(driver, veggies);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("div[class='promoWrapper'] button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());

	}

	public static void additemsToCart(WebDriver driver, String[] veggies) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
		List<String> itemsNeeded = Arrays.asList(veggies);
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText().split("-")[0].trim();

			if (itemsNeeded.contains(name)) {
				driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click();

				if (j == veggies.length) {
					break;
				}
			}

		}
	}
}
