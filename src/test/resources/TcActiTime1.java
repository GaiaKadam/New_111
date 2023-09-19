import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TcActiTime1 {

 public static void login{
	 WebElement ele = driver.findElement(By.id("username"));
		ele.sendKeys(dd.propertyFetch("username"),Keys.TAB,dd.propertyFetch("password"),Keys.ENTER);
		
}
	 
 }
}
