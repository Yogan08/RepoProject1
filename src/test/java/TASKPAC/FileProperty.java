package TASKPAC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fileobj = new File(".//src/test/resources/taskfile.properties");
		Properties prop = new Properties(); 
		FileOutputStream  fos = new FileOutputStream(fileobj);
		prop.setProperty("Username", "Yogan");
		prop.setProperty("Password", "12341");
		prop.setProperty("URL", "www.amazon.com");
		prop.setProperty("Db", "MongoDB");
		prop.setProperty("Env", "Live");
		
		prop.save(fos, "Updated the File");
		
		FileInputStream fis = new FileInputStream(fileobj);

		prop.load(fis);
		String Url= prop.getProperty("URL");
		System.out.println(Url);
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get(Url);
//		driver.manage().window().maximize();
		
	}

}
