package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	
private WebDriver driver; 
	
	public home(WebDriver driver) {
			super();
			this.driver = driver;
	PageFactory.initElements(driver, this); 

		}

		
		@FindBy(xpath="//*[@id=\"login-block\"]/div/ul/li[1]/a")
		private WebElement Signupbutton; 
		
		public String getHomePageURL() {
			return this.driver.getCurrentUrl();
			}

		public void ClickSignup() {
			 this.Signupbutton.click();
			
		}

		
		
	}


