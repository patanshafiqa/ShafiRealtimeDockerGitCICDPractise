package seleniumPractise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.example.com");
		Actions act=new Actions(driver);
		
		//WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'More')]"));
		//act.moveToElement(ele).perform();
		//act.build();
		//ele.click();
		 WebElement menu = driver.findElement(By.id("menuItem"));
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 menu=wait.until(ExpectedConditions.visibilityOf(menu));
		 act.moveToElement(menu).perform();

	        // (Optional) Click a submenu item after hover
	        WebElement subMenu = driver.findElement(By.id("subMenuItem")); // Replace with actual locator
	        subMenu.click();
	        TakesScreenshot src= (TakesScreenshot)driver;
	        File f=src.getScreenshotAs(OutputType.FILE);
	        File destfile=new File("C:\\Users\\patan\\Downloads\\lokesh apllications\\sample.png");
	        
	        try {
				FileUtils.copyFile(f, destfile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}

}
