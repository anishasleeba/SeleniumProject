package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPath extends Base {

	public void absoluteXPath() {
		// singleslash , start from root of the node

	}

	public void relativeXPath() {
		// use double slash, start from middle
		// tagname[@attribute='value']
		WebElement message = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
	}

	public void test() {
		// tagname[text()='value']
		WebElement showMessage = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement getTotal = driver.findElement(By.xpath("//button[text()='Get Total']"));
	}

	public void contains() {
		// tagname[contains(@attribute,'value')] 
		//tagname[contains(text(),'value')]
		WebElement message = driver.findElement(By.xpath("//input[contains(@id,'single')]"));
		WebElement showMessage= driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
	}

	public void startsWith() {
		// tagname[starts-with(@attribute,'value')  
		WebElement message = driver.findElement(By.xpath("//input[starts-with(@id,'single-i')]"));
		WebElement showMessage= driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
	}

	public void and() {
		// tagname[@attribute='value' and @attribute='value']
		WebElement message = driver.findElement(By.xpath("//input[@id='single-input-field' and @class='form-control']"));
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one' and contains(@class,'btn-primary')]"));
	}

	public void or() {
		// tagname[@attribute='value' or @attribute='value']
		//homework
		//homework for submit form page

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XPath xpath = new XPath();
		xpath.initialiseBrowser();
	}

}
