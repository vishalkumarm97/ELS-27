package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://a.testaddressbook.com/sign_up");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[@id='sign-in']")).click();
	    driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("vishalkumarm95@gmail.com");
	    driver.findElement(By.xpath("//input[@name='user[password]']")).sendKeys("vishal@0054");
	    driver.findElement(By.cssSelector("input[name='commit']")).click();
	}
}