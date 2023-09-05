package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pjt1Test {
	//WebDriver driver;
	@Test
	public void m1Test()
	{
		String BROWSER = System.getProperty("browser");
		 String URL = System.getProperty("url");
	    if(BROWSER.equalsIgnoreCase("chrome"))
	    {
	    //WebDriverManager.chromedriver().setup();
	    //	driver=new ChromeDriver();
	    	System.out.println("chromebrowser is launching");
	    }else if(BROWSER.equalsIgnoreCase("edge"))
	    {
	    	//WebDriverManager.edgedriver().setup();
	    	//driver=new EdgeDriver();
	    	System.out.println("edgebrowser is launching");
	    }else {
	    	//WebDriverManager.edgedriver().setup();
	    	//driver=new EdgeDriver();
	    	System.out.println("chromebrowser is launching");
	    }
	   // driver.get(URL);
	    System.out.println(URL);
	}
}
