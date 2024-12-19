package string;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class sss {
public static void main(String[] args) throws InterruptedException {
	WebDriver n=new ChromeDriver();
	n.get("https://www.facebook.com/");
	n.findElement(By.linkText("Create new account")).click();
	WebElement day = n.findElement(By.id("day"));
	Select s=new Select(day);
	s.selectByIndex(6);
	Thread.sleep(2000);
	s.selectByVisibleText("31");
	Thread.sleep(2000);
	s.selectByValue("24");
	Thread.sleep(2000);
s.getFirstSelectedOption();
	WebElement month = n.findElement(By.id("month"));
	Select s2=new Select(month);
	s2.selectByIndex(6);
	Thread.sleep(2000);
	s2.selectByVisibleText("Jun");
	Thread.sleep(2000);
	s2.selectByValue("11");
	WebElement year = n.findElement(By.id("year"));
	Select s3=new Select(year);
	s3.selectByIndex(6);
	Thread.sleep(2000);
	s3.selectByVisibleText("2021");
	Thread.sleep(2000);
	s3.selectByValue("2019");
}
}
