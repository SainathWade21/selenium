package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/login");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sanket.barbole14@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sanketb@123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
