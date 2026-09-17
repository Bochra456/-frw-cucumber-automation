
package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AuthentificationPage {

    private static final String SWAGLABS_URL = "https://www.saucedemo.com/";

    private ConfigFileReader configFileReader;

    /** @FindBy **/
    @FindBy(how = How.ID, using = "user-name")
    public static WebElement username;

    @FindBy(how = How.ID, using = "password")
    public static WebElement password;

    @FindBy(how = How.ID, using = "login-button")
    public static WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//span[@class='title']")
    public static WebElement titlePage;

    @FindBy(how = How.XPATH, using = "//h3[@data-test='error']")
    public static WebElement errorMessage;

    public AuthentificationPage() {
        PageFactory.initElements(Setup.getDriver(), this);
        this.configFileReader = new ConfigFileReader();
    }

    /** Create Methods login_valid **/
    public void login_valide() {
        Setup.getDriver().get(SWAGLABS_URL);
        username.clear();
        username.sendKeys(configFileReader.getProperties("home.username1"));
        password.clear();
        password.sendKeys(configFileReader.getProperties("home.password1"));
        loginButton.click();
    }

    /** login_invalid **/
    public void login_Invalide() {
        Setup.getDriver().get(SWAGLABS_URL);
        username.clear();
        username.sendKeys("standard_user");
        password.clear();
        password.sendKeys("123456");
        loginButton.click();
    }


	//public void goToUrl() {
//		Setup.getDriver().get(configFileReader.getProperties("home.url1"));
	//}
	//
	//public void fillUserName() {
//		username.clear();
//		username.sendKeys(configFileReader.getProperties("home.username1"));
	//}
//		public void fillPassword() {
//			password.clear();
//			password.sendKeys(configFileReader.getProperties("home.password1"));
	//}
//		public void clicLoginBtn() {
//			loginButton.click();
//		}
    
/** display the title of the page Products **/
public String getTitlePage() {
    return titlePage.getText();
}

/** display the error message **/
public String getErrorMessage() {
    return errorMessage.getText();
}
}




