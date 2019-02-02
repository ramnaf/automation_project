package TestCases_BasicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationAddressBook {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("/webdriver.chrome.driver","Users/ramile/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://a.testaddressbook.com/sign_in");
        // finding element from page
        WebElement inputEmail = driver.findElement(By.id("session_email"));
        Thread.sleep(1000);
        // enter the username
        inputEmail.sendKeys("kexesobepu@zsero.com");
        Thread.sleep(1000);

        WebElement inputPassword = driver.findElement(By.id("session_password"));
        Thread.sleep(1000);

        inputPassword.sendKeys("password");
        Thread.sleep(1000);

        // locates the sign in button
        WebElement signinButton = driver.findElement(By.name("commit"));

        System.out.println(driver.getTitle());

        // clicks on the button
        signinButton.click();

        System.out.println(driver.getTitle());

        //located the username element
	
        WebElement username = driver.findElement(By.className("navbar-text"));

        String actualUsername = username.getText();

        System.out.println(actualUsername);


        if("kexesobepu@zsero.com".equals(actualUsername)) {
            System.out.println("PASS");

        }else{

            System.out.println("FAIL");
            System.out.println("EXPECTED: kexesobepu@zsero.com");
            System.out.println("actualUsername = " + actualUsername);
        }


        if ( !driver.getTitle().contains("Sign In") ) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
            System.out.println(driver.getTitle());
        }

	 }


    // driver.findElement(By.xpath("//*[@id=\"clearance\"]/div/div/form/div[3]/input")).click();
    //Thread.sleep(1000);

	
	}

