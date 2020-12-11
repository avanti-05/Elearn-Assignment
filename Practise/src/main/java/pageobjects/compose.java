package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class compose {
	
	private WebDriver driver;
	
	 public compose(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	 
//JavascriptExecutor js = (JavascriptExecutor) this. driver;

@FindBy(xpath="/html/body/main/section/div/div[2]/div[2]/div/div[2]/div/div[2]/div/ul/li[2]/a")
private WebElement Compose; 

@FindBy(className="select2-search__field")
private WebElement Recipeint;

@FindBy(id="compose_message_title")
private WebElement Subject; 

//@FindBy(xpath="/html/body/p/link[1]")
//private WebElement Message; 

@FindBy(xpath="//html/body/main/section/div/div[2]/div/div/div[2]/div/div[2]/form/fieldset/div[7]/div[1]/button")
private WebElement Send; 

@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[2]/div/div[1] ")
private WebElement acktext; 



public void SendTo(String Recipeint) throws InterruptedException {
	this.Recipeint.sendKeys(Recipeint);
	Thread.sleep(5000);
	this.Recipeint.sendKeys(Keys.ENTER);
}

public void Subjectline(String Subject) { 
	this.Subject.sendKeys(Subject);
	this.Subject.sendKeys(Keys.TAB);
}
//public void MesaageBox(String Message) {
	//this.Message.sendKeys(Message);
//}

public void SendMessage() throws InterruptedException {
	//js.executeScript("window.scrollBy(0,1000)");
	this.Send.click();
	
}
public void ComposeMessage() {
	this.Compose.click();
	
}
public String getacktext() {
	String B = this.acktext.getText();
	return B;
	
}
	


}


