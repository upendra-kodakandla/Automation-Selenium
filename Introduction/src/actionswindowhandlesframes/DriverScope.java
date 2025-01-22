package actionswindowhandlesframes;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverScope {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeoption);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerSection = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerSection.findElements(By.tagName("a")).size());
		WebElement columnDriver = footerSection.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());

		for (WebElement element : columnDriver.findElements(By.tagName("a"))) {
			String linlClick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			element.sendKeys(linlClick);
			Thread.sleep(5000);
		}

		Thread.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
		}

	}

}
