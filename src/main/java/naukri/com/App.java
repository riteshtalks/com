package naukri.com;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App {
	public static void runtest() throws InterruptedException, IOException {
		
		 Random rand = new Random();
		 readProperties props = new readProperties();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// Open facebook
		driver.get("https://www.naukri.com");

		// Maximize browser
		
		
		
		String email = props.readPropertiesName("EMAIL");
		String password = props.readPropertiesName("PASSWORD");

		System.out.println(props.readPropertiesName("EMAIL"));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/input")));

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/input")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[5]/button")).click();

		Thread.sleep(2000);
		WebElement myNaukri = driver.findElement(By.xpath("//div[(text()='My Naukri')]"));

		Thread.sleep(3000);

		Actions builder = new Actions(driver);
		builder.moveToElement(myNaukri).perform();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement EditProfile = driver.findElement(By.xpath("//ul//div//a[@title=\"Edit Profile\"]"));
		EditProfile.click();

		Thread.sleep(2000);

		WebElement icon_edit = driver.findElement(By.xpath("//div//em[@class=\"icon edit\"]"));
		icon_edit.click();

		Thread.sleep(2000);
		
		int randomNumber = rand.nextInt(100);
		
		WebElement cCode = driver.findElement(By.id("tel_cCode"));
		cCode.clear();
		Thread.sleep(2000);
		cCode.sendKeys(Integer.toString(randomNumber));
		Thread.sleep(2000);

		WebElement save_button = driver.findElement(By.id("saveBasicDetailsBtn"));
		save_button.click();
		
		driver.quit();

		//WebElement today_updated_message = driver.findElement(By.xpath("//div//span[contains(text(),\"today\")]"));
		

	}
}
