package actionswindowhandlesframes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeoption);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions ac = new Actions(driver);
		WebElement signin = driver.findElement(By.id("nav-link-accountList"));
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		ac.moveToElement(searchBar).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		ac.moveToElement(signin).contextClick().build().perform();
	}

}
