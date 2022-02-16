package com.manoj.java.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestCase {
	public void case1() throws InterruptedException, IOException {
		String url = "http://demo.automationtesting.in/Alerts.html";
		System.setProperty("webdriver.chrome.driver", "/home/manoj/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		screenShot(driver, "alert1");
		String alertText = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		System.out.println(alertText);
		Thread.sleep(1000);
		driver.close();
	}
	public void case2() {
		System.setProperty("webdriver.chrome.driver", "/home/manoj/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.close();
	}
	public void case3() {
		System.setProperty("webdriver.chrome.driver", "/home/manoj/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.close();
	}
	public void case4() {
		System.setProperty("webdriver.chrome.driver", "/home/manoj/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.close();
	}
	public void case5() {
		System.setProperty("webdriver.chrome.driver", "/home/manoj/SeleniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.close();
	}
	public void screenShot(WebDriver driver, String title) throws IOException {
		TakesScreenshot tss = (TakesScreenshot)driver;
		File screenshotAs = tss.getScreenshotAs(OutputType.FILE);
		File snap = new File("/home/manoj/eclipse-workspace-java8/JavaTest/images/"+title+".png");
		FileUtils.copyFile(screenshotAs, snap);
	}
}