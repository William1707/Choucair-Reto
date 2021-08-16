package co.com.choucair.retoAtomatizacion.stepdefinitions;

import co.com.choucair.retoAtomatizacion.model.UTestsData;
import co.com.choucair.retoAtomatizacion.questions.Answer;
import co.com.choucair.retoAtomatizacion.tasks.OpenUp;
import co.com.choucair.retoAtomatizacion.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairUTestStepDefinitions {
    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());}

    @Given("^than William wants to register on the UTest platform$")
    public void thanStevenWantsToRegisterOnTheUTestPlatform() {

        OnStage.theActorCalled("William").wasAbleTo(OpenUp.thePage());

    }

    @When("^you fill out the registration form$")
    public void youFillOutTheRegistrationForm( List<UTestsData> uTestsData) {

                OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage(uTestsData.get(0).getStrFirstName(),
                        uTestsData.get(0).getStrLastName(),
                        uTestsData.get(0).getStrEmail(),
                        uTestsData.get(0).getStrMonth(),
                        uTestsData.get(0).getStrDay(),
                        uTestsData.get(0).getStrYear(),
                        uTestsData.get(0).getStrCity(),
                        uTestsData.get(0).getStrPostalCode()));

    }


    @Then("^the new user will be created on the platform$")
    public void theNewUserWillBeCreatedOnThePlatform() {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));

    }
}
