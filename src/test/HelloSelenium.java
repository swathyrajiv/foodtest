package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

	public static void main(String args[]) {
		System.out.println("hello...");
		System.setProperty("webdriver.chrome.driver","/Users/bijithmp/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.01:8084/");
		WebElement editUsername = driver.findElement(By.name("userName")); 
		editUsername.sendKeys("admin");
		WebElement editPwd = driver.findElement(By.name("password"));
		editPwd.sendKeys("admin");
		WebElement btnLogin = driver.findElement(By.name("submit"));
		btnLogin.click();
		driver.findElement(By.xpath("//a[@href='/addCuizine']")).click();
		WebElement cuizineName = driver.findElement(By.name("cuizineName"));
		cuizineName.sendKeys("biriyani");
		WebElement cuizineType = driver.findElement(By.name("cuizineType"));
		cuizineType.sendKeys("mexican");
		WebElement vegornonveg = driver.findElement(By.name("vegornonveg"));
		vegornonveg.sendKeys("veg");
		WebElement vegan = driver.findElement(By.name("vegan"));
		vegan.sendKeys("vegan");
		WebElement price = driver.findElement(By.name("price"));
		price.sendKeys("12");
		WebElement btnSubmit = driver.findElement(By.name("submit"));
		btnSubmit.click();
		driver.findElement(By.xpath("//a[@href='/log']")).click();
		driver.findElement(By.xpath("//a[@href='/editCuizineD']")).click();
		WebElement cuizineEditName = driver.findElement(By.name("editCuizine"));
		cuizineEditName.sendKeys("biriyani");
		WebElement btnSubmitEdit = driver.findElement(By.name("submit"));
		btnSubmitEdit.click();
		WebElement cuizineEditCode = driver.findElement(By.name("product_id"));
		cuizineEditCode.sendKeys("5");
		WebElement btnSubmitEditCode = driver.findElement(By.name("submit"));
		btnSubmitEditCode.click();
		WebElement cuizineEditNameAdd = driver.findElement(By.name("cuizineName"));
		cuizineEditNameAdd.sendKeys("biriyani");
		WebElement cuizineEditTypeAdd = driver.findElement(By.name("cuizineType"));
		cuizineEditTypeAdd.sendKeys("Indian");
		WebElement cuizineEditVegAdd = driver.findElement(By.name("vegornonveg"));
		cuizineEditVegAdd.sendKeys("nonveg");
		WebElement cuizineEditVeganAdd = driver.findElement(By.name("vegan"));
		cuizineEditVeganAdd.sendKeys("vegan");
		WebElement cuizineEditPriceAdd = driver.findElement(By.name("price"));
		cuizineEditPriceAdd.sendKeys("12");
		WebElement btnSubmitEditAdd = driver.findElement(By.name("submit"));
		btnSubmitEditAdd.click();
		driver.findElement(By.xpath("//a[@href='/log']")).click();
		driver.findElement(By.xpath("//a[@href='/changepassword']")).click();
		WebElement userName = driver.findElement(By.name("userName"));
		userName.sendKeys("admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin");
		WebElement cpassword = driver.findElement(By.name("cpassword"));
		cpassword.sendKeys("admin");
		WebElement btnSubmitChangeIds = driver.findElement(By.name("submit"));
		btnSubmitChangeIds.click();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		
		
		
	}
}