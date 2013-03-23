package TestsToRun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReachAndSearch {
  @Test
  public void f() {
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.navigate().to("http://www.google.com");
	  
	  
	  
	  driver.close();
  }
  
  public static void set(){
	  
  }
}
