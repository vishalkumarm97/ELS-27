package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkWith_WebDriverWait {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");

		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='ico-register']")))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='gender-male']")))).click();
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("virat");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("kohli");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("viratkohli18@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("RCBESCN");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("RCBESCN");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='register-button']")))).click();
		
		
		

	}

}

