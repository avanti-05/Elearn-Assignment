package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register {
	
	private WebDriver driver;
	
	public register(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
		 String First1;
		 String Last1;
		 

	
	@FindBy(linkText="http://elearningm1.upskills.in/main/auth/inscription.php")
	private WebElement Signup; 
	
	@FindBy(id="registration_firstname")
	private WebElement Fname;
	
	@FindBy(id="registration_lastname")
	private WebElement Lname; 
	
	@FindBy(id="registration_email")
	private WebElement email; 
	
	@FindBy(id="username")
	private WebElement UID; 
	
	@FindBy(id="pass1")
	private WebElement PWD; 
	
	@FindBy(id="pass2")
	private WebElement cPWD; 
	
	@FindBy(id="registration_submit")
	private WebElement Registration;
	
	//first name last name verify
	@FindBy(xpath = "//div[@class='col-xs-12 col-md-12']/p")
    private WebElement texts;
	
	//clicking on homepage
	//@FindBy(xpath="//*[@id=\"navbar\"]/ul[1]/li[1]/a")
	//private WebElement homes;
	
	
	public void NewUser() {
		this.Signup.click();
		}
	
	public void sendFirstname(String Fname) {
		this.Fname.sendKeys(Fname);
		First1=Fname;
	}
	
	public void sendLastname(String Lname) { 
		this.Lname.sendKeys(Lname);
		Last1=Lname;
}
	public void EmailReg(String email) { 
		this.email.sendKeys(email);
	}
	
	public void Username(String UID) {
		this.UID.sendKeys(UID);
	}
	
	public void Password(String PWD) { 
		this.PWD.sendKeys(PWD);
	}
	public void ConfirmPWD(String cPWD) { 
		this.cPWD.sendKeys(cPWD);
		
	}
	public void RegistrationButton() {
		this.Registration.click();
		
   }
	public String GetFnameLname() {
		String s = First1.concat(" ");
		String finalname = s.concat(Last1);
		return finalname;
	}
	 public boolean VerifyText(String S) {
	        boolean Flag;
	        String H = texts.getText();
	    	if(H.contains(S)) 
	    {
	    		Flag = true;
	   	        return Flag;
	   	 }
	    	else 
	    		
	    	{
	    		Flag = false;
	    		return Flag;
	    	}
	    	 
	    }
	 //public void clickHome() throws InterruptedException {
		// Thread.sleep(5000);
	    //	this.homes.click();
}




