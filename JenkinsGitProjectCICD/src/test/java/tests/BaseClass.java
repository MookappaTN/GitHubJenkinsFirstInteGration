package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utils.ConfigReader;

public class BaseClass {

	
	@Test(groups = {"sanity"})
	public void verifyRegister() {
		WebDriver driver = new ChromeDriver();
		driver.get(ConfigReader.getProps("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[text()='Register'])[last()]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Register/Sign in')]")).isDisplayed());
		
		driver.findElement(By.xpath("//*[contains(@class,'close-icon')]")).click();
		driver.quit();
	}
	

	@Test(groups = {"reg"})
	public void verifyRegister1() {
		WebDriver driver = new ChromeDriver();
		driver.get(ConfigReader.getProps("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[text()='Register'])[last()]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Register/Sign in')]")).isDisplayed());
		
		driver.findElement(By.xpath("//*[contains(@class,'close-icon')]")).click();
		driver.quit();
	}
	
	
	
}
