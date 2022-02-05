package New;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class   DWS_login3
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		actions.sendKeys(driver.findElement(By.xpath("//*[@id=\"Email\"]")),"invalid").perform();
		actions.sendKeys(driver.findElement(By.xpath("//*[@id=\"Password\"]")),"invalid").perform();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		//	    WebElement elect_link = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
//	    actions.moveToElement(elect_link).build().perform();
//	    
	  
	    Thread.sleep(1000);
	    driver.close();
	}
 }
