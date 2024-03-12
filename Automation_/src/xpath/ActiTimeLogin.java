package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
	
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("http://desktop-imrp9k5/login.do");
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
			
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			
			driver.findElement(By.xpath("//input[@value='Create New User']")).click();
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Test Engg");
			
			driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("kat");
		
			driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("kat");
			
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Katherine");
			
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Langford");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
	}

}
