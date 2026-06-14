package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.e2etests.automation.page_objects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
	
	//public WebDriver driver;
	private LoginPage loginpage ;
	public LoginStepDefinitions() {
	//driver = Setup.getDriver();
	this.loginpage = new LoginPage();
	}

	@Given("je connecte sur la page de l application")
	public void jeConnecteSurLaPageDeLApplicationMercury() {
		loginpage.goToUrl();
	}

	@When("je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		loginpage.fillusername(name);
		
	}

	@When("je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		loginpage.fillpassword(password);
          
	}

	@When("je clique sur le bouton Submit")
	public void jeCliqueSurLeBoutonSubmit() {
		loginpage.clickbtnsubmit();
	}

	@Then("je me redirige vers la page d accueil {string}")
	public void jeMeRedirigeVersLaPageDAccueil(String text) {
		
		String message = LoginPage.welcomeMsg.getText();
		assertEquals(message, text);

	}

}
