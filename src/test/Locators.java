package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) {
		System.out.println("hello...");
		System.setProperty("webdriver.chrome.driver","/Users/bijithmp/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.01:8084/home");
		WebElement cuizineName = driver.findElement(By.name("cuizineName")); 
		cuizineName.sendKeys("biriyani");
		WebElement btnSearch = driver.findElement(By.name("submit"));
		btnSearch.click();
		WebElement btnReg = driver.findElement(By.name("registerSubmit"));
		btnReg.click();
		WebElement userName = driver.findElement(By.name("username")); 
		userName.sendKeys("priya");
		WebElement address = driver.findElement(By.name("address")); 
		address.sendKeys("315 yellowoodway");
		WebElement emailid = driver.findElement(By.name("emailid")); 
		emailid.sendKeys("priya2021@gmail.com");
		WebElement phone = driver.findElement(By.name("phoneno")); 
		phone.sendKeys("9539005490");
		WebElement password = driver.findElement(By.name("password")); 
		password.sendKeys("priya2021@gmail.com");
		WebElement btnRegister = driver.findElement(By.name("submit"));
		btnRegister.click();
		WebElement btnMenu = driver.findElement(By.name("search"));
		btnMenu.click();
		driver.findElement(By.name("selid")).click();
		WebElement btnAdd = driver.findElement(By.name("submit"));
		btnAdd.click();
		WebElement btnPay = driver.findElement(By.name("payment"));
		btnPay.click();
		WebElement nameCard = driver.findElement(By.name("name")); 
		nameCard.sendKeys("priya kumar");
		WebElement bankName = driver.findElement(By.name("Bankname")); 
		bankName.sendKeys("HDFC");
		WebElement accNum = driver.findElement(By.name("accnum")); 
		accNum.sendKeys("#23333oww");
		WebElement cvv = driver.findElement(By.name("cvv")); 
		cvv.sendKeys("#2ederw");
		driver.findElement(By.xpath("//a[@href='/paymentsubmit']")).click();
		
		
//		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
//		Select ddMonth = new Select(month);
//		ddMonth.selectByValue("1");
//		ddMonth.selectByVisibleText("Jan");
//		ddMonth.selectByIndex(0);
		
		
		
	}
	

}
