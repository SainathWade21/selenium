package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1800,20000);
		
		driver.manage().window().setSize(dimension);
		
		driver.get("https://www.google.com/");
	}

}
