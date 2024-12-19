package string;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popp {

	public static void main(String[] args) throws Exception {
		
WebDriver n= new ChromeDriver();
n.get("https://secure.indeed.com/");
n.findElement(By.id("login-google-button")).click();
n.switchTo().defaultContent();
	}

}
