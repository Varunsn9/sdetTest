package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pjt1Test {
	@Test
	public void m1Test()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
}
