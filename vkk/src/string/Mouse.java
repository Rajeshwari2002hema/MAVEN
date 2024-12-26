package string;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) throws Exception {
		WebDriver d=new ChromeDriver();
		d.get("https://www.vtiger.com/");
	    WebElement e=d.findElement(By.linkText("Company"));
	    Actions a=new Actions(d);
	    a.moveToElement(e).perform();
	    d.findElement(By.linkText("Contact Us")).click();
	    d.findElement(By.xpath(""))
	    
	}

}

