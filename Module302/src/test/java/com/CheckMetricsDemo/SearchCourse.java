package com.CheckMetricsDemo;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchCourse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
				ChromeDriver driver = new ChromeDriver(options);
				
				driver.get("https://www.edureka.co/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
			//	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				WebElement search = driver.findElement(By.xpath("//*[@id=\"search-inp3\"]"));
				search.click();
				WebElement search1 = driver.findElement(By.id("search-inp-overlay-new"));
				search1.click();
				search1.sendKeys("Selenium");
				search1.sendKeys(Keys.ENTER);
				WebDriverWait wait = new WebDriverWait(driver,1000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id=\"add-master-courses\"]//span[contains(@class,'viewdetailsbtn')])[1]")));
				
				
				driver.findElement(By.xpath("(//*[@id=\"add-master-courses\"]//span[contains(@class,'viewdetailsbtn')])[1]")).click();
				
				Thread.sleep(15000);
				driver.close();
				
				System.out.println("Search Page is displaying Details properly");
	}
}
