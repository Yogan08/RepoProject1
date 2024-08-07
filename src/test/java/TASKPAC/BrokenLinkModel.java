package TASKPAC;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			WebElement ite = links.get(i);
			String href = ite.getAttribute("href");
			if(href==null ||href.isEmpty()) {
				System.out.println("The Link Invalid !");
			}else if (!href.startsWith("https://www.ajio.com/"))
			{
				System.out.println("The Link not related to Website"+ href);
				}
			else {
				try {
				URL url = new URL(href);
				HttpURLConnection httpconnect =(HttpURLConnection)  url.openConnection();
				httpconnect.connect();
				int rescode = httpconnect.getResponseCode();
				if(rescode==200) {
					System.out.println("Not a Broken Link"+ href);
				}else {
					System.out.println("The link is Broken Link"+ href);
				}
				}
				catch(Exception e) {
					
				}
				
			}
			}
	}

}
