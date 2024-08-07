package TASKPAC;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities cap = new DesiredCapabilities();	
		cap.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		
	}

}
