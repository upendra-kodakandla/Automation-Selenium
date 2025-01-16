package intoduction;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author upendra
 *
 */
/**
 * @author upendra
 *
 */
public class Locators {
	 
	
	/*
	 * Xpath : 
	 * //tagname[@attribute = 'value']
	 * //tagname[@attribute= 'value'](index value)
	 * //tagname[text()='value']
	 * //tagname[contains(@attribute,'value')]
	 * //tagname[@attribute = 'value']/following-sibling::tagname
	 *
	 * console:
	 * $X('xpath')
	 */
	
	/*
	 * Css Selector : 
	 * Tagname.classname
	 * classname 
	 * tagname#id
	 * Tagname[attribute='value']
	 * tagname[attribute='value'] child tagname
	 * tagname[attribute='value']:nth-child(index value)
	 * tagname child tagname
	 * tagname[attribute*='semivalue']
	 * tagname
	 * console
	 * $('css')----> $('p.error')
	 */
	
	
		

	public static void main(String[] args) throws InterruptedException {
		String Username = "rahul";
		// TODO Auto-generated method stub
		ChromeOptions chromeoption=new ChromeOptions();
		  chromeoption.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeoption);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("Password");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("111222333345");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		Thread.sleep(1000);
		String password = getPassword(driver);
		System.out.println(password);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(Username);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " +Username+",");
		driver.findElement(By.xpath("//*[@class='logout-btn']")).click();
		driver.quit();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String pwd = driver.findElement(By.cssSelector("form p")).getText();
		String password = pwd.split("'")[1].split("'")[0].trim();
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		Thread.sleep(1000);
		return password;
		
	}

}
