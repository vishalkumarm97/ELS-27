package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://a.testaddressbook.com/sign_up");
		driver.manage().window().maximize();
		//driver.findElement(By.id("sign-")).click();
		driver.findElement(By.id("user_email")).sendKeys("vishalkumarm95@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("vishal@909");
		driver.findElement(By.name("Sign up")).click();
	//	driver.close();

	}

}
