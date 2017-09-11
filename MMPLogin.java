package MMP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MMPLogin {
WebDriver driver;

	public MMPLogin(WebDriver driver){
		this.driver = driver;
	}
	public String Login() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("T_Jefferson1");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("Jefferson@123");
		driver.findElement(By.name("submit")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String actual = driver.findElement(By.xpath("//span[@class='username']")).getText();
		System.out.println("Title "+actual);
		return actual;
		
	}
}
