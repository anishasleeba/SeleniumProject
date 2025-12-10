package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	// WebElement elementname=driver.findElement(By.Locator("locator value"));

	public void id() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");		
		WebElement inputfield = driver.findElement(By.id("single-input-field"));
		inputfield.sendKeys("Anisha");		
		WebElement showmessage = driver.findElement(By.id("button-one"));
		showmessage.click();
	}

	public void id2() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");		
		WebElement inputfield1 = driver.findElement(By.id("value-a"));
		inputfield1.sendKeys("2");		
		WebElement inputfield2 = driver.findElement(By.id("value-b"));
		inputfield2.sendKeys("4");		
		WebElement gettotal = driver.findElement(By.id("button-two"));
		gettotal.click();
	}
	
	public void className() {
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement datepicker = driver.findElement(By.className("datepicker"));// only supports single class
		datepicker.click();
		
		//WebElement datepicker2 = driver.findElement(By.className("form-control"));
		//homework
		driver.navigate().to("https://selenium.qabible.in/bootstrap-alert.php");
		WebElement success = driver.findElement(By.className("btn-warning"));
		WebElement warning = driver.findElement(By.className("btn-warning"));
		WebElement danger = driver.findElement(By.className("btn-danger"));
		WebElement info = driver.findElement(By.className("btn-info"));
	}
	
	public void name() {
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement  date= driver.findElement(By.name("daterange"));
		//homework
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement jquerydate=driver.findElement(By.name("from"));
		WebElement jquerydate2=driver.findElement(By.name("to"));
		
	}
	
	public void linkText() {
		driver.navigate().to("https://selenium.qabible.in/jquery-date-picker.php");
		WebElement  checkboxdemo= driver.findElement(By.linkText("Checkbox Demo"));
		//homework
		WebElement  simpleformdemo= driver.findElement(By.linkText("Simple Form Demo"));
		WebElement  radiobuttonsdemo= driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement  selectinput= driver.findElement(By.linkText("Select Input"));
		WebElement  formsubmit= driver.findElement(By.linkText("Form Submit"));
		WebElement  ajaxformsubmit= driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement  jqueryselect2= driver.findElement(By.linkText("Jquery Select2"));
		
	}
	
	public void partialLinkText() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement  checkboxdemo= driver.findElement(By.partialLinkText("Checkbox D"));
		//homework
		WebElement  simpleformdemo= driver.findElement(By.partialLinkText("Simple Form D"));
		WebElement  radiobuttonsdemo= driver.findElement(By.partialLinkText("Radio Buttons D"));
		WebElement  selectinput= driver.findElement(By.partialLinkText("Select In"));
		WebElement  formsubmit= driver.findElement(By.partialLinkText("Form S"));
		WebElement  ajaxformsubmit= driver.findElement(By.partialLinkText("Ajax Form S"));
		WebElement  jqueryselect2= driver.findElement(By.partialLinkText("Jquery Se"));
		
		
	}
	
	public void tagName() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement>  tagname= driver.findElements(By.tagName("a"));
		
		driver.navigate().to("https://selenium.qabible.in/jquery-date-picker.php");
		List<WebElement>  tagname2= driver.findElements(By.tagName("a"));
		
	}

	public static void main(String[] args) {

		Locators locator = new Locators();
		locator.initialiseBrowser();
		// locator.id();
		//locator.id2();
		//locator.className();
	}

}
