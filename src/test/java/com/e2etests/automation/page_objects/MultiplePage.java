package com.e2etests.automation.page_objects;

    import java.time.Duration;
    import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
    import com.e2etests.automation.utils.ConfigFileReader;
    import com.e2etests.automation.utils.Setup;
    import org.openqa.selenium.JavascriptExecutor;



	public class MultiplePage {
		private ConfigFileReader configFileReader;
		
	    private WebDriverWait wait;
	    

	    public MultiplePage() {

	        PageFactory.initElements(Setup.getDriver(),this);

	        wait = new WebDriverWait(Setup.getDriver(),Duration.ofSeconds(10));
	              
	    }

	    @FindBy(xpath = "//input[@name='firstName']")
	    private WebElement firstname;

	    @FindBy(name = "lastName")
	    private WebElement lastname;

	    @FindBy(name = "userName")
	    private WebElement email;

	    @FindBy(name = "phone")
	    private WebElement phoneN;

	    @FindBy(name = "address1")
	    private WebElement AdresseX;

	    @FindBy(name = "city")
	    private WebElement city;

	    @FindBy(name = "state")
	    private WebElement province;

	    @FindBy(name = "postalCode")
	    private WebElement codepostale;

	    @FindBy(name = "country")
	    private WebElement country;

	    @FindBy(name = "email")
	    private WebElement username;

	    @FindBy(name = "password")
	    private WebElement passwordX;

	    @FindBy(name = "confirmPassword")
	    private WebElement confirmPasswordTXT;

	    @FindBy(name = "submit")
	    private WebElement envoyer;
	    
	    @FindBy(xpath = "//font[contains(text(),'Thank you for registering.')]")
		public WebElement succesSMsg;
	    
	    
	    /**Create Methods **/
		public void goToUrl() {
		
			    Setup.getDriver().get(configFileReader.getProperties("register.url"));

			    WebDriverWait wait = new WebDriverWait(
			            Setup.getDriver(),
			            Duration.ofSeconds(10));

			    wait.until(ExpectedConditions.urlContains("register"));
			
		}



	    public void fillFirstname(String firstName){

	        wait.until(ExpectedConditions.visibilityOf(firstname));
	        firstname.clear();
	        firstname.sendKeys(firstName);
	    }


	    public void fillLastname(String lastName ){

	        lastname.clear();
	        lastname.sendKeys(lastName);
	    }


	    public void fillemail(String username){

	        email.clear();
	        email.sendKeys(username);
	    }


	    public void fillPhone(String phone){

	        phoneN.clear();
	        phoneN.sendKeys(phone);
	    }


	    public void fillAdresseX(String adresse){

	        AdresseX.clear();
	        AdresseX.sendKeys(adresse);
	    }


	    public void fillCity(String cityX){

	        city.clear();
	        city.sendKeys(cityX);
	    }


	    public void fillProvince(String City){

	        province.clear();
	        province.sendKeys(City);
	    }


	    public void fillcodepostale(String codepostaleX){

	        codepostale.clear();
	        codepostale.sendKeys(codepostaleX);
	    }


	    public void fillCountry(String value){

	        Select select = new Select(country);
	        select.selectByValue(value);
	    }


	    public void fillUsername(String email){

	        username.clear();
	        username.sendKeys(email);
	    }


	    public void fillpassword(String passwordtxt){

	        passwordX.clear();
	        passwordX.sendKeys(passwordtxt);
	    }


	    public void confirmPasswordTXT(String ConfirmPassword){

	    	confirmPasswordTXT.clear();
	    	confirmPasswordTXT.sendKeys(ConfirmPassword);
	    }
	    
	    public void clickenvoyer(){
	        JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
	        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", envoyer);
	        js.executeScript("arguments[0].click();", envoyer);
	    }


	    public String getSuccesSMsg() {
	        return succesSMsg.getText();
	    }

	

	}


	


