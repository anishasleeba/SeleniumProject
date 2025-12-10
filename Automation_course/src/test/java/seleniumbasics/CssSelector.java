package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base {

	// 1.Tag and ID(tag#id)
	// 2.Tag and class(tag.class)
	// 3.Tag and Attribute(tag[attribute=value]
	// 4.Tag,class,and Attribute(tag.classname[attribute=value]

	public void tagAndId() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement entervaluea = driver.findElement(By.cssSelector("input#value-a"));
		//homework
		WebElement showmessage =driver.findElement(By.cssSelector("button#button-one"));
		WebElement entervalueb = driver.findElement(By.cssSelector("input#value-b"));
		WebElement gettotal =driver.findElement(By.cssSelector("button#button-two"));
	}
	//homework3

	public void tagAndClass() {
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
		WebElement checkbox = driver.findElement(By.cssSelector("input.form-check-input"));
		//WebElement entervaluea = driver.findElement(By.cssSelector("input"));
	
	}

	public void tagAndAttribute() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message = driver.findElement(By.cssSelector("input[placeholder='Message']"));
		WebElement valuea = driver.findElement(By.cssSelector("input[id='value-a']"));
		WebElement valueb = driver.findElement(By.cssSelector("input[id='value-b']"));
		
	}

	public void tagClassAndAttribute() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message = driver.findElement(By.cssSelector("input.form-control[placeholder='Message']"));
		WebElement valuea = driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
		WebElement valueb = driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CssSelector csselector = new CssSelector();
		csselector.initialiseBrowser();

	}

}
