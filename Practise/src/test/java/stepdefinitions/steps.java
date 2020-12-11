package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.compose;
import pageobjects.home;
import pageobjects.register;

public class steps {
	
	 WebDriver driver = new ChromeDriver();
	 home hom = new home(driver);
	 register Reged = new register(driver);
	 compose Compo = new compose(driver);

	 
@Given("^Lauch Epic e-learning application url$")
public void lauch_Epic_e_learning_application_url() throws Throwable {
	driver.get("http://elearningm1.upskills.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^Navigated to Homepage$")
public void navigated_to_Homepage() throws Throwable {
		System.out.println("Navigated to homepage");
}

@Then("^Click on Signup$")
public void click_on_Signup() throws Throwable {
	hom.ClickSignup();
}

@Then("^Enter \"([^\"]*)\" First name , \"([^\"]*)\" Last name , \"([^\"]*)\" emailID , \"([^\"]*)\" username , \"([^\"]*)\" password , \"([^\"]*)\" confirm password$")
public void enter_First_name_Last_name_emailID_username_password_confirm_password(String Fname, String Lname, String email, String UID, String PWD, String cPWD) throws Throwable {
	 Reged.sendFirstname(Fname);
	   Reged.sendLastname(Lname);
	   Reged.EmailReg(email);
	   Reged.Username(UID);
	   Reged.Password(PWD);
	   Reged.ConfirmPWD(cPWD);
}

@Then("^Click on Register button$")
public void click_on_Register_button() throws Throwable {
	Reged.RegistrationButton();
	   Thread.sleep(1000);
}

@Then("^Verify the Fname and Lname$")
public void verify_the_Fname_and_Lname() throws Throwable {
	String Name = Reged.GetFnameLname();
	System.out.println(Name);
	boolean B=Reged.VerifyText(Name);
	Assert.assertTrue(B);
	System.out.println("Scenario 1 - validated");
}

@Then("^Click on Homepage$")
public void click_on_Homepage() throws Throwable {
	driver.findElement(By.xpath("/html/body/main/header/nav/div/div[2]/ul[1]/li[1]/a")).click();
	System.out.println("Clicked on Homepage");
}

@When("^In Homepage$")
public void in_Homepage() throws Throwable {
	String X = hom.getHomePageURL();
	System.out.println(X);
}

@Then("^Click on Compose$")
public void click_on_Compose() throws Throwable {
	Compo.ComposeMessage();
    Thread.sleep(1000);
}

@Then("^Enter the \"([^\"]*)\" mail ID  , \"([^\"]*)\" subject line  , \"([^\"]*)\" message$")
public void enter_the_mail_ID_subject_line_message(String Recipeint, String Subject, String Message) throws Throwable {
	 Compo.SendTo(Recipeint);
	   Compo.Subjectline(Subject);
	   driver.findElement(By.xpath("/html/body")).sendKeys(Message);
	   System.out.println("message is written");
}

@Then("^Click on Send button$")
public void click_on_Send_button() throws Throwable {
	Compo.SendMessage();
    Thread.sleep(1000);
}

@Then("^Verify the acknowledgement$")
public void verify_the_acknowledgement() throws Throwable {
	String Actual = Compo.getacktext();
	System.out.println(Actual);
	String Expected ="The message has been sent to naveen naveen (naveen)";
	Assert.assertEquals(Actual , Expected);
	System.out.println("acknowldgemnt is verified");
	
}


}
