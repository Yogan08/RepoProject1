package TASKPAC;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionstask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://cacert.com");

		
		
//		options.addArguments("--disable-popup-blocking");
//		options. addArguments("--headless");
//	    String title = driver.getTitle();
//        System.out.println("Page title is: " + title);
//        driver.quit();
		
		
		
	}

}
