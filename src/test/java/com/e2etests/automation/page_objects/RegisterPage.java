package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup; 
import org.openqa.selenium.JavascriptExecutor;
		public class RegisterPage {
			private ConfigFileReader configFileReader;
			
			
			/**@FindBy***/
			
			@FindBy(xpath = "//input[@name='firstName']")
			public static WebElement firstname;
			
			@FindBy(how = How.NAME,using = "lastName")
			public static WebElement lastname;
			
			@FindBy(how = How.NAME,using = "phone")
			public static WebElement phone;
			
			@FindBy(how = How.NAME,using = "userName")
			public static WebElement email;
			
			@FindBy(how = How.NAME,using = "address1")
			public static WebElement adresse;
			
			@FindBy(how = How.NAME,using = "city")
			public static WebElement city;
			
			@FindBy(how = How.NAME,using = "city")
			public static WebElement province;
			
			@FindBy(how = How.NAME,using = "postalCode")
			public static WebElement codepostale;
			
			@FindBy(how = How.NAME,using = "country")
			public static WebElement country;
			
			@FindBy(how = How.NAME,using = "email")
			public static WebElement username;
			
			@FindBy(how = How.NAME,using = "password")
			public static WebElement Passwordtxt;
			
			@FindBy(how = How.NAME,using = "confirmPassword")
			public static WebElement confirmpasswordtxt;
			
			@FindBy(how = How.NAME,using = "submit")
			public static WebElement btnsubmit;
			
			@FindBy(how = How.XPATH,using = "//font[contains(text(),'Thank you for registering.')]")
			public static WebElement welcomeMsg;
			
			public RegisterPage() {
			PageFactory.initElements(Setup.getDriver(), this); 
			this.configFileReader = new ConfigFileReader();
							}
			
			/**Create Methods **/
			public void goToUrl() {
			
				    Setup.getDriver().get(configFileReader.getProperties("register.url"));

				    WebDriverWait wait = new WebDriverWait(
				            Setup.getDriver(),
				            Duration.ofSeconds(10));

				    wait.until(ExpectedConditions.urlContains("register"));
				
			}
			
			/**Actions**/
			public void fillName(String firstName) {
				
		        firstname.sendKeys(firstName);
		    }
			public void filllastname(String lastName) {
				
		        lastname.sendKeys(lastName);
		    }

		    public void fillPhone(String phoneNumber) {
		    	
		        phone.sendKeys(phoneNumber);
		    }

		    public void fillEmail(String emailTxt) {
		    	
		        email.sendKeys(emailTxt);
		    }

		    public void fillAddresse(String addressTxt) {

		    	adresse.sendKeys(addressTxt);
		    }

		    public void fillCity(String cityTxt) {

		        city.sendKeys(cityTxt);
		    }

		    public void fillcodepostale(String postalCodeTxt) {
		    	
		    	codepostale.sendKeys(postalCodeTxt);
		    }

		    public void fillCountry(String countryTxt) {
		    	
			   Select select = new Select(country);
			   select.selectByValue("TUNISIA");
		    }
		    
		    public void fillProvince(String provinceX) {
		    	
		        province.sendKeys(provinceX);
		    }

		    public void fillUsername(String usernameTxt) {
		    	
		        username.sendKeys(usernameTxt);
		    }

		    public void fillPasswordtxt(String password) {
		    	
		    	Passwordtxt.sendKeys(password);
		    }

		    public void fillconfirmpasswordtxt(String confirmPassword) {
		    	
		        confirmpasswordtxt.sendKeys(confirmPassword);
		    }

		

		    public void clickbtnsubmit() {
		        JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
		        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", btnsubmit);
		        js.executeScript("arguments[0].click();", btnsubmit);
		    }
		   
		    public boolean welcomeMsgIsDisplayed() {
		        return welcomeMsg.isDisplayed();
		    }

		    public String getWelcomeMessage() {
		        return welcomeMsg.getText();
		    }

		   
		}
			
		

	


