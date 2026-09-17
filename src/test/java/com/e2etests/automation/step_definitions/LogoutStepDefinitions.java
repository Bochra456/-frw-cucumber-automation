package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.e2etests.automation.page_objects.LogoutPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinitions {
	 private LogoutPage logoutPage;

	    public LogoutStepDefinitions() {
	        this.logoutPage = new LogoutPage();
	    }

	    @When("je clique sur le menu burger")
	    public void jeCliqueSurLeMenuBurger() {
	        logoutPage.clicBurgerMenu();
	    }

	    @And("je clique sur logout")
	    public void jeCliqueSurLogout() {
	        logoutPage.clicLogout();
	    }

	    @Then("je me redirige vers la page de connexion {string}")
	    public void jeMeRedirigeVersLaPageDeConnexion(String expectedLogo) {
	        String actualLogo = logoutPage.getLoginPageLogoText();
	        assertTrue(actualLogo.contains(expectedLogo));
	    }

	    @And("je clique sur about")
	    public void jeCliqueSurAbout() {
	        logoutPage.clicAbout();
	    }

	    @Then("je me redirige vers la page about")
	    public void jeMeRedirigeVersLaPageAbout() {
	        String currentUrl = logoutPage.getCurrentUrl();
	        assertTrue(currentUrl.contains("saucelabs.com"));
	    }
	}
