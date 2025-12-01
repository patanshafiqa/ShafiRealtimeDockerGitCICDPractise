package seleniumPractise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise4_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\patan\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://seleniumpractise.blogspot.com/#");
		//driver.manage().window().maximize();
		//WebElement element;
		//Thread.sleep(200);
		
		//driver.findElement(By.xpath("//td[.='FlipKart']/preceding-sibling::td/child::input[@type='checkbox']")).click();
		//System.out.println(s);
		//driver.close();
		//driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td/input[1]")).click();
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@id='customers']/tbody/tr[6]/td[1]")));
		
		
		
		
		//driver.get("https://testautomationpractice.blogspot.com/");
		//driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		//Alert alt=driver.switchTo().alert();
		//System.out.println(alt.getText());
		//alt.accept();
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 //Alert alt= wait.until(ExpectedConditions.alertIsPresent());
		 //alt.accept();
       
		//PROGRAM FOR MULTIPLE WINDOW HANDLES

	 WebDriver driver=new ChromeDriver();
	   driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
       String parentWindow=driver.getWindowHandle();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //JavascriptExecutor js = (JavascriptExecutor) driver;
       //js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id='newWindowBtn']")));
	     driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
	     Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window); // Switch to child window
                System.out.println("Switched to new window: " + driver.getTitle());
               // driver.close(); // Close the new window
	  
	}

}
	}
}

