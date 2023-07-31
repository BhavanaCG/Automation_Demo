package Auto_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonerelativexpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\automation\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	   // WebElement watchwomen = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       // watchwomen.sendKeys("watches for women");
		//WebElement SearchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		//SearchButton.click();
		
		//Relative Xpath 
		
		/*WebElement watchwomen1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		watchwomen1.clear();
		WebElement watchmen = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    watchmen .sendKeys("watches for men");
	    WebElement SearchButton2 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    SearchButton2.click();*/
	    
	    /* driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")) .sendKeys("watches for men");
		 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();*/
		
		/*driver.navigate().back();
		WebElement watchmen = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		watchmen .sendKeys("watches for men");
	    WebElement SearchButton2 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		SearchButton2.click();*/
		
	   
	       //Xpath with OR
	    
	     /*  WebElement watchwomen = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']"));
	     watchwomen.sendKeys("watches for women"); 
	     WebElement SearchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button' or @name='nav-input nav-progressive-attribute']"));
		 SearchButton.click();*/
		
			
		 //Xpath with AND
		    
	    /* WebElement watchwomen = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords']"));
	     watchwomen.sendKeys("watches for women"); 
	     WebElement SearchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @class='nav-input nav-progressive-attribute']"));
		 SearchButton.click();*/
		
		 
		 //Xpath with contains
		 
		/* WebElement watchwomen = driver.findElement(By.xpath("//input[contains(@id,'twotabsearch')]"));
		 watchwomen.sendKeys("watches for women"); 
		 WebElement SearchButton = driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-')]"));
	     SearchButton.click();*/
			 
		//Xpath starts with
		
		 /* WebElement watchwomen = driver.findElement(By.xpath("//input[starts-with(@id,'two')]"));
		 watchwomen.sendKeys("watches for women"); 
		 WebElement SearchButton = driver.findElement(By.xpath("//input[starts-with(@id,'nav-search-sub')]"));
		 SearchButton.click();*/
			 
			 //Xpath with Text
	     
	   /*  WebElement Watch = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		 Watch.click();*/
		  		
		//Chained Xpath
		 
		 WebElement watchwomen = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' // @name='field-keywords']"));
	     watchwomen.sendKeys("watches for women"); 
	     WebElement SearchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button' // @name='nav-input nav-progressive-attribute']"));
		 SearchButton.click();
		
		 
		 
		 
		
	   
		
			 
	
		 
			 
				
	    
}}