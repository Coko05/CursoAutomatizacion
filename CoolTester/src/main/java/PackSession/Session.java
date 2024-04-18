package PackSession;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session {
	
   public static void  main( String[] args)  {
	
	WebDriver driver = new ChromeDriver();	
	driver.get("https://www.google.com");
	
   		}
}


