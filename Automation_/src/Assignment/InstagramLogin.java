package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Instagram login

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("8654427353");
		
        driver.findElement(By.name("password")).sendKeys("pass#123");
        
		driver.findElement(By.className("_acap")).click();;
		
	}

}
