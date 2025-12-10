package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestClass extends Base{
	
	public void className() {
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement classname = driver.findElement(By.className("datepicker"));
		classname.click();
		
	}

	public static void main(String[] args) {
		TestClass classname = new TestClass();
		classname.initialiseBrowser();
		classname.className();
		

	}

}
