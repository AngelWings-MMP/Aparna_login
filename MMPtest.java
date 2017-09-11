package MMP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class MMPtest {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeTest
	public void Browser(){
		System.setProperty("Webdriver.firefox.driver", "geckodriver.exe");
	this.driver = new FirefoxDriver();
		
		
		
		this.driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/");
		wait = new WebDriverWait(driver,30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Patient Login"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".button.button-alt"))).click();
	}
	@Test(description="Login_valid",priority=1)
	public void Login() throws InterruptedException{
		//PgmMacysHomepage hpage = new PgmMacysHomepage(this.d1 );
		MMPLogin login = new MMPLogin(this.driver);
		String actual = login.Login();
		// boolean result = hpage.SearchJeans();
		System.out.println(actual);
String expected = "T_Jefferson1";
Assert.assertEquals(actual, expected);
	}

}
