package dropdownpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_UI_Dropdowns_EditBoxes_ErrorValdiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeoption);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Sunny");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sunny@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("aaaaaa");
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select s = new Select(dropdown);
		s.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("18/01/2025");
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
	}

}
