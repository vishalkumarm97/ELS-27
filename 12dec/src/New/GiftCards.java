

package New;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  GiftCards
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		

	    
	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[7]/a")).click();
	    
	    Thread.sleep(1000);
	    driver.close();
	}
}
