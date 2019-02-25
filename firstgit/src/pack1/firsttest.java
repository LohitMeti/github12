package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class firsttest {
	static{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
  
	@Test
	public void test1(){
		WebDriver drive=new ChromeDriver();
		drive.close();
	}
}
