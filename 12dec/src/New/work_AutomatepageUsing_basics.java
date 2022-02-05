package New;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class work_AutomatepageUsing_basics {
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
         //radio button
		driver.findElement(By.name("radioButton")).click();
		//text
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		//dropdown
		WebElement drop_down=driver.findElement(By.name("dropdown-class-example"));
		Select select=new Select(drop_down);
		select.selectByValue("option3");
			//checkbox
		WebElement check_box1=driver.findElement(By.xpath("//input[@name='checkBoxOption1']"));
		check_box1.click();
		WebElement check_box2=driver.findElement(By.xpath("//input[@name='checkBoxOption2']"));
		check_box2.click();


		WebElement switch1=driver.findElement(By.xpath("//button[@id='openwindow']"));
		switch1.click();

		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		for(String s:windows) {
			if(!s.equals(parent)) { 
				driver.switchTo().window(s);
				driver.manage().window().maximize();
				driver.close();
			}
		}

		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Set<String> windows1 = driver.getWindowHandles();
		for(String s:windows1) {
			if(!s.equals(parent)) {
				driver.switchTo().window(s);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vishal");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vishal");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		driver.switchTo().alert().accept();
		
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		driver.switchTo().frame(iframe);
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		
		for(int i=3;i<30;i++) {
			System.out.println(driver.findElement(By.xpath("(//td)["+i+"]")).getText());
		}

		System.out.println(driver.findElement(By.xpath("//tr[1]/td[1]")).getText());
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Top']"))).build().perform();

  driver.close();
}

}
