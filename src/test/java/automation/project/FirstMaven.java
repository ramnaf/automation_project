package automation.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class FirstMaven {

	public static void main(String[] args) {

		
		Faker myfaker = new Faker();
			System.out.println(myfaker.finance().creditCard());
			  System.setProperty("webdriver.chrome.driver",
		                "/Users/ramile/selenium dependencies/drivers/chromedriver/");
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		
	}
}
