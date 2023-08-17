package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void AmazonTest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening amazon", true);
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(3000);
	  driver.close(); 
	  
  }
}
