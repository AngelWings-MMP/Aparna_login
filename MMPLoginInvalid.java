package MMP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MMPLoginInvalid {
	WebDriver driver;

	public MMPLoginInvalid(WebDriver driver){
		this.driver = driver;
	}
	public String Login() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("T_n1");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("123");
		driver.findElement(By.name("submit")).sendKeys(Keys.ENTER);
		
		Alert alrt = driver.switchTo().alert();
		String actual = alrt.getText();
	//	alrt.accept();
		return actual;

}
}