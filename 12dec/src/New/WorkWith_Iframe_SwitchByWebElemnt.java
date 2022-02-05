package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWith_Iframe_SwitchByWebElemnt 
{

	public static void main(String[] args) throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/LENOVO/Downloads/iframe.html");
	driver.manage().window().maximize();

   //switch to frame by index or frameId
		   // driver.switchTo().frame(0);
//	Thread.sleep(1000);
	//driver.findElement(By.xpath("//*[@id=\"__cricketsubscribe\"]/div[2]/div[2]/a[2]")).click();
		    //driver.findElement(By.xpath("//a[text()='BUSINESS']")).click();
		   
		    
		    //switch to frame by name
		  //  driver.switchTo().frame("frame1");
//	Thread.sleep(1000);
	//driver.findElement(By.xpath("//*[@id=\"__cricketsubscribe\"]/div[2]/div[2]/a[2]")).click();
		    //driver.findElement(By.xpath("//a[text()='BUSINESS']")).click();
		    
		    //switch to frame by webElement
			    driver.switchTo().frame(driver.findElement(By.name("frame1")));
			    	Thread.sleep(1000);
			    driver.findElement(By.xpath("//*[@id=\"__cricketsubscribe\"]/div[2]/div[2]/a[2]")).click();
			    driver.findElement(By.xpath("//a[text()='BUSINESS']")).click();


		    
		    
		    driver.close();


		}

	}


 



