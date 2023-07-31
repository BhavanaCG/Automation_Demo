package Auto_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticeForm {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\automation\\chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	
	 WebElement FirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
	 FirstName.sendKeys("Bhaanu");
	
	 WebElement LastName = driver.findElement(By.xpath("//input[@id='lastName']"));
	 LastName .sendKeys("Sree");
	
	 WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
	 Email .sendKeys("sree@gmail.com");
	 
	 WebElement Female=driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
	 Female.click();
	 
	 WebElement Mobile=driver.findElement(By.xpath("//input[@id='userNumber']"));
	 Mobile.sendKeys("3344556677");
	 
	 WebElement DOB = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	 DOB .click();
	 
	
	 WebElement yearSelect = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
	 Select yearDropdown = new Select (yearSelect);
	 yearDropdown.selectByVisibleText("2000");
	 
	
	 
	 WebElement MonthSelect = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
	 Select monthDropdown = new Select(MonthSelect);
	 monthDropdown.selectByVisibleText("November");
	 
	
	 
	 WebElement DaySelect = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[5]"));
	 DaySelect.click();
	/* Select dayDropdown = new Select(DaySelect);
	   dayDropdown.selectByVisibleText("23");*/
	  
	
	/* WebElement Subject = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
     Subject.sendKeys("EVS");*/
	 
     WebElement HobbyCheckbox=driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label"));
     HobbyCheckbox.click();
     
     WebElement SelectPicture = driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]"));
	 SelectPicture.sendKeys("C:\\Users\\Dell\\OneDrive\\Desktop\\bhavuimages\\pic4.jpg");
	 
	 WebElement CurrentAddress = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
	 CurrentAddress .sendKeys("flat5,indira street");
	}

}
