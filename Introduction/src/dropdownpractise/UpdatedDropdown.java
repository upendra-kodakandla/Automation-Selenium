package dropdownpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeOptions chromeoption = new ChromeOptions();
				chromeoption.addArguments("--remote-allow-origins=*");
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver(chromeoption);
				driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(1000);
				int i=1;
				while(i<5) {
					driver.findElement(By.id("hrefIncAdt")).click();
					i++;
				}
				driver.findElement(By.id("btnclosepaxoption")).click();
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				driver.quit();
	}

}
